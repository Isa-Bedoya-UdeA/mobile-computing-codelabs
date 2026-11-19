package com.example.bookshelf.data

import com.example.bookshelf.model.Book
import com.example.bookshelf.network.BooksApiService

interface BooksRepository {
    suspend fun getBooks(query: String): List<Book>
    suspend fun getBook(id: String): Book
}

class NetworkBooksRepository(
    private val booksApiService: BooksApiService
) : BooksRepository {
    override suspend fun getBooks(query: String): List<Book> {
        val queryResponse = booksApiService.searchBooks(query)
        val items = queryResponse.items ?: return emptyList()
        val books = mutableListOf<Book>()
        for (item in items) {
            try {
                val book = booksApiService.getBook(item.id)
                books.add(book)
            } catch (e: Exception) {
                // Keep retrieving remaining books even if one fails
            }
        }
        return books
    }

    override suspend fun getBook(id: String): Book = booksApiService.getBook(id)
}
