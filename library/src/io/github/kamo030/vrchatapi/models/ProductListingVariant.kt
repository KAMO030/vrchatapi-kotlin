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
 * @param listingVariantId 
 * @param nonRefundable 
 * @param quantity 
 * @param sellerVariant 
 * @param unitPriceTokens 
 * @param effectiveFrom 
 */
@Serializable

data class ProductListingVariant (

    @SerialName(value = "listingVariantId") @Required val listingVariantId: kotlin.String,

    @SerialName(value = "nonRefundable") @Required val nonRefundable: kotlin.Boolean,

    @SerialName(value = "quantity") @Required val quantity: kotlin.Int,

    @SerialName(value = "sellerVariant") @Required val sellerVariant: kotlin.Boolean,

    @SerialName(value = "unitPriceTokens") @Required val unitPriceTokens: kotlin.Int,

    @SerialName(value = "effectiveFrom") val effectiveFrom: kotlin.String? = null

)

