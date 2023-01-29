package ru.cft.shift2023winter.di.modules

import dagger.Module
import dagger.Provides
import ru.cft.shift2023winter.data.network.api.ApiFactory
import ru.cft.shift2023winter.data.network.api.RickAndMortyApi
import ru.cft.shift2023winter.di.annotations.ApplicationScope

@Module
interface DataModule {

    companion object{
        @ApplicationScope
        @Provides
        fun provideRickAndMortyApi(): RickAndMortyApi {
            return ApiFactory.api
        }
    }
}