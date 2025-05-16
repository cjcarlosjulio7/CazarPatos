package com.carlos.bayas.cazarpatos

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class LoginActivity2 : AppCompatActivity() {
    private val buttonLogin : Button by lazy { findViewById(R.id.buttonLogin) } //otra forma de hacerlo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) //esto es para cambiar entre pantallas
            startActivity(intent) //esto es para cambiar entre pantallas
        }
    }


}