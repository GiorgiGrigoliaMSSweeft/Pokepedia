package com.sweeft.pokepedia.landing_screen.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sweeft.pokepedia.landing_screen.domain.use_cases.GetPokemonResponseUseCase
import com.sweeft.pokepedia.landing_screen.presentation.events.LandingScreenEvents
import com.sweeft.pokepedia.landing_screen.presentation.state.LandingScreenUiState
import com.sweeft.pokepedia.landing_screen.utils.extension_functions.mapPokemonImageUrls
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LandingScreenViewModel @Inject constructor(
    private val getPokemonResponseUseCase: GetPokemonResponseUseCase
) : ViewModel() {
    private val _landingScreenUiState: MutableStateFlow<LandingScreenUiState> = MutableStateFlow(LandingScreenUiState())
    val landingScreenUiState = _landingScreenUiState.asStateFlow()

    fun onEvent(event: LandingScreenEvents) {
        when (event) {
            is LandingScreenEvents.LoadPokemons -> {
                fetchPokemonData()
            }

            is LandingScreenEvents.NavigateToPokemonDetails -> {

            }
        }
    }

    private fun fetchPokemonData() {
        _landingScreenUiState.update { landingScreenUiState -> landingScreenUiState.copy(isLoading = true) }
        viewModelScope.launch {
            val apiResponse = getPokemonResponseUseCase(0, 40)
            apiResponse.fold(
                onSuccess = { response ->
                    _landingScreenUiState.update { landingScreenUiState ->
                        landingScreenUiState.copy(
                            isLoading = false,
                            isFetchSuccessful = true,
                            pokemonList = response.results.mapPokemonImageUrls()
                        )
                    }
                },

                onFailure = {
                    _landingScreenUiState.update { landingScreenUiState ->
                        landingScreenUiState.copy(
                            isLoading = false,
                            isFetchSuccessful = false
                        )
                    }
                }
            )
        }
    }

    init {
        fetchPokemonData()
    }
}
