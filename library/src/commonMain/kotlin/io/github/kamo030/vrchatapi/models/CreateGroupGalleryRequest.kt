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
 * @param name Name of the gallery.
 * @param description Description of the gallery.
 * @param membersOnly Whether the gallery is members only.
 * @param roleIdsToView  
 * @param roleIdsToSubmit  
 * @param roleIdsToAutoApprove  
 * @param roleIdsToManage  
 */
@Serializable
data class CreateGroupGalleryRequest (

    /* Name of the gallery. */
    @SerialName(value = "name") @Required val name: kotlin.String,

    /* Description of the gallery. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* Whether the gallery is members only. */
    @SerialName(value = "membersOnly") val membersOnly: kotlin.Boolean? = false,

    /*   */
    @SerialName(value = "roleIdsToView") val roleIdsToView: kotlin.collections.List<kotlin.String>? = null,

    /*   */
    @SerialName(value = "roleIdsToSubmit") val roleIdsToSubmit: kotlin.collections.List<kotlin.String>? = null,

    /*   */
    @SerialName(value = "roleIdsToAutoApprove") val roleIdsToAutoApprove: kotlin.collections.List<kotlin.String>? = null,

    /*   */
    @SerialName(value = "roleIdsToManage") val roleIdsToManage: kotlin.collections.List<kotlin.String>? = null

) 

