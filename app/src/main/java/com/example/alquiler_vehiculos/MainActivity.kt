package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.adapter.VehiculosAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Añadimos al boton el layout para asi al pulsarlo que se muestreS*/
        binding.botonMostrar.setOnClickListener(){
            binding.recyclerView.layoutManager = LinearLayoutManager(this)
            binding.recyclerView.adapter = VehiculosAdapter(VehiculosProvider.vehiculosList)
        }



        /* Aqui creamos un boton que su funcion es mostar un mensaje en funcion
        * de si guarda o no los datos*/
        binding.botonGuardar.setOnClickListener(){
            AlertDialog.Builder(this)
                .setTitle("Confirmacion")
                .setMessage("¿Desea guardar los datos?")
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok, {dialog, which ->
                    Toast.makeText(applicationContext, "Datos Guardados", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton(android.R.string.cancel, {dialog, which ->
                    Toast.makeText(applicationContext, "No se han guardado los datos", Toast.LENGTH_SHORT).show()
                })
                .show()
        }

    }
}