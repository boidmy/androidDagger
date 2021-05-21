package com.example.androiddagger

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import di.component.DaggerApplicationComponent

class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.factory().create(this)
    }
}