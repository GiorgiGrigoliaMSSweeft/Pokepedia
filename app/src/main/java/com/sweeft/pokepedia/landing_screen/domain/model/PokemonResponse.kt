package com.sweeft.pokepedia.landing_screen.domain.model

data class PokemonResponse(
    val count: Int,
    val next: String,
    val previous: Any?,
    val results: List<PokemonEntry>
)