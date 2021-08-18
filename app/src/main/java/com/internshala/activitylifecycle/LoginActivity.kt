package com.internshala.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(){


    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister: TextView
    val validMobileNumber = "0123456789"
    val validPassword = "thanos"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_login)


        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)



        btnLogin.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()

            val password = etPassword.text.toString()

            if ((mobileNumber == validMobileNumber) && (password == validPassword)) {


                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)

            }else {
                Toast.makeText(
                    this@LoginActivity,
                    "We Clicked the button",
                    Toast.LENGTH_LONG
                ).show()
            }

        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }


}


