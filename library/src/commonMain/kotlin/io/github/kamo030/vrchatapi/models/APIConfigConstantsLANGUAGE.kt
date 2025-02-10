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
 * Language-related constants
 *
 * @param SPOKEN_LANGUAGE_OPTIONS Supported spoken language options
 */
@Serializable
data class APIConfigConstantsLANGUAGE (

    /* Supported spoken language options */
    @SerialName(value = "SPOKEN_LANGUAGE_OPTIONS") val SPOKEN_LANGUAGE_OPTIONS: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) 

