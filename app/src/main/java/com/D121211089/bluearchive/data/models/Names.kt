package com.D121211089.bluearchive.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Names(
    val _id: String?,
    val firstName: String?,
    val japanName: String?,
    val lastName: String?
): Parcelable