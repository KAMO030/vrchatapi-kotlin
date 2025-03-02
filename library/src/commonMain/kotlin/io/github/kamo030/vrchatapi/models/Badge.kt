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
 * @param badgeDescription 
 * @param badgeId 
 * @param badgeImageUrl direct url to image
 * @param badgeName 
 * @param showcased 
 * @param assignedAt only present in CurrentUser badges
 * @param hidden only present in CurrentUser badges
 * @param updatedAt only present in CurrentUser badges
 */
@Serializable
data class Badge (

    @SerialName(value = "badgeDescription") @Required val badgeDescription: kotlin.String,

    @SerialName(value = "badgeId") @Required val badgeId: kotlin.String,

    /* direct url to image */
    @SerialName(value = "badgeImageUrl") @Required val badgeImageUrl: kotlin.String,

    @SerialName(value = "badgeName") @Required val badgeName: kotlin.String,

    @SerialName(value = "showcased") @Required val showcased: kotlin.Boolean,

    /* only present in CurrentUser badges */
    @SerialName(value = "assignedAt") val assignedAt: kotlinx.datetime.Instant? = null,

    /* only present in CurrentUser badges */
    @SerialName(value = "hidden") val hidden: kotlin.Boolean? = null,

    /* only present in CurrentUser badges */
    @SerialName(value = "updatedAt") val updatedAt: kotlinx.datetime.Instant? = null

) 

