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

import io.github.kamo030.vrchatapi.models.DynamicContentRow
import io.github.kamo030.vrchatapi.models.InfoPushDataArticle
import io.github.kamo030.vrchatapi.models.InfoPushDataClickable

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param contentList 
 * @param description 
 * @param imageUrl 
 * @param name 
 * @param onPressed 
 * @param template 
 * @param version 
 * @param article 
 */
@Serializable
data class InfoPushData (

    @SerialName(value = "contentList") val contentList: DynamicContentRow? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "imageUrl") val imageUrl: kotlin.String? = null,

    @SerialName(value = "name") val name: kotlin.String? = null,

    @SerialName(value = "onPressed") val onPressed: InfoPushDataClickable? = null,

    @SerialName(value = "template") val template: kotlin.String? = null,

    @SerialName(value = "version") val version: kotlin.String? = null,

    @SerialName(value = "article") val article: InfoPushDataArticle? = null

)

