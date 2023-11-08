rootProject.name = "adyen-java-api-library"

// Temporary for disabling cache on local development to force gradle run all phases, but
// we want CI run fast
buildCache {
    local {
        isEnabled = settings.providers.environmentVariable("CI").map(String::toBoolean).getOrElse(false)
    }
}
