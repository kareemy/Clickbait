package com.example.news.data

import com.example.news.R
import com.example.news.model.News

object DataSource {
    val headlines = listOf(
        News(R.drawable.travel,"BuzzFeed", R.string.headline1, "22m ago"),
        News(R.drawable.pet,"InfoFrenzyHub", R.string.headline2, "1h ago"),
        News(R.drawable.fantasy,"ViralInsightGlobe", R.string.headline3, "16h ago"),
        News(R.drawable.diy,"ViralInsightGlobe", R.string.headline4, "36m ago"),
        News(R.drawable.cartoons,"CuriositySphere", R.string.headline5, "2d ago"),
        News(R.drawable.pizza,"InfoFrenzyHub", R.string.headline6, "42m ago"),
        News(R.drawable.celebrity,"TrendUnveilArena", R.string.headline7, "12m ago"),
        News(R.drawable.junkfood,"BuzzFeed", R.string.headline8, "2h ago"),
        News(R.drawable.soulmate,"CuriositySphere", R.string.headline9, "4h ago"),
        News(R.drawable.lifehacks,"HuffPost", R.string.headline10, "51m ago"),
    )
}