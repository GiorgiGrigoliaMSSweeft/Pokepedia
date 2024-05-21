package com.sweeft.pokepedia.landing_screen.data.dtos.dto_mappers

import com.sweeft.pokepedia.landing_screen.data.dtos.PokemonResponseDto
import com.sweeft.pokepedia.landing_screen.domain.model.PokemonResponse
import com.sweeft.pokepedia.landing_screen.utils.Constants.DEFAULT_INTEGER

fun PokemonResponseDto.toPokemonResponse(): PokemonResponse {
    return PokemonResponse(
        count = count ?: DEFAULT_INTEGER,
        next = next.orEmpty(),
        previous = previous,
        results = results?.map { it.toPokemonEntry() }.orEmpty()
    )
}