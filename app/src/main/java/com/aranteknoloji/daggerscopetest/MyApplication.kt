package com.aranteknoloji.daggerscopetest

import android.app.Activity
import android.app.Application
import com.aranteknoloji.daggerscopetest.di.ApplicationModule
import com.aranteknoloji.daggerscopetest.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .applicationModule(ApplicationModule)
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> =
        dispatchingAndroidInjector
}