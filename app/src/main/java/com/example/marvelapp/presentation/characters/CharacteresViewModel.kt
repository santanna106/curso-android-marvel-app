package com.example.marvelapp.presentation.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.core.usecase.GetCharactersUseCase
import kotlinx.coroutines.flow.Flow
import com.example.core.domain.model.Character
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacteresViewModel @Inject constructor(
    private val getCharactersUseCase : GetCharactersUseCase
) : ViewModel () {
    fun charactersPagingData(query:String): Flow<PagingData<Character>>{
        return getCharactersUseCase(
            GetCharactersUseCase.GetCharactersParams(query,getPageConfig())
        ).cachedIn(viewModelScope)
    }

    private fun getPageConfig() = PagingConfig(
        pageSize = 20
    )
}