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
 * Used to identify which API deployment cluster is currently responding.  `blue` and `green` are used by Production. `grape`and `cherry` are used during Development.  [Blue Green Deployment by Martin Fowler](https://martinfowler.com/bliki/BlueGreenDeployment.html)
 *
 * Values: Blue,Green,Grape,Cherry
 */
@Serializable
enum class DeploymentGroup(val value: kotlin.String) {

    @SerialName(value = "blue")
    Blue("blue"),

    @SerialName(value = "green")
    Green("green"),

    @SerialName(value = "grape")
    Grape("grape"),

    @SerialName(value = "cherry")
    Cherry("cherry");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DeploymentGroup) "$data" else null

        /**
         * Returns a valid [DeploymentGroup] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DeploymentGroup? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

