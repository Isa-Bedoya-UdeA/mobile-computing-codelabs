package com.example.bookshelf.fake

import com.example.bookshelf.model.Book
import com.example.bookshelf.model.BookItem
import com.example.bookshelf.model.BooksQueryResponse
import com.example.bookshelf.model.ImageLinks
import com.example.bookshelf.model.VolumeInfo

object FakeDataSource {
    val bookItems = listOf(
        BookItem(id = "book1"),
        BookItem(id = "book2")
    )

    val queryResponse = BooksQueryResponse(
        items = bookItems
    )

    val booksList = listOf(
        Book(
            id = "book1",
            volumeInfo = VolumeInfo(
                title = "Book Title 1",
                authors = listOf("Author 1"),
                description = "Description 1",
                imageLinks = ImageLinks(
                    smallThumbnail = "http://example.com/small1.jpg",
                    thumbnail = "http://example.com/thumb1.jpg"
                )
            )
        ),
        Book(
            id = "book2",
            volumeInfo = VolumeInfo(
                title = "Book Title 2",
                authors = listOf("Author 2"),
                description = "Description 2",
                imageLinks = ImageLinks(
                    smallThumbnail = "http://example.com/small2.jpg",
                    thumbnail = "http://example.com/thumb2.jpg"
                )
            )
        )
    )
}
