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
 * @param inResponseTo 
 * @param responseMessage 
 */
@Serializable

data class NotificationDetailInviteResponse (

    @SerialName(value = "inResponseTo") @Required val inResponseTo: kotlin.String,

    @SerialName(value = "responseMessage") @Required val responseMessage: kotlin.String

)

