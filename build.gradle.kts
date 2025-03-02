plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinxSerialization) apply false
    alias(libs.plugins.mavenPublish) apply false
    alias(libs.plugins.openapi.generator)
}

openApiGenerate {
    generatorName = "kotlin"
    remoteInputSpec = "https://raw.githubusercontent.com/vrchatapi/specification/gh-pages/openapi.yaml"
    outputDir = "generated"
    groupId = "io.github.kamo030.vrchatapi"
    packageName = "io.github.kamo030.vrchatapi"
    gitHost = "github.com"
    gitUserId = "kamo030"
    gitRepoId = "vrchatapi-kotlin"
    configOptions = mapOf(
        "library" to "multiplatform",
        "enumPropertyNaming" to "PascalCase",
        "sourceFolder" to "library/src/commonMain/kotlin",
        "testFolder" to "library/src/jvmTest/kotlin",
        "artifactId" to "vrchatapi-kotlin",
        "licenseName" to "MIT",
        "licenseUrl" to "https://github.com/kamo030/vrchatapi-kotlin/blob/main/LICENSE",
        "developerEmail" to "kamosama.dev@gmail.com",
        "developerName" to "KAMOsama",
        "serializationLibrary" to "kotlinx_serialization",
        "dateLibrary" to "kotlinx-datetime",
    )
}