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

import io.github.kamo030.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED
import io.github.kamo030.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSFEW
import io.github.kamo030.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSMANY

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Population brackets based on instance population
 *
 * @param CROWDED 
 * @param FEW 
 * @param MANY 
 */
@Serializable

data class APIConfigConstantsINSTANCEPOPULATIONBRACKETS (

    @SerialName(value = "CROWDED") val CROWDED: APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED? = null,

    @SerialName(value = "FEW") val FEW: APIConfigConstantsINSTANCEPOPULATIONBRACKETSFEW? = null,

    @SerialName(value = "MANY") val MANY: APIConfigConstantsINSTANCEPOPULATIONBRACKETSMANY? = null

)

