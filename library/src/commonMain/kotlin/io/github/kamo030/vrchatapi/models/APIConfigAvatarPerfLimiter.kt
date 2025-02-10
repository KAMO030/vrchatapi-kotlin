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

import io.github.kamo030.vrchatapi.models.PerformanceLimiterInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param androidMobile 
 * @param PC 
 * @param pico 
 * @param quest 
 * @param xrElite 
 * @param iOSMobile 
 */
@Serializable
data class APIConfigAvatarPerfLimiter (

    @SerialName(value = "AndroidMobile") @Required val androidMobile: PerformanceLimiterInfo,

    @SerialName(value = "PC") @Required val PC: PerformanceLimiterInfo,

    @SerialName(value = "Pico") @Required val pico: PerformanceLimiterInfo,

    @SerialName(value = "Quest") @Required val quest: PerformanceLimiterInfo,

    @SerialName(value = "XRElite") @Required val xrElite: PerformanceLimiterInfo,

    @SerialName(value = "iOSMobile") @Required val iOSMobile: PerformanceLimiterInfo

) 

