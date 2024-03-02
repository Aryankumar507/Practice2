package com.example.practice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<TextView>(R.id.btn)

        Button.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage("Are you sure ?")
            dialog.setIcon(R.drawable.baseline_delete_24)

            dialog.setNegativeButton("No"){dialogInterface,which ->
                Toast.makeText(this,"your post are always looking cool",Toast.LENGTH_SHORT).show()
            }
            dialog.setPositiveButton("Yes"){dialogInterface,which ->
                Toast.makeText(this,"Succesfully Deleted",Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("Cancle"){dialogInterface,which ->
                Toast.makeText(this,"Succesfully Cancled",Toast.LENGTH_SHORT).show()
            }

            val Alert:AlertDialog = dialog.create()
                Alert.setCancelable(false)
                Alert.show()

        }

    }
}