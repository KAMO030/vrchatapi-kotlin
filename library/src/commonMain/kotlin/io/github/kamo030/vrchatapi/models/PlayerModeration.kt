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

import io.github.kamo030.vrchatapi.models.PlayerModerationType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param created 
 * @param id 
 * @param sourceDisplayName 
 * @param sourceUserId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param targetDisplayName 
 * @param targetUserId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param type 
 */
@Serializable
data class PlayerModeration (

    @SerialName(value = "created") @Required val created: kotlinx.datetime.Instant,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "sourceDisplayName") @Required val sourceDisplayName: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "sourceUserId") @Required val sourceUserId: kotlin.String,

    @SerialName(value = "targetDisplayName") @Required val targetDisplayName: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "targetUserId") @Required val targetUserId: kotlin.String,

    @SerialName(value = "type") @Required val type: PlayerModerationType = PlayerModerationType.Unmute

) 

