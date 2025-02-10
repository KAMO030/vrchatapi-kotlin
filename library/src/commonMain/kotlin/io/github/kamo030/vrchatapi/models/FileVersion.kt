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

import io.github.kamo030.vrchatapi.models.FileData
import io.github.kamo030.vrchatapi.models.FileStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param createdAt 
 * @param status 
 * @param version Incremental version counter, can only be increased.
 * @param deleted Usually only present if `true`
 * @param delta 
 * @param file 
 * @param signature 
 */
@Serializable
data class FileVersion (

    @SerialName(value = "created_at") @Required val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "status") @Required val status: FileStatus = FileStatus.Waiting,

    /* Incremental version counter, can only be increased. */
    @SerialName(value = "version") @Required val version: kotlin.Int = 0,

    /* Usually only present if `true` */
    @SerialName(value = "deleted") val deleted: kotlin.Boolean? = true,

    @SerialName(value = "delta") val delta: FileData? = null,

    @SerialName(value = "file") val file: FileData? = null,

    @SerialName(value = "signature") val signature: FileData? = null

) 

