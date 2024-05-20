package com.sweeft.pokepedia.landing_screen.domain.use_cases

import com.sweeft.pokepedia.landing_screen.domain.repository.PokemonResponseRepository

class GetPokemonResponseUseCase(private val pokemonResponseRepository: PokemonResponseRepository) {
    suspend operator fun invoke(limit: Int, offset: Int) = pokemonResponseRepository.getPokemonResponse(limit, offset)
}