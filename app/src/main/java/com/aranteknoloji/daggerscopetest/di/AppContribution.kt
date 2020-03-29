package com.aranteknoloji.daggerscopetest.di

import com.aranteknoloji.daggerscopetest.MainActivity
import com.aranteknoloji.daggerscopetest.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppContribution {

    @ContributesAndroidInjector
    abstract fun bindsMainActivity() : MainActivity

    @ContributesAndroidInjector
    abstract fun bindsSecondActivity() : SecondActivity
}