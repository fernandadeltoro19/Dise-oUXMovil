package com.example.productos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.coppelapp.DatosClienteActivity
import com.example.diseno_tiendadepartamental.R

class ProductosDisponiblesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.productosdisponibles)

        val backButton: Button = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            // Simular regresar a otra actividad
            val intent = Intent(this, DatosClienteActivity::class.java)
            startActivity(intent)
        }
    }
}
