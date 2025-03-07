plugins {
    // This plugin is defined as include build, but it could actually be externalized as plugin
    // if there are common parts of it that can be re-used across other projects
    `adyen-conventions`
    `adyen-openapi-generator`

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
}
