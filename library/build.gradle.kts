import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.mavenPublish)
}

kotlin {

    js(IR) {
        nodejs()
        browser()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        nodejs()
        browser()
        binaries.executable()
    }

    jvm()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {

        commonMain.dependencies {
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.serialization.core)
            implementation(libs.kotlinx.datetime)
            api(libs.bundles.ktor.client)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.kotlin.test.junit)
            implementation(libs.ktor.client.logging)
        }

        jvmTest.dependencies {
            implementation(libs.ktor.client.okhttp)
        }

        all {
            languageSettings.apply {
                optIn("kotlin.Experimental")
            }
        }

    }
}

val publishVersion = properties["publish.versions"] as String

val publishGroup = properties["publish.group"] as String

mavenPublishing {
    coordinates(publishGroup, rootProject.name, publishVersion)
}
