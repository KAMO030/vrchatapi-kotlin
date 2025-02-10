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

import io.github.kamo030.vrchatapi.models.DeveloperType
import io.github.kamo030.vrchatapi.models.UserStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param developerType 
 * @param displayName 
 * @param id A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param isFriend 
 * @param lastPlatform This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.
 * @param status 
 * @param statusDescription 
 * @param tags <- Always empty.
 * @param bio 
 * @param bioLinks  
 * @param currentAvatarImageUrl When profilePicOverride is not empty, use it instead.
 * @param currentAvatarThumbnailImageUrl When profilePicOverride is not empty, use it instead.
 * @param currentAvatarTags 
 * @param fallbackAvatar 
 * @param lastLogin 
 * @param profilePicOverride 
 * @param pronouns 
 * @param userIcon 
 * @param username -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).
 * @param location 
 * @param friendKey 
 */
@Serializable
data class LimitedUser (

    @SerialName(value = "developerType") @Required val developerType: DeveloperType = DeveloperType.None,

    @SerialName(value = "displayName") @Required val displayName: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "isFriend") @Required val isFriend: kotlin.Boolean,

    /* This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`. */
    @SerialName(value = "last_platform") @Required val lastPlatform: kotlin.String,

    @SerialName(value = "status") @Required val status: UserStatus = UserStatus.Offline,

    @SerialName(value = "statusDescription") @Required val statusDescription: kotlin.String,

    /* <- Always empty. */
    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "bio") val bio: kotlin.String? = null,

    /*   */
    @SerialName(value = "bioLinks") val bioLinks: kotlin.collections.List<kotlin.String>? = null,

    /* When profilePicOverride is not empty, use it instead. */
    @SerialName(value = "currentAvatarImageUrl") val currentAvatarImageUrl: kotlin.String? = null,

    /* When profilePicOverride is not empty, use it instead. */
    @SerialName(value = "currentAvatarThumbnailImageUrl") val currentAvatarThumbnailImageUrl: kotlin.String? = null,

    @SerialName(value = "currentAvatarTags") val currentAvatarTags: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "fallbackAvatar") val fallbackAvatar: kotlin.String? = null,

    @SerialName(value = "last_login") val lastLogin: kotlinx.datetime.Instant? = null,

    @SerialName(value = "profilePicOverride") val profilePicOverride: kotlin.String? = null,

    @SerialName(value = "pronouns") val pronouns: kotlin.String? = null,

    @SerialName(value = "userIcon") val userIcon: kotlin.String? = null,

    /* -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "username") val username: kotlin.String? = null,

    @SerialName(value = "location") val location: kotlin.String? = null,

    @SerialName(value = "friendKey") val friendKey: kotlin.String? = null

) 

