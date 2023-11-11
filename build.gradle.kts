import com.adyen.gradle.OpenApiGeneratorAuthorTemplateTask
import com.adyen.gradle.OpenApiGeneratorCloneSpec
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    // This plugin is defined as include build, but it could actually be externalized as plugin
    // if there are common parts of it that can be re-used across other projects
    `adyen-conventions`

    // Plugin for BND (OSGI), it is the counterpart for the maven-bundle-plugin
    // I would like to use latest 7.0.0, but it requires minimum version of jvm to be 17
    // but since 11 still the minimum, then this version must be use
    id("biz.aQute.bnd.builder") version "6.4.0"

    id("com.github.kt3k.coveralls") version "2.12.2"
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.gson)
    api(libs.gson.fire)
    api(libs.jackson.databind)
    api(libs.jackson.datatype.jsr310)
    api(libs.jakarta.ws.rs.api)
    api(libs.jaxb.api)
    api(libs.httpclient5)
    api(libs.okio)
    api(libs.swagger.annotations)
    api(libs.swagger.v3.annotations)
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
}

publishing {
    publications {
        withType<MavenPublication>() {
            pom {
                developers {
                    developer {
                        name = "Esteban"
                        timezone = "Europe/Amsterdam"
                    }
                }
                scm {
                    connection = "scm:git:https://github.com/elopezvalecky/adyen-java-api-library.git"
                    developerConnection = "scm:git:git@github.com:Adyen/adyen-java-api-library.git"
                    url = project.providers.gradleProperty("url")
                }
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype {
            username = providers.environmentVariable("SONATYPE_USERNAME").orNull
            password = providers.environmentVariable("SONATYPE_PASSWORD").orNull
        }
    }
}

tasks {
    jar {
        bundle {
            bnd(mapOf(
                "Export-Package" to "com.adyen"
            ))
        }
    }
    jacocoTestReport {
        reports {
            xml.required = true // coveralls plugin depends on xml format report
            html.required = false
        }
    }
    // Shortcut to quickly update gradle version and wrapper as needed
    wrapper {
        gradleVersion = "latest"
        distributionType = Wrapper.DistributionType.BIN
    }

    // --------------------
    // Makefile alternative

    // alt to: make templates
    val authorTemplate = register<OpenApiGeneratorAuthorTemplateTask>("openapiAuthorTemplates") {
        group = "Adyen OpenAPI Tools"
        generator = "java"
        library = "jersey3"
        output = layout.buildDirectory.dir("templates")
    }
    // alt to: make target/spec
    val cloneSpec = register<OpenApiGeneratorCloneSpec>("openapiCloneSpec") {
        group = "Adyen OpenAPI Tools"
        apiSpecRepo = "https://github.com/Adyen/adyen-openapi.git"
        target = layout.buildDirectory.dir("spec")
    }

    // TODO: make a predefined list of models to generate and create subtasks from there

    // alt to: make models
    // where models is spec=BalanceControlService-v1
    val models = register<GenerateTask>("openapiModelBalanceControlService-v1") {
        dependsOn(cloneSpec)
        group = "Adyen OpenAPI Tools"
        inputSpec = cloneSpec.get().target.dir("json/BalanceControlService-v1.json").get().asFile.toString()
        generatorName = "java"
        templateDir = layout.projectDirectory.dir("templates").asFile.toString()
        outputDir = layout.buildDirectory.dir("out").get().asFile.toString()
        reservedWordsMappings = mapOf("configuration" to "configuration")
        //ignoreFileOverride = ".openapi-generator-ignore"
        skipValidateSpec = true
        modelPackage = "com.adyen.model.balancecontrol"
        library = "jersey3"
        globalProperties = mapOf(
                "modelDocs" to "false",
                "modelTests" to "false"
        )
        inlineSchemaNameMappings = mapOf(
                "PaymentRequest_paymentMethod" to "CheckoutPaymentMethod",
                "DonationPaymentRequest_paymentMethod" to "DonationPaymentMethod"
        )
        additionalProperties = mapOf(
                "dateLibrary" to "java8",
                "openApiNullable" to false,
                "resourceClass" to "$(resourceClass)Resource"
        )
    }

    // alt to: make
    register("openapiGenerator") {
        group = "Adyen OpenAPI Tools"
        dependsOn(authorTemplate, models)
    }
    // --------------------

}
