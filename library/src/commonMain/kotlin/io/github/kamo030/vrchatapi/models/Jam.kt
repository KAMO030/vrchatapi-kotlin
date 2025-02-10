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

import io.github.kamo030.vrchatapi.models.JamStateChangeDates

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param description 
 * @param id 
 * @param isVisible 
 * @param moreInfo 
 * @param state One of: - submissions_open - closed
 * @param stateChangeDates 
 * @param submissionContentGateDate 
 * @param submissionContentGated 
 * @param title 
 * @param updatedAt 
 */
@Serializable
data class Jam (

    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "isVisible") @Required val isVisible: kotlin.Boolean,

    @SerialName(value = "moreInfo") @Required val moreInfo: kotlin.String,

    /* One of: - submissions_open - closed */
    @SerialName(value = "state") @Required val state: kotlin.String,

    @SerialName(value = "stateChangeDates") @Required val stateChangeDates: JamStateChangeDates,

    @SerialName(value = "submissionContentGateDate") @Required val submissionContentGateDate: kotlinx.datetime.Instant?,

    @SerialName(value = "submissionContentGated") @Required val submissionContentGated: kotlin.Boolean,

    @SerialName(value = "title") @Required val title: kotlin.String,

    @SerialName(value = "updated_at") @Required val updatedAt: kotlinx.datetime.Instant

) 

