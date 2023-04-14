package com.example.marvelapp.framework

import androidx.paging.PagingSource
import com.example.core.data.repository.CharacterRemoteDataSource
import com.example.core.data.repository.CharactersRepository
import com.example.core.domain.model.Character
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.paging.CharacteresPagingSource
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharacterRemoteDataSource<DataWrapperResponse>
) : CharactersRepository {
    override fun getCharacters(query: String): PagingSource<Int, Character> {
        return CharacteresPagingSource(remoteDataSource,query)
    }
}