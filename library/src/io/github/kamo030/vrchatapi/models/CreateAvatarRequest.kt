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

import io.github.kamo030.vrchatapi.models.ReleaseStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param name 
 * @param imageUrl 
 * @param assetUrl 
 * @param id 
 * @param description 
 * @param tags  
 * @param releaseStatus 
 * @param version 
 * @param unityPackageUrl 
 * @param unityVersion 
 */
@Serializable

data class CreateAvatarRequest (

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "imageUrl") @Required val imageUrl: kotlin.String,

    @SerialName(value = "assetUrl") val assetUrl: kotlin.String? = null,

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    /*   */
    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "releaseStatus") val releaseStatus: ReleaseStatus? = ReleaseStatus.Public,

    @SerialName(value = "version") val version: kotlin.Int? = 1,

    @SerialName(value = "unityPackageUrl") val unityPackageUrl: kotlin.String? = null,

    @SerialName(value = "unityVersion") val unityVersion: kotlin.String? = "5.3.4p1"

)

