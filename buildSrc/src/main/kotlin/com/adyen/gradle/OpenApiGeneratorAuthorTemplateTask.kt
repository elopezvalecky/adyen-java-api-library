package com.adyen.gradle

import io.airlift.airline.Cli
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property
import org.openapitools.codegen.Constants.CLI_NAME
import org.openapitools.codegen.cmd.AuthorTemplate
import org.openapitools.codegen.cmd.OpenApiGeneratorCommand
import java.io.IOException

@CacheableTask
open class OpenApiGeneratorAuthorTemplateTask : DefaultTask() {

    @get:Input
    val generator = project.objects.property<String>()

    @get:Input
    val library = project.objects.property<String>()

    @get:OutputDirectory
    val output = project.objects.directoryProperty()

    @TaskAction
    fun run() {
        /*
         * Quick and dirty workaround to expose the `author template` command from the openapi-generator-cli as Gradle task
         * Source: https://github.com/OpenAPITools/openapi-generator/blob/v6.6.0/modules/openapi-generator-cli/src/main/java/org/openapitools/codegen/cmd/AuthorTemplate.java
         */
        try{
            Cli.builder<OpenApiGeneratorCommand>(CLI_NAME)
                .withCommands(AuthorTemplate::class.java)
                .build()
                .parse(listOf("template", "-g", generator.get(), "--library", library.get(), "-o", output.get().toString()))
                .run()
        } catch (e: IOException) {
            logger.error(e.message)
            throw GradleException("Can't perform author templates task", e)
        }
    }
}