package com.aranteknoloji.daggerscopetest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aranteknoloji.daggerscopetest.models.FirstObject
import com.aranteknoloji.daggerscopetest.models.SecondObject
import dagger.android.*
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var firstObject: FirstObject

    @Inject
    lateinit var secondObject: SecondObject

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text_one.text = firstObject.firstValue
        Log.e("MyTag MainActivity", "firstObject=$firstObject, secondObject=$secondObject")

        main_text_one.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
