package com.sweeft.pokepedia.landing_screen.presentation.events

sealed class LandingScreenEvents {
    data object LoadPokemons : LandingScreenEvents()
    data object NavigateToPokemonDetails : LandingScreenEvents()
}