package com.conamobile.pdpobjectsendpercailable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.conamobile.pdpobjectsendpercailable.models.User

class MainActivity : AppCompatActivity() {

    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button1)

        button.setOnClickListener {
            val user = User(name = "Nurmuhammad", age = "17", id = 1)
            openDetailActivity(user)
        }

    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, MainActivity2::class.java)
//        intent.putExtra("user",user)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}