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

import io.github.kamo030.vrchatapi.models.Instance

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param fetchedAt 
 * @param instances 
 */
@Serializable
data class GetUserGroupInstances200Response (

    @SerialName(value = "fetchedAt") val fetchedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "instances") val instances: kotlin.collections.List<Instance>? = null

) 

