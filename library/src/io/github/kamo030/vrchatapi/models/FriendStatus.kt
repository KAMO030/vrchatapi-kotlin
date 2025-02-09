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
 * @param incomingRequest 
 * @param isFriend 
 * @param outgoingRequest 
 */
@Serializable

data class FriendStatus (

    @SerialName(value = "incomingRequest") @Required val incomingRequest: kotlin.Boolean = false,

    @SerialName(value = "isFriend") @Required val isFriend: kotlin.Boolean = false,

    @SerialName(value = "outgoingRequest") @Required val outgoingRequest: kotlin.Boolean = false

)

