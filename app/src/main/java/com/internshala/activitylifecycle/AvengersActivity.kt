package com.internshala.activitylifecycle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.internshala.activitylifecycle.R.layout.scrollview_example

class AvengersActivity : AppCompatActivity() {
 var titlename: String? = "Avengers"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(scrollview_example)

        if(intent != null){
            titlename =  intent.getStringExtra("Name")
        }
        //titlename = SharedPreferences.getString("title","The Avengers")
        title = titlename
    }
/*
    override fun onStart(){
        super.onStart()
        println("onStart called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy is called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop is called ")
    }

    override fun onRestart(){
        super.onRestart()
        println("onRestart is called")
    }*/
}