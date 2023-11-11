package com.adyen.gradle

import org.eclipse.jgit.api.Git
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property
import org.openapitools.codegen.languages.ScalaSttpClientCodegen.Property
import java.io.IOException

open class OpenApiGeneratorCloneSpec: DefaultTask() {

    @get:Input
    val apiSpecRepo = project.objects.property<String>()

    @get:OutputDirectory
    val target = project.objects.directoryProperty()

    @TaskAction
    fun run() {
        try {
            if (!target.get().asFile.exists()) {
                Git.cloneRepository()
                        .setNoTags()
                        .setDirectory(target.get().asFile)
                        .setURI(apiSpecRepo.get())
                        .call()
            }
        } catch (e: IOException) {
            logger.error(e.message)
            throw GradleException("Can't perform models task", e)
        }
    }

}
