package com.sweeft.pokepedia.landing_screen.data.data_source.remote.api

import com.sweeft.pokepedia.landing_screen.data.dtos.PokemonResponseDto
import com.sweeft.pokepedia.landing_screen.utils.Constants.LIMIT
import com.sweeft.pokepedia.landing_screen.utils.Constants.OFFSET
import com.sweeft.pokepedia.landing_screen.utils.Constants.POKEMON
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {
    @GET(POKEMON)
    suspend fun getPokemonResponse(
        @Query(OFFSET) offset: Int,
        @Query(LIMIT) limit: Int
    ): PokemonResponseDto
}