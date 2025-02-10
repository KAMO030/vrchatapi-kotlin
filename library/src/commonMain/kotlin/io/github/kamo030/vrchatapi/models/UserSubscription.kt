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

import io.github.kamo030.vrchatapi.models.SubscriptionPeriod
import io.github.kamo030.vrchatapi.models.TransactionStatus

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param transactionId 
 * @param store Which \"Store\" it came from. Right now only Stores are \"Steam\" and \"Admin\".
 * @param amount 
 * @param description 
 * @param period 
 * @param tier 
 * @param active 
 * @param status 
 * @param expires 
 * @param createdAt 
 * @param updatedAt 
 * @param licenseGroups 
 * @param isGift 
 * @param isBulkGift 
 * @param steamItemId 
 * @param starts 
 */
@Serializable
data class UserSubscription (

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "transactionId") @Required val transactionId: kotlin.String,

    /* Which \"Store\" it came from. Right now only Stores are \"Steam\" and \"Admin\". */
    @SerialName(value = "store") @Required val store: kotlin.String,

    @SerialName(value = "amount") @Required val amount: kotlin.Double,

    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "period") @Required val period: SubscriptionPeriod = SubscriptionPeriod.Month,

    @SerialName(value = "tier") @Required val tier: kotlin.Int,

    @SerialName(value = "active") @Required val active: kotlin.Boolean = true,

    @SerialName(value = "status") @Required val status: TransactionStatus = TransactionStatus.Active,

    @SerialName(value = "expires") @Required val expires: kotlinx.datetime.Instant,

    @SerialName(value = "created_at") @Required val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "updated_at") @Required val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "licenseGroups") @Required val licenseGroups: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "isGift") @Required val isGift: kotlin.Boolean = false,

    @SerialName(value = "isBulkGift") @Required val isBulkGift: kotlin.Boolean = false,

    @SerialName(value = "steamItemId") val steamItemId: kotlin.String? = null,

    @SerialName(value = "starts") val starts: kotlin.String? = null

) 

