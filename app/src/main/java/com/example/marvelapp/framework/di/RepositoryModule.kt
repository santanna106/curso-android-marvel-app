package com.example.marvelapp.framework.di

import androidx.paging.PagingSource
import com.example.core.data.repository.CharacterRemoteDataSource
import com.example.core.data.repository.ChararcterRepository
import com.example.core.domain.model.Character
import com.example.marvelapp.framework.CharacterRepositoryImpl
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.remote.RetrofitCharactersDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun bindCharacterRepository(repository: CharacterRepositoryImpl) : ChararcterRepository<PagingSource<Int, Character>>

    @Binds
    fun bindRemoteDataSource(
        dataSource:RetrofitCharactersDataSource
    ):CharacterRemoteDataSource<DataWrapperResponse>
}