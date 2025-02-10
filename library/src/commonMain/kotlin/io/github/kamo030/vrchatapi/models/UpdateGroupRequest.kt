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

import io.github.kamo030.vrchatapi.models.GroupJoinState

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param name 
 * @param shortCode 
 * @param description 
 * @param joinState 
 * @param iconId 
 * @param bannerId 
 * @param languages 3 letter language code
 * @param links 
 * @param rules 
 * @param tags  
 */
@Serializable
data class UpdateGroupRequest (

    @SerialName(value = "name") val name: kotlin.String? = null,

    @SerialName(value = "shortCode") val shortCode: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "joinState") val joinState: GroupJoinState? = GroupJoinState.Open,

    @SerialName(value = "iconId") val iconId: kotlin.String? = null,

    @SerialName(value = "bannerId") val bannerId: kotlin.String? = null,

    /* 3 letter language code */
    @SerialName(value = "languages") val languages: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "links") val links: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "rules") val rules: kotlin.String? = null,

    /*   */
    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null

) 

