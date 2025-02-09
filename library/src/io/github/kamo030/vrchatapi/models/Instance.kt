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

import io.github.kamo030.vrchatapi.models.GroupAccessType
import io.github.kamo030.vrchatapi.models.InstancePlatforms
import io.github.kamo030.vrchatapi.models.InstanceRegion
import io.github.kamo030.vrchatapi.models.InstanceType
import io.github.kamo030.vrchatapi.models.LimitedUser
import io.github.kamo030.vrchatapi.models.Region
import io.github.kamo030.vrchatapi.models.World

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * * `hidden` field is only present if InstanceType is `hidden` aka \"Friends+\", and is instance creator. * `friends` field is only present if InstanceType is `friends` aka \"Friends\", and is instance creator. * `private` field is only present if InstanceType is `private` aka \"Invite\" or \"Invite+\", and is instance creator.
 *
 * @param active 
 * @param canRequestInvite 
 * @param capacity 
 * @param clientNumber Always returns \"unknown\".
 * @param displayName 
 * @param full 
 * @param gameServerVersion 
 * @param id InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.
 * @param instanceId 
 * @param instancePersistenceEnabled 
 * @param location InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.
 * @param nUsers 
 * @param name 
 * @param permanent 
 * @param photonRegion 
 * @param platforms 
 * @param playerPersistenceEnabled 
 * @param region 
 * @param secureName 
 * @param tags The tags array on Instances usually contain the language tags of the people in the instance. 
 * @param type 
 * @param worldId WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param queueEnabled 
 * @param queueSize 
 * @param recommendedCapacity 
 * @param strict 
 * @param userCount 
 * @param world 
 * @param ageGate 
 * @param ownerId A groupId if the instance type is \"group\", null if instance type is public, or a userId otherwise
 * @param shortName 
 * @param hidden A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param friends A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param `private` A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.
 * @param roleRestricted 
 * @param users The users field is present on instances created by the requesting user.
 * @param groupAccessType 
 * @param hasCapacityForYou 
 * @param nonce 
 * @param closedAt 
 * @param hardClose 
 */
@Serializable

data class Instance (

    @SerialName(value = "active") @Required val active: kotlin.Boolean = true,

    @SerialName(value = "canRequestInvite") @Required val canRequestInvite: kotlin.Boolean = true,

    @SerialName(value = "capacity") @Required val capacity: kotlin.Int,

    /* Always returns \"unknown\". */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "clientNumber") @Required val clientNumber: kotlin.String,

    @SerialName(value = "displayName") @Required val displayName: kotlin.String?,

    @SerialName(value = "full") @Required val full: kotlin.Boolean = false,

    @SerialName(value = "gameServerVersion") @Required val gameServerVersion: kotlin.Int,

    /* InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "instanceId") @Required val instanceId: kotlin.String,

    @SerialName(value = "instancePersistenceEnabled") @Required val instancePersistenceEnabled: kotlin.String?,

    /* InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance. */
    @SerialName(value = "location") @Required val location: kotlin.String,

    @SerialName(value = "n_users") @Required val nUsers: kotlin.Int,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "permanent") @Required val permanent: kotlin.Boolean = false,

    @SerialName(value = "photonRegion") @Required val photonRegion: Region = Region.Us,

    @SerialName(value = "platforms") @Required val platforms: InstancePlatforms,

    @SerialName(value = "playerPersistenceEnabled") @Required val playerPersistenceEnabled: kotlin.Boolean?,

    @SerialName(value = "region") @Required val region: InstanceRegion = InstanceRegion.Us,

    @SerialName(value = "secureName") @Required val secureName: kotlin.String,

    /* The tags array on Instances usually contain the language tags of the people in the instance.  */
    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "type") @Required val type: InstanceType,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "worldId") @Required val worldId: kotlin.String,

    @SerialName(value = "queueEnabled") @Required val queueEnabled: kotlin.Boolean,

    @SerialName(value = "queueSize") @Required val queueSize: kotlin.Int,

    @SerialName(value = "recommendedCapacity") @Required val recommendedCapacity: kotlin.Int,

    @SerialName(value = "strict") @Required val strict: kotlin.Boolean,

    @SerialName(value = "userCount") @Required val userCount: kotlin.Int,

    @SerialName(value = "world") @Required val world: World,

    @SerialName(value = "ageGate") val ageGate: kotlin.Boolean? = null,

    /* A groupId if the instance type is \"group\", null if instance type is public, or a userId otherwise */
    @SerialName(value = "ownerId") val ownerId: kotlin.String? = null,

    @SerialName(value = "shortName") val shortName: kotlin.String? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "hidden") val hidden: kotlin.String? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "friends") val friends: kotlin.String? = null,

    /* A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed. */
    @SerialName(value = "private") val `private`: kotlin.String? = null,

    @SerialName(value = "roleRestricted") val roleRestricted: kotlin.Boolean? = null,

    /* The users field is present on instances created by the requesting user. */
    @SerialName(value = "users") val users: kotlin.collections.List<LimitedUser>? = null,

    @SerialName(value = "groupAccessType") val groupAccessType: GroupAccessType? = GroupAccessType.Members,

    @SerialName(value = "hasCapacityForYou") val hasCapacityForYou: kotlin.Boolean? = null,

    @SerialName(value = "nonce") val nonce: kotlin.String? = null,

    @SerialName(value = "closedAt") val closedAt: kotlin.String? = null,

    @SerialName(value = "hardClose") val hardClose: kotlin.Boolean? = null

)

