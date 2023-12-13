package com.D121211089.bluearchive.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Affinity(
    @SerialName("indoors")
    val indoors: String?,
    @SerialName("indoorsEmotion")
    val indoorsEmotion: String?,
    @SerialName("outdoors")
    val outdoors: String?,
    @SerialName("outdoorsEmotion")
    val outdoorsEmotion: String?,
    @SerialName("urban")
    val urban: String?,
    @SerialName("urbanEmotion")
    val urbanEmotion: String?
): Parcelable