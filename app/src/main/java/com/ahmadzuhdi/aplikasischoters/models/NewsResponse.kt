package com.ahmadzuhdi.aplikasischoters.models

import com.ahmadzuhdi.aplikasischoters.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)