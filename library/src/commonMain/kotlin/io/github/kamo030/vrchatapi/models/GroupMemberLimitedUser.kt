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
 * Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.
 *
 * @param id A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param displayName 
 * @param thumbnailUrl 
 * @param iconUrl 
 * @param profilePicOverride 
 * @param currentAvatarThumbnailImageUrl 
 * @param currentAvatarTags 
 */
@Serializable
data class GroupMemberLimitedUser (

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "displayName") val displayName: kotlin.String? = null,

    @SerialName(value = "thumbnailUrl") val thumbnailUrl: kotlin.String? = null,

    @SerialName(value = "iconUrl") val iconUrl: kotlin.String? = null,

    @SerialName(value = "profilePicOverride") val profilePicOverride: kotlin.String? = null,

    @SerialName(value = "currentAvatarThumbnailImageUrl") val currentAvatarThumbnailImageUrl: kotlin.String? = null,

    @SerialName(value = "currentAvatarTags") val currentAvatarTags: kotlin.collections.List<kotlin.String>? = null

) 

