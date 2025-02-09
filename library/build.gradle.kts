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
            api(libs.ktor.client.core)
            api(libs.ktor.client.content.negotiation)
            api(libs.ktor.serialization.kotlinx.json)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
//            implementation(libs.kotlinx.coroutines.test)
            implementation(libs.ktor.client.logging)
        }

        jvmTest.dependencies {
            implementation(libs.ktor.client.okhttp)
        }

    }
}