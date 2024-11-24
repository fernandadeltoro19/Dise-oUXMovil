package com.example.coppelapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import com.example.coppelapp.PagoActitivty
import com.example.diseno_tiendadepartamental.R
import com.example.productos.ProductosDisponiblesActivity
import com.example.solicitudcredito.SolicitarCreditoActivity

class DatosClienteActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datoscliente)

        // Botón para volver
        findViewById<ImageButton>(R.id.btnVolver).setOnClickListener {
            finish() // Regresa a la pantalla anterior
        }

        // Botón para ver productos
        findViewById<ImageButton>(R.id.btnVerProductos).setOnClickListener {
            startActivity(Intent(this, ProductosDisponiblesActivity::class.java))
        }

        // Botón Pagar Ahora
        findViewById<Button>(R.id.btnPagar).setOnClickListener {
            startActivity(Intent(this, PagoActitivty::class.java))
        }

        // Botón Solicitar Crédito
        findViewById<Button>(R.id.btnSolicitarCredito).setOnClickListener {
            startActivity(Intent(this, SolicitarCreditoActivity::class.java))
        }
    }
}
