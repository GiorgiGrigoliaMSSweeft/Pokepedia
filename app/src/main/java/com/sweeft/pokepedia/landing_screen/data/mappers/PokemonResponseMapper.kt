package com.sweeft.pokepedia.landing_screen.data.mappers

import com.sweeft.pokepedia.core.utils.Constants.DEFAULT_INTEGER
import com.sweeft.pokepedia.landing_screen.data.dtos.PokemonResponseDto
import com.sweeft.pokepedia.landing_screen.domain.model.PokemonResponse

fun PokemonResponseDto.toPokemonResponse(): PokemonResponse {
    return PokemonResponse(
        count = count ?: DEFAULT_INTEGER,
        next = next.orEmpty(),
        previous = previous,
        results = results?.map { it.toPokemonEntry() }.orEmpty()
    )
}