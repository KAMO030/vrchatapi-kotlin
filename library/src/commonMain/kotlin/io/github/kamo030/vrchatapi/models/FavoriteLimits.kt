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

import io.github.kamo030.vrchatapi.models.FavoriteGroupLimits

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param defaultMaxFavoriteGroups 
 * @param defaultMaxFavoritesPerGroup 
 * @param maxFavoriteGroups 
 * @param maxFavoritesPerGroup 
 */
@Serializable
data class FavoriteLimits (

    @SerialName(value = "defaultMaxFavoriteGroups") @Required val defaultMaxFavoriteGroups: kotlin.Int,

    @SerialName(value = "defaultMaxFavoritesPerGroup") @Required val defaultMaxFavoritesPerGroup: kotlin.Int,

    @SerialName(value = "maxFavoriteGroups") @Required val maxFavoriteGroups: FavoriteGroupLimits,

    @SerialName(value = "maxFavoritesPerGroup") @Required val maxFavoritesPerGroup: FavoriteGroupLimits

) 

