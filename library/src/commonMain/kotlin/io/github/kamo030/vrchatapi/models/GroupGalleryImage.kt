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
 * @param id 
 * @param groupId 
 * @param galleryId 
 * @param fileId 
 * @param imageUrl 
 * @param createdAt 
 * @param submittedByUserId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param approved 
 * @param approvedByUserId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param approvedAt 
 */
@Serializable
data class GroupGalleryImage (

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "groupId") val groupId: kotlin.String? = null,

    @SerialName(value = "galleryId") val galleryId: kotlin.String? = null,

    @SerialName(value = "fileId") val fileId: kotlin.String? = null,

    @SerialName(value = "imageUrl") val imageUrl: kotlin.String? = null,

    @SerialName(value = "createdAt") val createdAt: kotlinx.datetime.Instant? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "submittedByUserId") val submittedByUserId: kotlin.String? = null,

    @SerialName(value = "approved") val approved: kotlin.Boolean? = false,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "approvedByUserId") val approvedByUserId: kotlin.String? = null,

    @SerialName(value = "approvedAt") val approvedAt: kotlinx.datetime.Instant? = null

) 

