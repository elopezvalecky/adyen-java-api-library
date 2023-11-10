plugins {
    // This plugin is defined as include build, but it could actually be externalized as plugin
    // if there are common parts of it that can be re-used across other projects
    `adyen-conventions`

    // Plugin for BND (OSGI), it is the counterpart for the maven-bundle-plugin
    // I would like to use latest 7.0.0, but it requires minimum version of jvm to be 17
    // but since 11 still the minimum, then this version must be use
    id("biz.aQute.bnd.builder") version "6.4.0"
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
        with(maybeCreate<MavenPublication>("maven")) {
            pom {
                developers {
                    developer {
                        name = "Esteban"
                        timezone = "Europe/Amsterdam"
                    }
                }
                scm {
                    connection = "scm:git:git@github.com:Adyen/adyen-java-api-library.git"
                    developerConnection = "scm:git:git@github.com:Adyen/adyen-java-api-library.git"
                    url = project.providers.gradleProperty("url")
                }
            }
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
    // Shortcut to quickly update gradle version and wrapper as needed
    wrapper {
        gradleVersion = "latest"
        distributionType = Wrapper.DistributionType.BIN
    }
}
