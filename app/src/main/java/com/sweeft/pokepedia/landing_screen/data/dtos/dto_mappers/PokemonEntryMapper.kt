package com.sweeft.pokepedia.landing_screen.data.dtos.dto_mappers

import com.sweeft.pokepedia.landing_screen.data.dtos.PokemonEntryDto
import com.sweeft.pokepedia.landing_screen.domain.model.PokemonEntry

fun PokemonEntryDto.toPokemonEntry(): PokemonEntry {
    return PokemonEntry(
        name = name.orEmpty(),
        url = url.orEmpty()
    )
}