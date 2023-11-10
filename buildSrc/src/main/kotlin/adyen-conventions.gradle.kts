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
    withType<Jar> {
        if (name == "javadocJar" || name == "sourcesJar") {
            duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        }
    }
    withType<Test> {
        jvmArgs = listOf("-Duser.country=US", "-Duser.language=en")
    }
}

publishing {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])
//            versionMapping {
//                usage("java-api") {
//                    fromResolutionResult()
//                }
//                usage("java-runtime") {
//                    fromResolutionResult()
//                }
//            }
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
    repositories {
        maven {
            url = uri(layout.buildDirectory.dir("staging-deploy"))
        }
    }
}

//signing {
//    sign(publishing.publications["maven"])
//}
