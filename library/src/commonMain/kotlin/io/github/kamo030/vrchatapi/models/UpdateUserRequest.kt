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

import io.github.kamo030.vrchatapi.models.UserStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param email 
 * @param birthday 
 * @param acceptedTOSVersion 
 * @param tags  
 * @param status 
 * @param statusDescription 
 * @param bio 
 * @param bioLinks 
 * @param pronouns 
 * @param isBoopingEnabled 
 * @param userIcon MUST be a valid VRChat /file/ url.
 */
@Serializable
data class UpdateUserRequest (

    @SerialName(value = "email") val email: kotlin.String? = null,

    @SerialName(value = "birthday") val birthday: kotlinx.datetime.LocalDate? = null,

    @SerialName(value = "acceptedTOSVersion") val acceptedTOSVersion: kotlin.Int? = null,

    /*   */
    @SerialName(value = "tags") val tags: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "status") val status: UserStatus? = UserStatus.Offline,

    @SerialName(value = "statusDescription") val statusDescription: kotlin.String? = null,

    @SerialName(value = "bio") val bio: kotlin.String? = null,

    @SerialName(value = "bioLinks") val bioLinks: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "pronouns") val pronouns: kotlin.String? = null,

    @SerialName(value = "isBoopingEnabled") val isBoopingEnabled: kotlin.Boolean? = null,

    /* MUST be a valid VRChat /file/ url. */
    @SerialName(value = "userIcon") val userIcon: kotlin.String? = null

)

