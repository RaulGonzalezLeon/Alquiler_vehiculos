package com.example.alquiler_vehiculos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class VehiculosViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemVehiculoBinding.bind(view)
    fun render(vehiculosModel: Vehiculos){
        binding.ModeloVehiculo.text= vehiculosModel.modelo
        binding.PlazasVehiculo.text= vehiculosModel.plazas.toString()
        binding.CapacidadVehiculo.text= vehiculosModel.capacidad

        /* Aqui escribimos la vista para acceder a las imagenes  */
        Glide.with(binding.ImagenVehiculo.context).load(vehiculosModel.imagen).into(binding.ImagenVehiculo)
    }
}