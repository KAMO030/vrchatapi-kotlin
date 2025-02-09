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
 * @param distanceClose Unknown
 * @param distanceFactor Unknown
 * @param distanceFar Unknown
 * @param groupDistance Unknown
 * @param maximumBunchSize Unknown
 * @param notVisibleFactor Unknown
 * @param playerOrderBucketSize Unknown
 * @param playerOrderFactor Unknown
 * @param slowUpdateFactorThreshold Unknown
 * @param viewSegmentLength Unknown
 */
@Serializable

data class APIConfigEvents (

    /* Unknown */
    @SerialName(value = "distanceClose") @Required val distanceClose: kotlin.Int,

    /* Unknown */
    @SerialName(value = "distanceFactor") @Required val distanceFactor: kotlin.Int,

    /* Unknown */
    @SerialName(value = "distanceFar") @Required val distanceFar: kotlin.Int,

    /* Unknown */
    @SerialName(value = "groupDistance") @Required val groupDistance: kotlin.Int,

    /* Unknown */
    @SerialName(value = "maximumBunchSize") @Required val maximumBunchSize: kotlin.Int,

    /* Unknown */
    @SerialName(value = "notVisibleFactor") @Required val notVisibleFactor: kotlin.Int,

    /* Unknown */
    @SerialName(value = "playerOrderBucketSize") @Required val playerOrderBucketSize: kotlin.Int,

    /* Unknown */
    @SerialName(value = "playerOrderFactor") @Required val playerOrderFactor: kotlin.Int,

    /* Unknown */
    @SerialName(value = "slowUpdateFactorThreshold") @Required val slowUpdateFactorThreshold: kotlin.Int,

    /* Unknown */
    @SerialName(value = "viewSegmentLength") @Required val viewSegmentLength: kotlin.Int

)

