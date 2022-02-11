package com.conamobile.pdpobjectsendpercailable

import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.conamobile.pdpobjectsendpercailable.models.User

class MainActivity2 : AppCompatActivity() {
    lateinit var text2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        text2 = findViewById(R.id.text2)

        val data = intent.extras
        val user:User = data?.getParcelable<Parcelable>("user") as User

        text2.text = user.toString()

    }
}