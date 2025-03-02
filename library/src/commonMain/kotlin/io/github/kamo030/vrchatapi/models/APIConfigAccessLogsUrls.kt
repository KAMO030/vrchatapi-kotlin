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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param default 
 * @param pico 
 * @param quest 
 * @param xrElite 
 */
@Serializable
data class APIConfigAccessLogsUrls (

    @SerialName(value = "Default") val default: kotlin.String? = null,

    @SerialName(value = "Pico") val pico: kotlin.String? = null,

    @SerialName(value = "Quest") val quest: kotlin.String? = null,

    @SerialName(value = "XRElite") val xrElite: kotlin.String? = null

)

