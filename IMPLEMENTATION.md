# Implementation Decisions

Gradle has been chosen as the build tool due to it nature of using a DSL language and extensible programmatically via Java, Kotlin or Groovy; It opens more opportunities for customizations compared with Maven that everything must be done via plugins (external), when Gradle allow us to just write a class with the functionality needed and voilà!


# Design

Configurations has been split in 3 parts

1. **adyen-conventions.gradle.kts** : configuration that looks like common was externalized as gradle plugin, for now and as a purpose of this assigment it has been configured as include build.
   This plugin contains a set of plugins that are always use across multiples project with its default configurations, very handy for portability and reuse, like:
   - Checkstyle
   - Jacoco
   - Java settings
   - and more

2. **build.gradle.kts** : configuration related to the module, in this case project only contains single module, like for example
   - dependencies
   - and some very specific configuration that only applies to this project

3. **adyen-openapi-generator.gradle.kts** : For the purpose to have clean code and a bit more organized, everything that is related to the generation of the models and services from api specs has been implemented as include build plugin to keep the build.gradle.kts short and clean.
    - It contains a bunch of gradle task definition for the purpose of mimic what has been done in the Makefile

