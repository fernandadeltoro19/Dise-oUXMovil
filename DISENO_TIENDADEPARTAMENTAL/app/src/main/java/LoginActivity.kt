package com.example.coppelapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.diseno_tiendadepartamental.R
import com.example.tiendadepartamental.RegistoActivity

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Referencias a los elementos del diseño
        val etUsuario = findViewById<EditText>(R.id.et_usuario)
        val etContraseña = findViewById<EditText>(R.id.et_contraseña)
        val tvErrorMessage = findViewById<TextView>(R.id.tv_error_message)
        val btnIniciarSesion = findViewById<Button>(R.id.btn_iniciar_sesion)
        val tvRegister = findViewById<TextView>(R.id.tv_register)

        // Botón de iniciar sesión
        btnIniciarSesion.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val contraseña = etContraseña.text.toString()

            if (usuario.isEmpty() || contraseña.isEmpty()) {
                tvErrorMessage.visibility = View.VISIBLE
            } else {
                tvErrorMessage.visibility = View.GONE
                Toast.makeText(this, "Bienvenido, $usuario", Toast.LENGTH_SHORT).show()

                // Abrir nueva actividad (por ejemplo, página de datos del cliente)
                val intent = Intent(this, DatosClienteActivity::class.java)
                startActivity(intent)
            }
        }

        // Redirigir al registro
        tvRegister.setOnClickListener {
            val intent = Intent(this, RegistoActivity::class.java)
            startActivity(intent)
        }
    }
}
