package com.sweeft.pokepedia.landing_screen.di

import com.sweeft.pokepedia.landing_screen.data.repository.PokemonResponseRepositoryImpl
import com.sweeft.pokepedia.landing_screen.domain.repository.PokemonResponseRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface PokemonResponseRepositoryBindingModule {
    @Binds
    fun bindsPokemonResponseRepository(pokemonResponseRepositoryImpl: PokemonResponseRepositoryImpl): PokemonResponseRepository
}