package com.example.alquiler_vehiculos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.R
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.VehiculosProvider.Companion.vehiculosList

class VehiculosAdapter (private val vehiculosList:List<Vehiculos>) : RecyclerView.Adapter<VehiculosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiculosViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return VehiculosViewHolder(layoutInflater.inflate(R.layout.item_vehiculo,parent,false))
    }

    override fun getItemCount(): Int {
        return vehiculosList.size
    }

    override fun onBindViewHolder(holder: VehiculosViewHolder, position: Int) {
        val item = vehiculosList[position]
        holder.render(item)
    }
}