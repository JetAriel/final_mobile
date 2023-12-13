package com.D121211089.bluearchive.data.response

import com.D121211089.bluearchive.data.models.Character
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetCharactersResponse(
    @SerialName("data")
    val data: List<Character>,
    @SerialName("message")
    val message: String
)