package com.example.finalproject.di

import com.example.finalproject.data.api.MovieApi
import com.example.finalproject.data.repository.MovieRepositoryImpl
import com.example.finalproject.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(api: MovieApi): MovieRepository = MovieRepositoryImpl(api)
}