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
 * @param ok 
 * @param serverName 
 * @param buildVersionTag 
 */
@Serializable
data class APIHealth (

    @SerialName(value = "ok") @Required val ok: kotlin.Boolean,

    @SerialName(value = "serverName") @Required val serverName: kotlin.String,

    @SerialName(value = "buildVersionTag") @Required val buildVersionTag: kotlin.String

) 

