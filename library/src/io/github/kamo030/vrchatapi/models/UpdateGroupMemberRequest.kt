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

import io.github.kamo030.vrchatapi.models.GroupUserVisibility

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param visibility 
 * @param isSubscribedToAnnouncements 
 * @param managerNotes 
 */
@Serializable

data class UpdateGroupMemberRequest (

    @SerialName(value = "visibility") val visibility: GroupUserVisibility? = null,

    @SerialName(value = "isSubscribedToAnnouncements") val isSubscribedToAnnouncements: kotlin.Boolean? = null,

    @SerialName(value = "managerNotes") val managerNotes: kotlin.String? = null

)

