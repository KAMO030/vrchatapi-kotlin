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

import io.github.kamo030.vrchatapi.models.APIConfigConstantsGROUPS
import io.github.kamo030.vrchatapi.models.APIConfigConstantsINSTANCE
import io.github.kamo030.vrchatapi.models.APIConfigConstantsLANGUAGE

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Constants
 *
 * @param GROUPS 
 * @param INSTANCE 
 * @param LANGUAGE 
 */
@Serializable
data class APIConfigConstants (

    @SerialName(value = "GROUPS") @Required val GROUPS: APIConfigConstantsGROUPS,

    @SerialName(value = "INSTANCE") @Required val INSTANCE: APIConfigConstantsINSTANCE,

    @SerialName(value = "LANGUAGE") @Required val LANGUAGE: APIConfigConstantsLANGUAGE

) 

