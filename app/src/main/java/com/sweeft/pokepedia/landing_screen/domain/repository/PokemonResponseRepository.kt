package com.sweeft.pokepedia.landing_screen.domain.repository

import com.sweeft.pokepedia.landing_screen.domain.model.PokemonResponse

interface PokemonResponseRepository {
    suspend fun getPokemonResponse(offset: Int, limit: Int): Result<PokemonResponse>
}