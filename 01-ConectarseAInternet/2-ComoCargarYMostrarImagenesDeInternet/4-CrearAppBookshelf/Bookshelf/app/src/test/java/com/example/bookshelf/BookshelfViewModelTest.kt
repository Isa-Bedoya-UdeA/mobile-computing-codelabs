package com.example.bookshelf

import com.example.bookshelf.fake.FakeDataSource
import com.example.bookshelf.fake.FakeNetworkBooksRepository
import com.example.bookshelf.rules.TestDispatcherRule
import com.example.bookshelf.ui.screens.BookshelfUiState
import com.example.bookshelf.ui.screens.BookshelfViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class BookshelfViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun bookshelfViewModel_getBooks_verifyBookshelfUiStateSuccess() = runTest {
        val viewModel = BookshelfViewModel(
            booksRepository = FakeNetworkBooksRepository()
        )
        assertEquals(
            BookshelfUiState.Success(FakeDataSource.booksList),
            viewModel.bookshelfUiState
        )
    }
}
