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
 * @param commenterId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param commenterName 
 * @param contentAuthorId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param contentAuthorName 
 * @param contentId 
 * @param contentType 
 * @param contentVersion 
 * @param id 
 * @param reason 
 * @param tags 
 * @param type 
 * @param contentName 
 * @param description 
 */
@Serializable

data class Feedback (

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "commenterId") @Required val commenterId: kotlin.String,

    @SerialName(value = "commenterName") @Required val commenterName: kotlin.String,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "contentAuthorId") @Required val contentAuthorId: kotlin.String,

    @SerialName(value = "contentAuthorName") @Required val contentAuthorName: kotlin.String?,

    @SerialName(value = "contentId") @Required val contentId: kotlin.String,

    @SerialName(value = "contentType") @Required val contentType: kotlin.String,

    @SerialName(value = "contentVersion") @Required val contentVersion: kotlin.Int?,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "reason") @Required val reason: kotlin.String,

    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "type") @Required val type: kotlin.String,

    @SerialName(value = "contentName") val contentName: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null

)

