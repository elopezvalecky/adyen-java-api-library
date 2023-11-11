/*
 * Adyen's Conventions
 * Set of common and default configuration applicable out of the box for any Gradle project under Adyen's ecosystems.
 *
 * TODO: For real re-use into many other projects/repositories this should be externalized as Gradle Plugin in a separate repository
 */
plugins {
    checkstyle
    `java-library`
    jacoco
    `maven-publish`
    signing
}

repositories {
    gradlePluginPortal()
}

checkstyle {
    toolVersion = "10.3.3"
    configFile = file(layout.projectDirectory.file("checkstyle.xml"))
    configProperties =  mapOf(
            "suppressionsFile" to file(layout.projectDirectory.file("checkstyle-suppressions.xml"))
    )
}

jacoco {
    toolVersion = "0.8.11"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withJavadocJar()
    withSourcesJar()
}

tasks {
    // It reports too many errors compared with maven, but actually I think in maven it does not check test
    checkstyleTest {
        enabled = false
    }
    jacocoTestReport {
        dependsOn(test)
    }
    withType<JavaCompile> {
        options.compilerArgs = listOf("-parameters")
        options.encoding = "UTF-8"
    }
    withType<Javadoc> {
        options.source = JavaVersion.VERSION_1_8.toString()
        options.encoding = "UTF-8"
    }
    withType<Test> {
        jvmArgs = listOf("-Duser.country=US", "-Duser.language=en")
    }
}

publishing {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name = project.providers.gradleProperty("title")
                description = project.providers.gradleProperty("description")
                url = project.providers.gradleProperty("url")
                licenses {
                    license {
                        name = "MIT"
                        url = "https://choosealicense.com/licenses/mit/"
                    }
                }
                developers {
                    developer {
                        name = "Adyen"
                        email = "plugin@adyen.com"
                        organization = "Adyen"
                        organizationUrl = "https://www.adyen.com"
                    }
                }
            }
        }
    }
    // To not push anything to Maven Central
    repositories {
        maven {
            url = uri(layout.buildDirectory.dir("staging-deploy"))
        }
    }
}

if (providers.environmentVariable("CI").getOrElse("false").toBoolean()) {
    signing {
        useInMemoryPgpKeys(providers.environmentVariable("GPG_PRIVATE_KEY").get(), providers.environmentVariable("GPG_PASSPHRASE").get())
        sign(publishing.publications["maven"])
    }
}
