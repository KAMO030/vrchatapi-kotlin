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

import io.github.kamo030.vrchatapi.models.GroupGallery
import io.github.kamo030.vrchatapi.models.GroupJoinState
import io.github.kamo030.vrchatapi.models.GroupMemberStatus
import io.github.kamo030.vrchatapi.models.GroupMyMember
import io.github.kamo030.vrchatapi.models.GroupPrivacy
import io.github.kamo030.vrchatapi.models.GroupRole

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param ageVerificationSlotsAvailable 
 * @param ageVerificationBetaCode 
 * @param ageVerificationBetaSlots 
 * @param badges 
 * @param id 
 * @param name 
 * @param shortCode 
 * @param discriminator 
 * @param description 
 * @param iconUrl 
 * @param bannerUrl 
 * @param privacy 
 * @param ownerId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param rules 
 * @param links 
 * @param languages 
 * @param iconId 
 * @param bannerId 
 * @param memberCount 
 * @param memberCountSyncedAt 
 * @param isVerified 
 * @param joinState 
 * @param tags 
 * @param transferTargetId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param galleries 
 * @param createdAt 
 * @param updatedAt 
 * @param lastPostCreatedAt 
 * @param onlineMemberCount 
 * @param membershipStatus 
 * @param myMember 
 * @param roles Only returned if ?includeRoles=true is specified.
 */
@Serializable
data class Group (

    @SerialName(value = "ageVerificationSlotsAvailable") val ageVerificationSlotsAvailable: kotlin.Boolean? = null,

    @SerialName(value = "ageVerificationBetaCode") val ageVerificationBetaCode: kotlin.String? = null,

    @SerialName(value = "ageVerificationBetaSlots") val ageVerificationBetaSlots: kotlin.Double? = null,

    @SerialName(value = "badges") val badges: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "name") val name: kotlin.String? = null,

    @SerialName(value = "shortCode") val shortCode: kotlin.String? = null,

    @SerialName(value = "discriminator") val discriminator: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "iconUrl") val iconUrl: kotlin.String? = null,

    @SerialName(value = "bannerUrl") val bannerUrl: kotlin.String? = null,

    @SerialName(value = "privacy") val privacy: GroupPrivacy? = GroupPrivacy.Default,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "ownerId") val ownerId: kotlin.String? = null,

    @SerialName(value = "rules") val rules: kotlin.String? = null,

    @SerialName(value = "links") val links: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "languages") val languages: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "iconId") val iconId: kotlin.String? = null,

    @SerialName(value = "bannerId") val bannerId: kotlin.String? = null,

    @SerialName(value = "memberCount") val memberCount: kotlin.Int? = null,

    @SerialName(value = "memberCountSyncedAt") val memberCountSyncedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "isVerified") val isVerified: kotlin.Boolean? = false,

    @SerialName(value = "joinState") val joinState: GroupJoinState? = GroupJoinState.Open,

    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "transferTargetId") val transferTargetId: kotlin.String? = null,

    @SerialName(value = "galleries") val galleries: kotlin.collections.List<GroupGallery>? = null,

    @SerialName(value = "createdAt") val createdAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "updatedAt") val updatedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "lastPostCreatedAt") val lastPostCreatedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "onlineMemberCount") val onlineMemberCount: kotlin.Int? = null,

    @SerialName(value = "membershipStatus") val membershipStatus: GroupMemberStatus? = GroupMemberStatus.Inactive,

    @SerialName(value = "myMember") val myMember: GroupMyMember? = null,

    /* Only returned if ?includeRoles=true is specified. */
    @SerialName(value = "roles") val roles: kotlin.collections.List<GroupRole>? = null

)

