package com.example.amphibians.fake

import com.example.amphibians.model.Amphibian

object FakeDataSource {
    val amphibiansList = listOf(
        Amphibian(
            name = "Amphibian 1",
            type = "Toad",
            description = "Description 1",
            imgSrc = "url1"
        ),
        Amphibian(
            name = "Amphibian 2",
            type = "Frog",
            description = "Description 2",
            imgSrc = "url2"
        )
    )
}
