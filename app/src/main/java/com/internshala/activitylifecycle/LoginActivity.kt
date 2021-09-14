package com.internshala.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {

    }
    lateinit var etMobileNumber:EditText
    lateinit var etPass:EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister:TextView
    val ValidMobileNumber = "8447911529"
    val Credentials = arrayOf("tony","steve","hulk","avenger")


    lateinit var etTextToPass:EditText
    lateinit var btnPassData:Button

   // lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

      //  sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)

      //  val isLoggedIn = sharedPreferences.getBoolean("isLengthIn",false)

      /*  if(isLoggedIn){
            val intent = Intent(this@LoginActivity,AvengersActivity::class.java)
        }else{

        }*/


        title = "Log In"
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPass = findViewById(R.id.etPass)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        etTextToPass = findViewById(R.id.etTextToPass)
        btnPassData = findViewById(R.id.btnPassData)

        var user = "Avengers"

        btnLogin.setOnClickListener{
            val mobilenumber = etMobileNumber.text.toString()
            val password = etPass.text.toString()
          val intent = Intent(this@LoginActivity,AvengersActivity::class.java)
            if ((mobilenumber==ValidMobileNumber)) {

                when (password) {
                    Credentials[0] -> {
                        user = "Tony Stark"
                       // savePreferences(user)
                        intent.putExtra("Name", user)
                        startActivity(intent)
                    }
                    Credentials[1] -> {
                        user = "Captain America"
                      //  savePreferences(user)
                        intent.putExtra("Name", user)
                        startActivity(intent)
                    }
                    Credentials[2] -> {

                        user = "The Hulk"
                        //savePreferences(user)
                        intent.putExtra("Name", user)
                        startActivity(intent)
                    }
                    Credentials[3] -> {

                        user = "The Avengers"
                        //savePreferences(user)
                        intent.putExtra("Name", user)
                        startActivity(intent)
                    }
                    else -> Toast.makeText(this@LoginActivity, "Incorrect Password", Toast.LENGTH_LONG).show()
                }

            } else {

                Toast.makeText(this@LoginActivity, "Incorrect Credentials", Toast.LENGTH_LONG).show()

            }
            if(mobilenumber=="" && password==""){
                Toast.makeText(this@LoginActivity,"Enter Credentials",Toast.LENGTH_SHORT).show()
        }

        }
        btnPassData.setOnClickListener{
            val data = etTextToPass.text.toString()
            val intent = Intent(this@LoginActivity,MessageActivity::class.java)
            intent.putExtra("Data",data)
            startActivity(intent)
        }



    }


    override fun onPause() {
        super.onPause()
        finish()
    }

  /*  fun savePreferences(title:String){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("Title", title).apply()

    }*/

}