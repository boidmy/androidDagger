package di.module

import com.example.androiddagger.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [CarModule::class])
    abstract fun mainActivity(): MainActivity
}