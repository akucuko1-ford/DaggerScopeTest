package com.aranteknoloji.daggerscopetest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.aranteknoloji.daggerscopetest.models.FirstObject
import com.aranteknoloji.daggerscopetest.models.SecondObject
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var firstObject: FirstObject

    @Inject
    lateinit var secondObject: SecondObject

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        second_main_text.text = secondObject.secondValue
        Log.e("MyTag SecondActivity", "firstObject=$firstObject, secondObject=$secondObject")
    }
}