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

import io.github.kamo030.vrchatapi.models.TransactionSteamWalletInfo

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param walletInfo 
 * @param steamId Steam User ID
 * @param orderId Steam Order ID
 * @param steamUrl Empty
 * @param transId Steam Transaction ID, NOT the same as VRChat TransactionID
 */
@Serializable
data class TransactionSteamInfo (

    @SerialName(value = "walletInfo") @Required val walletInfo: TransactionSteamWalletInfo,

    /* Steam User ID */
    @SerialName(value = "steamId") @Required val steamId: kotlin.String,

    /* Steam Order ID */
    @SerialName(value = "orderId") @Required val orderId: kotlin.String,

    /* Empty */
    @SerialName(value = "steamUrl") @Required val steamUrl: kotlin.String,

    /* Steam Transaction ID, NOT the same as VRChat TransactionID */
    @SerialName(value = "transId") @Required val transId: kotlin.String

) 

