package com.sweeft.pokepedia.landing_screen.presentation.vm

import androidx.lifecycle.ViewModel
import com.sweeft.pokepedia.landing_screen.domain.use_cases.GetPokemonResponseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonResponseUseCase: GetPokemonResponseUseCase
) : ViewModel() {

}