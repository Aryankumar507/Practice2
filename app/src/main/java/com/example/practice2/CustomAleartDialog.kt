package com.example.practice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import cn.pedant.SweetAlert.SweetAlertDialog

class CustomAleartDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_aleart_dialog)

        val Button1 = findViewById<TextView>(R.id.btn1)
        val Button2 = findViewById<TextView>(R.id.btn2)
        val Button3 = findViewById<TextView>(R.id.btn3)

        Button1.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Successfull")
                .setContentText("Successfully Add")
                .show()
        }
        Button2.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.PROGRESS_TYPE)
                .setTitleText("Progress")
                .setContentText("In Progress")
                .show()
        }

        Button3.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error")
                .setContentText("Please try again")
                .show()
        }
    }
}