plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinxSerialization) apply false
    alias(libs.plugins.mavenPublish)
}

val lib = libs

val publishVersion = properties["publish.versions"] as String

val publishGroup = properties["publish.group"] as String

subprojects {

//    mavenPublishing {
//        coordinates(publishGroup, name, publishVersion)
//    }

}