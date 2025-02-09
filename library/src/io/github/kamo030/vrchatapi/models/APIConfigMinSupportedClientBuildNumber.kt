/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.github.kamo030.vrchatapi.models

import io.github.kamo030.vrchatapi.models.PlatformBuildInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Minimum supported client build number for various platforms
 *
 * @param appStore 
 * @param default 
 * @param firebase 
 * @param firebaseiOS 
 * @param googlePlay 
 * @param PC 
 * @param picoStore 
 * @param questAppLab 
 * @param questStore 
 * @param testFlight 
 * @param xrElite 
 */
@Serializable

data class APIConfigMinSupportedClientBuildNumber (

    @SerialName(value = "AppStore") @Required val appStore: PlatformBuildInfo,

    @SerialName(value = "Default") @Required val default: PlatformBuildInfo,

    @SerialName(value = "Firebase") @Required val firebase: PlatformBuildInfo,

    @SerialName(value = "FirebaseiOS") @Required val firebaseiOS: PlatformBuildInfo,

    @SerialName(value = "GooglePlay") @Required val googlePlay: PlatformBuildInfo,

    @SerialName(value = "PC") @Required val PC: PlatformBuildInfo,

    @SerialName(value = "PicoStore") @Required val picoStore: PlatformBuildInfo,

    @SerialName(value = "QuestAppLab") @Required val questAppLab: PlatformBuildInfo,

    @SerialName(value = "QuestStore") @Required val questStore: PlatformBuildInfo,

    @SerialName(value = "TestFlight") @Required val testFlight: PlatformBuildInfo,

    @SerialName(value = "XRElite") @Required val xrElite: PlatformBuildInfo

)

