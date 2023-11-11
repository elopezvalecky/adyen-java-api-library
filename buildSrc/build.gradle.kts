plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.openapitools:openapi-generator-cli:6.6.0")
    implementation("org.openapitools:openapi-generator-gradle-plugin:6.6.0")
    implementation("org.eclipse.jgit:org.eclipse.jgit:6.7.0.202309050840-r")
}