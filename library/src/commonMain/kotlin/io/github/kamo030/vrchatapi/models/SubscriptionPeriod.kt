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

/**
 * 
 *
 * Values: Hour,Day,Week,Month,Year
 */
@Serializable
enum class SubscriptionPeriod(val value: kotlin.String) {

    @SerialName(value = "hour")
    Hour("hour"),

    @SerialName(value = "day")
    Day("day"),

    @SerialName(value = "week")
    Week("week"),

    @SerialName(value = "month")
    Month("month"),

    @SerialName(value = "year")
    Year("year");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SubscriptionPeriod) "$data" else null

        /**
         * Returns a valid [SubscriptionPeriod] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SubscriptionPeriod? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

