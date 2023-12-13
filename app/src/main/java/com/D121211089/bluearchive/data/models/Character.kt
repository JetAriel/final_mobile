package com.D121211089.bluearchive.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Character(
    val _id: String?,
//    val affinity: List<Affinity?>,
    val age: String?,
    val armorType: String?,
    val background: String?,
    val birthday: String?,
    val damageType: String?,
    val height: String?,
    val hobbies: List<String?>,
    val image: String?,
    val imageSchool: String?,
    val imageSpecial: List<String?>,
    val name: String?,
    val names: Names,
    val photoUrl: String?,
    val realeaseDate: String?,
    val role: List<String?>,
    val school: String?,
    val voice: String?,
    val voices: String?,
    val weapon: String?,
    val weaponImage: String?,
    val weaponUnique: String?
): Parcelable