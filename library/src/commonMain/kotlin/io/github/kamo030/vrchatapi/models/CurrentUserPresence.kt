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
 * @param avatarThumbnail 
 * @param currentAvatarTags 
 * @param displayName 
 * @param groups 
 * @param id A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param instance 
 * @param instanceType either an InstanceType or an empty string
 * @param isRejoining 
 * @param platform either a Platform or an empty string
 * @param profilePicOverride 
 * @param status either a UserStatus or empty string
 * @param travelingToInstance 
 * @param travelingToWorld WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param userIcon 
 * @param world WorldID be \"offline\" on User profiles if you are not friends with that user.
 */
@Serializable
data class CurrentUserPresence (

    @SerialName(value = "avatarThumbnail") val avatarThumbnail: kotlin.String? = null,

    @SerialName(value = "currentAvatarTags") val currentAvatarTags: kotlin.String? = null,

    @SerialName(value = "displayName") val displayName: kotlin.String? = null,

    @SerialName(value = "groups") val groups: kotlin.collections.List<kotlin.String>? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "instance") val instance: kotlin.String? = null,

    /* either an InstanceType or an empty string */
    @SerialName(value = "instanceType") val instanceType: kotlin.String? = null,

    @SerialName(value = "isRejoining") val isRejoining: kotlin.String? = null,

    /* either a Platform or an empty string */
    @SerialName(value = "platform") val platform: kotlin.String? = null,

    @SerialName(value = "profilePicOverride") val profilePicOverride: kotlin.String? = null,

    /* either a UserStatus or empty string */
    @SerialName(value = "status") val status: kotlin.String? = null,

    @SerialName(value = "travelingToInstance") val travelingToInstance: kotlin.String? = null,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "travelingToWorld") val travelingToWorld: kotlin.String? = null,

    @SerialName(value = "userIcon") val userIcon: kotlin.String? = null,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "world") val world: kotlin.String? = null

) 

