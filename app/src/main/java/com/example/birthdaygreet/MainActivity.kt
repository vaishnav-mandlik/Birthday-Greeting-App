package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun creategreeting(view: View) {
        val name = nameInput.editableText.toString()
        val intent = Intent(this,ClickGreet::class.java)
        intent.putExtra(ClickGreet.NAME_EXTRA,name )
        startActivity(intent)


    }


}