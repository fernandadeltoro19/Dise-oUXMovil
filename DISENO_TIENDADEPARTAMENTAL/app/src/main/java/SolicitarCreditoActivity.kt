package com.example.solicitudcredito

import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.diseno_tiendadepartamental.R

class SolicitarCreditoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.solicitarcredito)

        // Referencias a las vistas
        val backButton: ImageButton = findViewById(R.id.backButton)
        val nombreEditText: EditText = findViewById(R.id.nombreEditText)
        val montoEditText: EditText = findViewById(R.id.montoEditText)
        val motivoEditText: EditText = findViewById(R.id.motivoEditText)
        val terminosCheckBox: CheckBox = findViewById(R.id.terminosCheckBox)
        val subirEstadoButton: Button = findViewById(R.id.subirEstadoButton)
        val enviarSolicitudButton: Button = findViewById(R.id.enviarSolicitudButton)

        // Funcionalidad del botón "Volver"
        backButton.setOnClickListener {
            finish() // Finaliza la actividad actual y vuelve a la anterior
        }

        // Funcionalidad del botón "Subir Estado de Cuenta"
        subirEstadoButton.setOnClickListener {
            Toast.makeText(this, "Selecciona un archivo PDF (Funcionalidad pendiente)", Toast.LENGTH_SHORT).show()
        }

        // Funcionalidad del botón "Enviar Solicitud"
        enviarSolicitudButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val monto = montoEditText.text.toString()
            val motivo = motivoEditText.text.toString()
            val terminosAceptados = terminosCheckBox.isChecked

            when {
                nombre.isEmpty() -> {
                    Toast.makeText(this, "Por favor, ingrese su nombre completo.", Toast.LENGTH_SHORT).show()
                }
                monto.isEmpty() -> {
                    Toast.makeText(this, "Por favor, ingrese el monto solicitado.", Toast.LENGTH_SHORT).show()
                }
                motivo.isEmpty() -> {
                    Toast.makeText(this, "Por favor, ingrese el motivo del aumento.", Toast.LENGTH_SHORT).show()
                }
                !terminosAceptados -> {
                    Toast.makeText(this, "Debe aceptar los términos y condiciones.", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, "Solicitud enviada con éxito.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
