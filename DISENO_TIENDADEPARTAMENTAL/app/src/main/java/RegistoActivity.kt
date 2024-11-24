package com.example.tiendadepartamental

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.coppelapp.LoginActivity
import com.example.diseno_tiendadepartamental.R

class RegistoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        // Referencias a los elementos
        val btnVolver = findViewById<Button>(R.id.btnVolver)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etContraseña = findViewById<EditText>(R.id.etContraseña)
        val btnComprobante = findViewById<Button>(R.id.btnComprobante)
        val btnIne = findViewById<Button>(R.id.btnIne)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        // Botón Volver
        btnVolver.setOnClickListener {
            finish() // Cierra la actividad actual
        }

        // Selección de archivo (simulada, ya que depende del backend o una configuración más avanzada)
        btnComprobante.setOnClickListener {
            Toast.makeText(this, "Seleccionar archivo PDF", Toast.LENGTH_SHORT).show()
        }

        btnIne.setOnClickListener {
            Toast.makeText(this, "Seleccionar archivo PNG", Toast.LENGTH_SHORT).show()
        }

        // Botón Registrar
        btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val correo = etCorreo.text.toString()
            val contraseña = etContraseña.text.toString()

            if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registro exitoso. Bienvenido, $nombre!", Toast.LENGTH_SHORT).show()
                // Redirigir al inicio (simulado)
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
