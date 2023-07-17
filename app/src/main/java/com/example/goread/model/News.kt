package com.example.goread.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    @DrawableRes val imageResourceId: Int,
    val title: String,
    val description: String,
    val author: String
) : Parcelable
