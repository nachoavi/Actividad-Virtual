package com.leodev.a01_linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumerOne = findViewById<EditText>(R.id.editNumberOne)
        val inputNumerTwo = findViewById<EditText>(R.id.editNumberTwo)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val resul = findViewById<TextView>(R.id.resultado)


        btnSumar.setOnClickListener {
            val suma = inputNumerOne.text.toString().toInt() + inputNumerTwo.text.toString().toInt()
            resul.text = "Resultado: $suma"
            //Toast.makeText(this, "La suma es: " + suma, Toast.LENGTH_LONG).show()
        }

        btnRestar.setOnClickListener{
            val resta = inputNumerOne.text.toString().toInt() - inputNumerTwo.text.toString().toInt()
            //Toast.makeText(this, "La resta es: " + resta, Toast.LENGTH_LONG).show()
            resul.text = "Resultado: $resta"
        }

        btnMul.setOnClickListener{
            val mul = inputNumerOne.text.toString().toInt() * inputNumerTwo.text.toString().toInt()
            //Toast.makeText(this, "La multiplicación es: " + mul, Toast.LENGTH_LONG).show()
            resul.text = "Resultado: $mul"
        }

        btnDiv.setOnClickListener{
            if (inputNumerTwo.text.toString().toInt() == 0){
                //Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_LONG).show()
                resul.text = "No se puede dividir por cero"
            }else {
                val div = inputNumerOne.text.toString().toInt() / inputNumerTwo.text.toString().toInt()
                //Toast.makeText(this, "La divición es: " + div, Toast.LENGTH_LONG).show()
                resul.text = "Resultado: $div"
            }
        }


    }
}














