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
 * @param environment 
 * @param text 
 * @param warnings 
 * @param worldimage 
 * @param worldstore 
 */
@Serializable
data class APIConfigReportOptionsWorld (

    @SerialName(value = "environment") val environment: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "text") val text: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "warnings") val warnings: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "worldimage") val worldimage: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "worldstore") val worldstore: kotlin.collections.List<kotlin.String>? = null

)

