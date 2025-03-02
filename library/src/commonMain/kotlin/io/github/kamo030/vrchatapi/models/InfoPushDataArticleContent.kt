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

import io.github.kamo030.vrchatapi.models.InfoPushDataClickable

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param text 
 * @param imageUrl 
 * @param onPressed 
 */
@Serializable
data class InfoPushDataArticleContent (

    @SerialName(value = "text") val text: kotlin.String? = null,

    @SerialName(value = "imageUrl") val imageUrl: kotlin.String? = null,

    @SerialName(value = "onPressed") val onPressed: InfoPushDataClickable? = null

) 

