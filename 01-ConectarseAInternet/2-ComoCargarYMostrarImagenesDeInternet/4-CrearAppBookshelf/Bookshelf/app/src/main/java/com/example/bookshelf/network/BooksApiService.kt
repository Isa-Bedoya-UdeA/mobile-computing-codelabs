package com.example.bookshelf.network

import com.example.bookshelf.model.Book
import com.example.bookshelf.model.BooksQueryResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BooksApiService {
    @GET("volumes")
    suspend fun searchBooks(@Query("q") query: String): BooksQueryResponse

    @GET("volumes/{id}")
    suspend fun getBook(@Path("id") id: String): Book
}
