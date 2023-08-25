package com.aydanilozyurek.kotlinstoringdata

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aydanilozyurek.kotlinstoringdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // SharedPreferences - XML --> Key - Value pairing (small data --> ex: game score)
        // MODE_PRIVATE --> only my app can access my data (Context.MODE_PRIVATE)
        sharedPref = this.getSharedPreferences("com.aydanilozyurek.kotlinstoringdata", MODE_PRIVATE)
        val userAgePref = sharedPref.getInt("age", -1)
        if (userAgePref == -1) {
            binding.textView.text = "Your Age: "
        } else {
            binding.textView.text = "Your Age: ${userAgePref}"
        }
    }

    fun save(view: View) {
        val myAge = binding.editText.text.toString().toIntOrNull()

        if (myAge != null) {
            binding.textView.text = "Your Age: ${myAge}"
            // store the age
            sharedPref.edit().putInt("age", myAge).apply() //.commit() --> boolean
        }
    }

    fun delete(view: View) {
        val userAgePref = sharedPref.getInt("age", -1)

        if (userAgePref != -1) {
            sharedPref.edit().remove("age").apply()
            binding.textView.text = "Your Age: "

        }
    }
}