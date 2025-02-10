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

import io.github.kamo030.vrchatapi.models.FavoriteGroupVisibility
import io.github.kamo030.vrchatapi.models.FavoriteType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param displayName 
 * @param id 
 * @param name 
 * @param ownerDisplayName 
 * @param ownerId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param tags  
 * @param type 
 * @param visibility 
 */
@Serializable
data class FavoriteGroup (

    @SerialName(value = "displayName") @Required val displayName: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "ownerDisplayName") @Required val ownerDisplayName: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "ownerId") @Required val ownerId: kotlin.String,

    /*   */
    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "type") @Required val type: FavoriteType = FavoriteType.Friend,

    @SerialName(value = "visibility") @Required val visibility: FavoriteGroupVisibility = FavoriteGroupVisibility.Private

) 

