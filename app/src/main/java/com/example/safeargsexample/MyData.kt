package com.example.safeargsexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyData(
    val content: String,
    val value: Int,
    val message: String
): Parcelable
