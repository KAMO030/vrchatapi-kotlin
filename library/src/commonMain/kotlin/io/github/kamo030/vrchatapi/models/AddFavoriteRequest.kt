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

import io.github.kamo030.vrchatapi.models.FavoriteType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type 
 * @param favoriteId Must be either AvatarID, WorldID or UserID.
 * @param tags Tags indicate which group this favorite belongs to. Adding multiple groups makes it show up in all. Removing it from one in that case removes it from all.
 */
@Serializable
data class AddFavoriteRequest (

    @SerialName(value = "type") @Required val type: FavoriteType = FavoriteType.Friend,

    /* Must be either AvatarID, WorldID or UserID. */
    @SerialName(value = "favoriteId") @Required val favoriteId: kotlin.String,

    /* Tags indicate which group this favorite belongs to. Adding multiple groups makes it show up in all. Removing it from one in that case removes it from all. */
    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>

)

