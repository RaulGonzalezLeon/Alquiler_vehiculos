package com.example.alquiler_vehiculos

class VehiculosProvider {
    companion object{
        val vehiculosList = listOf<Vehiculos>(
            Vehiculos(
                imagen = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "Carrozado con Trampilla",
                plazas = 3,
                capacidad = "20M3"
            ),
            Vehiculos(
                imagen = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "Carrozado sin Trampilla",
                plazas = 3,
                capacidad = "20M3"
            ),
            Vehiculos(
                imagen = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg",
                modelo = "Furgoneta Grande",
                plazas = 3,
                capacidad = "15M3"
            ),
            Vehiculos(
                imagen = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg",
                modelo = "Furgoneta Mediana",
                plazas = 3,
                capacidad = "8M3"
            ),
            Vehiculos(
                imagen = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg",
                modelo = "Furgoneta Pequeña",
                plazas = 2,
                capacidad = "4M3"
            ),
        )
    }
}