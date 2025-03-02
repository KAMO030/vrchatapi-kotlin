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
 * Group-related constants
 *
 * @param CAPACITY Maximum group capacity
 * @param GROUP_TRANSFER_REQUIREMENTS Requirements for transferring group ownership
 * @param MAX_INVITES_REQUESTS Maximum number of invite requests
 * @param MAX_JOINED Maximum number of joined groups
 * @param MAX_JOINED_PLUS Maximum number of joined groups for VRChat Plus members
 * @param MAX_LANGUAGES Maximum number of supported languages
 * @param MAX_LINKS Maximum number of group links
 * @param MAX_MANAGEMENT_ROLES Maximum number of management roles in a group
 * @param MAX_OWNED Maximum number of groups a user can own
 * @param MAX_ROLES Maximum number of roles in a group
 */
@Serializable
data class APIConfigConstantsGROUPS (

    /* Maximum group capacity */
    @SerialName(value = "CAPACITY") val CAPACITY: kotlin.Int? = 100000,

    /* Requirements for transferring group ownership */
    @SerialName(value = "GROUP_TRANSFER_REQUIREMENTS") val GROUP_TRANSFER_REQUIREMENTS: kotlin.collections.List<kotlin.String>? = null,

    /* Maximum number of invite requests */
    @SerialName(value = "MAX_INVITES_REQUESTS") val MAX_INVITES_REQUESTS: kotlin.Int? = 50,

    /* Maximum number of joined groups */
    @SerialName(value = "MAX_JOINED") val MAX_JOINED: kotlin.Int? = 100,

    /* Maximum number of joined groups for VRChat Plus members */
    @SerialName(value = "MAX_JOINED_PLUS") val MAX_JOINED_PLUS: kotlin.Int? = 200,

    /* Maximum number of supported languages */
    @SerialName(value = "MAX_LANGUAGES") val MAX_LANGUAGES: kotlin.Int? = 10,

    /* Maximum number of group links */
    @SerialName(value = "MAX_LINKS") val MAX_LINKS: kotlin.Int? = 3,

    /* Maximum number of management roles in a group */
    @SerialName(value = "MAX_MANAGEMENT_ROLES") val MAX_MANAGEMENT_ROLES: kotlin.Int? = 5,

    /* Maximum number of groups a user can own */
    @SerialName(value = "MAX_OWNED") val MAX_OWNED: kotlin.Int? = 5,

    /* Maximum number of roles in a group */
    @SerialName(value = "MAX_ROLES") val MAX_ROLES: kotlin.Int? = 50

)

