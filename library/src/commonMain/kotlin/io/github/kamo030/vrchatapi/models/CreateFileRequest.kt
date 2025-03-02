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

import io.github.kamo030.vrchatapi.models.MIMEType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param name 
 * @param mimeType 
 * @param extension 
 * @param tags  
 */
@Serializable
data class CreateFileRequest (

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "mimeType") @Required val mimeType: MIMEType = MIMEType.ImageSlashJpeg,

    @SerialName(value = "extension") @Required val extension: kotlin.String,

    /*   */
    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null

)

