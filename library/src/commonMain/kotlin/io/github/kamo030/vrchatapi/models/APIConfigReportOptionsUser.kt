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
 * @param behavior 
 * @param chat 
 * @param emoji 
 * @param image 
 * @param sticker 
 * @param text 
 */
@Serializable
data class APIConfigReportOptionsUser (

    @SerialName(value = "behavior") val behavior: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "chat") val chat: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "emoji") val emoji: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "image") val image: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "sticker") val sticker: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "text") val text: kotlin.collections.List<kotlin.String>? = null

) 

