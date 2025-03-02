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
 * @param platform TODO: Does this still exist?
 * @param requestMessage Used when using InviteMessage Slot.
 */
@Serializable
data class NotificationDetailRequestInvite (

    /* TODO: Does this still exist? */
    @SerialName(value = "platform") val platform: kotlin.String? = null,

    /* Used when using InviteMessage Slot. */
    @SerialName(value = "requestMessage") val requestMessage: kotlin.String? = null

) 

