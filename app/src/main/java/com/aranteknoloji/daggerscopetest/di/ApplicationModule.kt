package com.aranteknoloji.daggerscopetest.di

import com.aranteknoloji.daggerscopetest.models.FirstObject
import com.aranteknoloji.daggerscopetest.models.SecondObject
import dagger.Module
import dagger.Provides

@Module
object ApplicationModule {

    @PerApplication
    @Provides
    fun providesFirstObject() : FirstObject = FirstObject("FirstObjectCreated")

    @Provides
    fun providesSecondObjectt() : SecondObject = SecondObject("SecondObjectCreated")
}