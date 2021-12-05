package com.example.newkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener(View.OnClickListener() {
            val result = etVar1.text.toString().toInt() + etVar2.text.toString().toInt()
            tvResult.text = result.toString()
            Toast.makeText(this@MainActivity, "Addition Done!", Toast.LENGTH_SHORT).show()
        })
        btnSub.setOnClickListener(View.OnClickListener() {
            val result = etVar1.text.toString().toInt() - etVar2.text.toString().toInt()
            tvResult.text = result.toString()
            Toast.makeText(this@MainActivity, "Subtraction Done!", Toast.LENGTH_SHORT).show()
        })
        btnMul.setOnClickListener(View.OnClickListener() {
            val result = etVar1.text.toString().toInt() * etVar2.text.toString().toInt()
            tvResult.text = result.toString()
            Toast.makeText(this@MainActivity, "Multiplication Done!", Toast.LENGTH_SHORT).show()
        })
        btnDiv.setOnClickListener(View.OnClickListener() {
            val result = etVar1.text.toString().toInt() / etVar2.text.toString().toInt()
            tvResult.text = result.toString()
            Toast.makeText(this@MainActivity, "Division Done!", Toast.LENGTH_SHORT).show()
        })
    }
}