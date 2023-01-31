package ru.cft.shift2023winter.di.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.cft.shift2023winter.data.network.api.ApiFactory
import ru.cft.shift2023winter.data.network.api.RickAndMortyApi
import ru.cft.shift2023winter.data.repositories.RickAndMortyCharacterRepositoryImpl
import ru.cft.shift2023winter.data.repositories.RickAndMortyEpisodeRepositoryImpl
import ru.cft.shift2023winter.data.repositories.RickAndMortyLocationRepositoryImpl
import ru.cft.shift2023winter.di.annotations.ApplicationScope
import ru.cft.shift2023winter.domain.repositories.RickAndMortyCharacterRepository
import ru.cft.shift2023winter.domain.repositories.RickAndMortyEpisodeRepository
import ru.cft.shift2023winter.domain.repositories.RickAndMortyLocationRepository

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindRickAndMortyCharacterRepository(impl: RickAndMortyCharacterRepositoryImpl): RickAndMortyCharacterRepository

    @ApplicationScope
    @Binds
    fun bindRickAndMortyEpisodeRepository(impl: RickAndMortyEpisodeRepositoryImpl): RickAndMortyEpisodeRepository

    @ApplicationScope
    @Binds
    fun bindRickAndMortyLocationRepository(impl: RickAndMortyLocationRepositoryImpl): RickAndMortyLocationRepository

    companion object{
        @ApplicationScope
        @Provides
        fun provideRickAndMortyApi(): RickAndMortyApi {
            return ApiFactory.api
        }
    }
}