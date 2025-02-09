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

import io.github.kamo030.vrchatapi.models.Product
import io.github.kamo030.vrchatapi.models.ProductListingType
import io.github.kamo030.vrchatapi.models.ProductListingVariant
import io.github.kamo030.vrchatapi.models.ProductType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param active 
 * @param archived 
 * @param buyerRefundable 
 * @param created 
 * @param description 
 * @param displayName 
 * @param groupIcon 
 * @param groupId 
 * @param groupName 
 * @param id 
 * @param imageId 
 * @param instant 
 * @param listingType 
 * @param listingVariants 
 * @param permanent 
 * @param priceTokens 
 * @param productIds 
 * @param productType 
 * @param products 
 * @param recurrable 
 * @param refundable 
 * @param sellerDisplayName 
 * @param sellerId 
 * @param stackable 
 * @param storeIds 
 * @param tags 
 * @param updated 
 * @param duration 
 * @param durationType 
 * @param hydratedProducts 
 * @param quantifiable 
 */
@Serializable

data class ProductListing (

    @SerialName(value = "active") @Required val active: kotlin.Boolean,

    @SerialName(value = "archived") @Required val archived: kotlin.Boolean,

    @SerialName(value = "buyerRefundable") @Required val buyerRefundable: kotlin.Boolean,

    @SerialName(value = "created") @Required val created: kotlin.String,

    @SerialName(value = "description") @Required val description: kotlin.String,

    @SerialName(value = "displayName") @Required val displayName: kotlin.String,

    @SerialName(value = "groupIcon") @Required val groupIcon: kotlin.String,

    @SerialName(value = "groupId") @Required val groupId: kotlin.String,

    @SerialName(value = "groupName") @Required val groupName: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "imageId") @Required val imageId: kotlin.String,

    @SerialName(value = "instant") @Required val instant: kotlin.Boolean,

    @SerialName(value = "listingType") @Required val listingType: ProductListingType = ProductListingType.Subscription,

    @SerialName(value = "listingVariants") @Required val listingVariants: kotlin.collections.List<ProductListingVariant>,

    @SerialName(value = "permanent") @Required val permanent: kotlin.Boolean,

    @SerialName(value = "priceTokens") @Required val priceTokens: kotlin.Int,

    @SerialName(value = "productIds") @Required val productIds: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "productType") @Required val productType: ProductType = ProductType.Udon,

    @SerialName(value = "products") @Required val products: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "recurrable") @Required val recurrable: kotlin.Boolean,

    @SerialName(value = "refundable") @Required val refundable: kotlin.Boolean,

    @SerialName(value = "sellerDisplayName") @Required val sellerDisplayName: kotlin.String,

    @SerialName(value = "sellerId") @Required val sellerId: kotlin.String,

    @SerialName(value = "stackable") @Required val stackable: kotlin.Boolean,

    @SerialName(value = "storeIds") @Required val storeIds: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "tags") @Required val tags: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "updated") @Required val updated: kotlin.String?,

    @SerialName(value = "duration") val duration: kotlin.Int? = null,

    @SerialName(value = "durationType") val durationType: kotlin.String? = null,

    @SerialName(value = "hydratedProducts") val hydratedProducts: kotlin.collections.List<Product>? = null,

    @SerialName(value = "quantifiable") val quantifiable: kotlin.Boolean? = null

)

