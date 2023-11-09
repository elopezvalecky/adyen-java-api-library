plugins {
    checkstyle
    java
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.gson)
    implementation(libs.gson.fire)
    implementation(libs.jackson.databind)
    implementation(libs.jackson.datatype.jsr310)
    implementation(libs.jakarta.ws.rs.api)
    implementation(libs.jaxb.api)
    implementation(libs.httpclient5)
    implementation(libs.okio)
    implementation(libs.swagger.annotations)
    implementation(libs.swagger.v3.annotations)
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
}

checkstyle {
    toolVersion = "9.3"
    configFile = file(layout.projectDirectory.file("checkstyle.xml"))
    configProperties =  mapOf(
        "suppressionsFile" to file(layout.projectDirectory.file("checkstyle-suppressions.xml"))
    )
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

}

jacoco {
    version = "0.8.11"
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    // It reports too many errors compared with maven, but actually I think in maven it does not check test
    checkstyleTest {
        enabled = false
    }
    test {
    }
    // Shortcut to quickly update gradle version and wrapper as needed via
    // - `gradle wrapper`
    // OR
    // - `./gradlew wrapper`
    wrapper {
        gradleVersion = "latest"
        distributionType = Wrapper.DistributionType.BIN
    }
}