import com.adyen.gradle.OpenApiGeneratorAuthorTemplateTask
import com.adyen.gradle.OpenApiGeneratorCloneSpec
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

tasks {
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