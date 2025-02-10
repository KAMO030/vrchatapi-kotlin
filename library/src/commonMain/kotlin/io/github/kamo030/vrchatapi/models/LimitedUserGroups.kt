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
 * @param name 
 * @param shortCode 
 * @param discriminator 
 * @param description 
 * @param iconId 
 * @param iconUrl 
 * @param bannerId 
 * @param bannerUrl 
 * @param privacy 
 * @param lastPostCreatedAt 
 * @param ownerId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param memberCount 
 * @param groupId 
 * @param memberVisibility 
 * @param isRepresenting 
 * @param mutualGroup 
 * @param lastPostReadAt 
 */
@Serializable
data class LimitedUserGroups (

    @SerialName(value = "id") val id: kotlin.String? = null,

    @SerialName(value = "name") val name: kotlin.String? = null,

    @SerialName(value = "shortCode") val shortCode: kotlin.String? = null,

    @SerialName(value = "discriminator") val discriminator: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "iconId") val iconId: kotlin.String? = null,

    @SerialName(value = "iconUrl") val iconUrl: kotlin.String? = null,

    @SerialName(value = "bannerId") val bannerId: kotlin.String? = null,

    @SerialName(value = "bannerUrl") val bannerUrl: kotlin.String? = null,

    @SerialName(value = "privacy") val privacy: kotlin.String? = null,

    @SerialName(value = "lastPostCreatedAt") val lastPostCreatedAt: kotlinx.datetime.Instant? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "ownerId") val ownerId: kotlin.String? = null,

    @SerialName(value = "memberCount") val memberCount: kotlin.Int? = null,

    @SerialName(value = "groupId") val groupId: kotlin.String? = null,

    @SerialName(value = "memberVisibility") val memberVisibility: kotlin.String? = null,

    @SerialName(value = "isRepresenting") val isRepresenting: kotlin.Boolean? = null,

    @SerialName(value = "mutualGroup") val mutualGroup: kotlin.Boolean? = null,

    @SerialName(value = "lastPostReadAt") val lastPostReadAt: kotlinx.datetime.Instant? = null

)

