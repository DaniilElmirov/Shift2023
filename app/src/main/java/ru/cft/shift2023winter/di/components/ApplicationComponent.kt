package ru.cft.shift2023winter.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.cft.shift2023winter.di.annotations.ApplicationScope
import ru.cft.shift2023winter.di.modules.DataModule
import ru.cft.shift2023winter.presentation.RickAndMortyApplication

@ApplicationScope
@Component(
    modules = [
        DataModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: RickAndMortyApplication)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }

}