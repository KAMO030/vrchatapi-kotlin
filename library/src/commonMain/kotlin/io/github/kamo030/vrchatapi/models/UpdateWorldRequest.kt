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
 * @param assetUrl 
 * @param assetVersion 
 * @param authorId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param authorName 
 * @param capacity 
 * @param description 
 * @param imageUrl 
 * @param name 
 * @param platform This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.
 * @param releaseStatus 
 * @param tags  
 * @param unityPackageUrl 
 * @param unityVersion 
 */
@Serializable
data class UpdateWorldRequest (

    @SerialName(value = "assetUrl") val assetUrl: kotlin.String? = null,

    @SerialName(value = "assetVersion") val assetVersion: kotlin.String? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "authorId") val authorId: kotlin.String? = null,

    @SerialName(value = "authorName") val authorName: kotlin.String? = null,

    @SerialName(value = "capacity") val capacity: kotlin.Int? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "imageUrl") val imageUrl: kotlin.String? = null,

    @SerialName(value = "name") val name: kotlin.String? = null,

    /* This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`. */
    @SerialName(value = "platform") val platform: kotlin.String? = null,

    @SerialName(value = "releaseStatus") val releaseStatus: ReleaseStatus? = ReleaseStatus.Public,

    /*   */
    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "unityPackageUrl") val unityPackageUrl: kotlin.String? = null,

    @SerialName(value = "unityVersion") val unityVersion: kotlin.String? = "5.3.4p1"

) 

