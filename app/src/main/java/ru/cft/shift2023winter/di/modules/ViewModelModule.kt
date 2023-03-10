package ru.cft.shift2023winter.di.modules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.cft.shift2023winter.di.annotations.ViewModelKey
import ru.cft.shift2023winter.presentation.viewmodel.MainViewModel

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}