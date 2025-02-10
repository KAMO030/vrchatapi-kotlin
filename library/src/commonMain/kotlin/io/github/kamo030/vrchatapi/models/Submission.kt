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
 * @param contentId Either world ID or avatar ID
 * @param createdAt 
 * @param description 
 * @param id 
 * @param jamId 
 * @param submitterId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param ratingScore 
 */
@Serializable
data class Submission (

    /* Either world ID or avatar ID */
    @SerialName(value = "contentId") @Required val contentId: kotlin.String,

    @SerialName(value = "created_at") @Required val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "jamId") @Required val jamId: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "submitterId") @Required val submitterId: kotlin.String,

    @SerialName(value = "ratingScore") val ratingScore: kotlin.Int? = null

) 

