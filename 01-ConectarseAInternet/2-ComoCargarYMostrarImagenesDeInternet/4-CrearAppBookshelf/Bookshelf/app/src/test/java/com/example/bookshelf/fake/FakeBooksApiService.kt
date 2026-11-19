package com.example.bookshelf.fake

import com.example.bookshelf.model.Book
import com.example.bookshelf.model.BooksQueryResponse
import com.example.bookshelf.network.BooksApiService

class FakeBooksApiService : BooksApiService {
    override suspend fun searchBooks(query: String): BooksQueryResponse {
        return FakeDataSource.queryResponse
    }

    override suspend fun getBook(id: String): Book {
        return FakeDataSource.booksList.first { it.id == id }
    }
}
