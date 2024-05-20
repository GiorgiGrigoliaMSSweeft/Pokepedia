package com.sweeft.pokepedia.landing_screen.data.dtos

data class PokemonResponseDto(
    val count: Int?,
    val next: String?,
    val previous: Any?,
    val results: List<PokemonEntryDto>?
)