package com.sweeft.pokepedia.landing_screen.data.repository

import com.sweeft.pokepedia.landing_screen.data.data_source.remote.api.PokemonApi
import com.sweeft.pokepedia.landing_screen.data.dtos.dto_mappers.toPokemonResponse
import com.sweeft.pokepedia.landing_screen.domain.model.PokemonResponse
import com.sweeft.pokepedia.landing_screen.domain.repository.PokemonResponseRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonResponseRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonApi
) : PokemonResponseRepository {
    override suspend fun getPokemonResponse(offset: Int, limit: Int): Result<PokemonResponse> {
        return runCatching {
            pokemonApi.getPokemonResponse(offset, limit).toPokemonResponse()
        }
    }
}