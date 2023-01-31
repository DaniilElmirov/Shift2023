package ru.cft.shift2023winter.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import ru.cft.shift2023winter.di.annotations.ApplicationScope
import ru.cft.shift2023winter.di.modules.DataModule
import ru.cft.shift2023winter.di.modules.ViewModelModule
import ru.cft.shift2023winter.presentation.MainActivity

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class,
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
        ): ApplicationComponent
    }
}