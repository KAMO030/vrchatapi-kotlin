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
 * @param state 
 * @param country 
 * @param currency 
 * @param status 
 */
@Serializable
data class TransactionSteamWalletInfo (

    @SerialName(value = "state") @Required val state: kotlin.String,

    @SerialName(value = "country") @Required val country: kotlin.String = "US",

    @SerialName(value = "currency") @Required val currency: kotlin.String = "USD",

    @SerialName(value = "status") @Required val status: kotlin.String

) 

