package com.sweeft.pokepedia.landing_screen.presentation.state

import com.sweeft.pokepedia.landing_screen.domain.model.PokemonEntry

data class LandingScreenUiState(
    val isLoading: Boolean = false,
    val isFetchSuccessful: Boolean = false,
    val pokemonList: List<PokemonEntry> = emptyList()
)