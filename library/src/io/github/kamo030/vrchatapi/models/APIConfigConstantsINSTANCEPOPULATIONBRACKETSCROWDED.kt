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
 * Crowded population range
 *
 * @param max Maximum population for a crowded instance
 * @param min Minimum population for a crowded instance
 */
@Serializable

data class APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED (

    /* Maximum population for a crowded instance */
    @SerialName(value = "max") val max: kotlin.Int? = null,

    /* Minimum population for a crowded instance */
    @SerialName(value = "min") val min: kotlin.Int? = null

)

