package com.aranteknoloji.daggerscopetest.di

import com.aranteknoloji.daggerscopetest.MyApplication
import dagger.Component
import dagger.android.AndroidInjector

@PerApplication
@Component(modules = [
    ApplicationModule::class,
    AppContribution::class
])
interface AppComponent : AndroidInjector<MyApplication> {
//    fun inject(myApplication: MyApplication)
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun applicationContext(myApplication: MyApplication) : Builder
//        fun build() : AppComponent
//    }
}