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

import io.github.kamo030.vrchatapi.models.ReleaseStatus
import io.github.kamo030.vrchatapi.models.UnityPackage

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param authorId A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param authorName 
 * @param capacity 
 * @param recommendedCapacity 
 * @param createdAt 
 * @param description 
 * @param featured 
 * @param heat 
 * @param id WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param imageUrl 
 * @param labsPublicationDate 
 * @param name 
 * @param organization 
 * @param popularity 
 * @param publicationDate 
 * @param releaseStatus 
 * @param tags  
 * @param thumbnailImageUrl 
 * @param updatedAt 
 * @param version 
 * @param visits 
 * @param favorites 
 * @param instances Will always be an empty list when unauthenticated.
 * @param namespace 
 * @param occupants Will always be `0` when unauthenticated.
 * @param previewYoutubeId 
 * @param privateOccupants Will always be `0` when unauthenticated.
 * @param publicOccupants Will always be `0` when unauthenticated.
 * @param unityPackages Empty if unauthenticated.
 * @param urlList 
 * @param udonProducts 
 */
@Serializable
data class World (

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "authorId") @Required val authorId: kotlin.String,

    @SerialName(value = "authorName") @Required val authorName: kotlin.String,

    @SerialName(value = "capacity") @Required val capacity: kotlin.Int,

    @SerialName(value = "recommendedCapacity") @Required val recommendedCapacity: kotlin.Int,

    @SerialName(value = "created_at") @Required val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "featured") @Required val featured: kotlin.Boolean = false,

    @SerialName(value = "heat") @Required val heat: kotlin.Int = 0,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "imageUrl") @Required val imageUrl: kotlin.String,

    @SerialName(value = "labsPublicationDate") @Required val labsPublicationDate: kotlin.String,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "organization") @Required val organization: kotlin.String = "vrchat",

    @SerialName(value = "popularity") @Required val popularity: kotlin.Int = 0,

    @SerialName(value = "publicationDate") @Required val publicationDate: kotlin.String,

    @SerialName(value = "releaseStatus") @Required val releaseStatus: ReleaseStatus = ReleaseStatus.Public,

    /*   */
    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "thumbnailImageUrl") @Required val thumbnailImageUrl: kotlin.String,

    @SerialName(value = "updated_at") @Required val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "version") @Required val version: kotlin.Int = 0,

    @SerialName(value = "visits") @Required val visits: kotlin.Int = 0,

    @SerialName(value = "favorites") val favorites: kotlin.Int? = 0,

    /* Will always be an empty list when unauthenticated. */
    @SerialName(value = "instances") val instances: kotlin.collections.List<@Contextual kotlin.collections.List<String>>? = null,

    @SerialName(value = "namespace") val namespace: kotlin.String? = null,

    /* Will always be `0` when unauthenticated. */
    @SerialName(value = "occupants") val occupants: kotlin.Int? = 0,

    @SerialName(value = "previewYoutubeId") val previewYoutubeId: kotlin.String? = null,

    /* Will always be `0` when unauthenticated. */
    @SerialName(value = "privateOccupants") val privateOccupants: kotlin.Int? = 0,

    /* Will always be `0` when unauthenticated. */
    @SerialName(value = "publicOccupants") val publicOccupants: kotlin.Int? = 0,

    /* Empty if unauthenticated. */
    @SerialName(value = "unityPackages") val unityPackages: kotlin.collections.List<UnityPackage>? = null,

    @SerialName(value = "urlList") val urlList: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "udonProducts") val udonProducts: kotlin.collections.List<kotlin.String>? = null

) 

