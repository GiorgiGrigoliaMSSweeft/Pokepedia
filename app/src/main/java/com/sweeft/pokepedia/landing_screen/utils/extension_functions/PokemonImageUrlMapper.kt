package com.sweeft.pokepedia.landing_screen.utils.extension_functions

import com.sweeft.pokepedia.landing_screen.domain.model.PokemonEntry
import com.sweeft.pokepedia.landing_screen.utils.Constants.DOT_PNG
import com.sweeft.pokepedia.landing_screen.utils.Constants.POKEMON_SPRITES_BASE_URL
import com.sweeft.pokepedia.landing_screen.utils.Constants.SLASH

fun List<PokemonEntry>.mapPokemonImageUrls(): List<PokemonEntry> {
    return this.map { pokemonEntry ->
        val number = pokemonEntry.url.substringBeforeLast(SLASH).substringAfterLast(SLASH)
        val url = "$POKEMON_SPRITES_BASE_URL$number$DOT_PNG"
        pokemonEntry.copy(url = url)
    }
}