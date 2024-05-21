package com.sweeft.pokepedia.landing_screen.di

import com.sweeft.pokepedia.landing_screen.domain.repository.PokemonResponseRepository
import com.sweeft.pokepedia.landing_screen.domain.use_cases.GetPokemonResponseUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object GetPokemonResponseUseCaseBindingModule {
    @Provides
    fun providesGetPokemonResponseUseCase(
        pokemonResponseRepository: PokemonResponseRepository
    ): GetPokemonResponseUseCase {
        return GetPokemonResponseUseCase(pokemonResponseRepository)
    }
}