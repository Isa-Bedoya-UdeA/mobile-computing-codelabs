package com.example.amphibians

import com.example.amphibians.fake.FakeDataSource
import com.example.amphibians.fake.FakeNetworkAmphibiansRepository
import com.example.amphibians.rules.TestDispatcherRule
import com.example.amphibians.ui.screens.AmphibiansUiState
import com.example.amphibians.ui.screens.AmphibiansViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class AmphibiansViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun amphibiansViewModel_getAmphibians_verifyAmphibiansUiStateSuccess() =
        runTest {
            val amphibiansViewModel = AmphibiansViewModel(
                amphibiansRepository = FakeNetworkAmphibiansRepository()
            )
            assertEquals(
                AmphibiansUiState.Success(FakeDataSource.amphibiansList),
                amphibiansViewModel.amphibiansUiState
            )
        }
}
