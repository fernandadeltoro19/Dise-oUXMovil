package com.example.coppelapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.diseno_tiendadepartamental.R

class PagoActitivty : ComponentActivity() {

    private val montoPendiente = 500 // Monto pendiente

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pago)

        // Referencias a los elementos de la interfaz
        val btnVolver = findViewById<ImageButton>(R.id.btnVolver)
        val montoPagoInput = findViewById<EditText>(R.id.inputMonto)
        val btnPagar = findViewById<Button>(R.id.btnPagar)

        // Acción del botón "Volver"
        btnVolver.setOnClickListener {
            finish() // Finaliza la actividad actual y vuelve a la anterior
        }

        // Acción del botón "Pagar"
        btnPagar.setOnClickListener {
            val montoPago = montoPagoInput.text.toString().toIntOrNull()

            when {
                montoPago == null -> Toast.makeText(this, "Por favor, ingresa un monto válido.", Toast.LENGTH_SHORT).show()
                montoPago < montoPendiente -> Toast.makeText(this, "El monto ingresado es menor al pendiente.", Toast.LENGTH_SHORT).show()
                montoPago > montoPendiente -> Toast.makeText(this, "El monto ingresado excede el monto pendiente.", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this, "Pago realizado con éxito.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
