package com.example.news.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class News(
    @DrawableRes val image: Int,
    val companyName: String,
    @StringRes val headline: Int,
    val lastUpdated: String
)
