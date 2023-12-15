package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Jardin botanico", "jardinb", "El Jardín Botánico de Bogotá es un parque de 19,5 hectáreas con más de 10.000 especies de plantas de todo el mundo. Cuenta con un bosque tropical, un jardín de orquídeas, un jardín de bromelias y un jardín de helechos. "),
                Sitio("museo nacional", "museo_nal", "El Museo Nacional de Colombia es un museo ubicado en la ciudad de Bogotá, Colombia. Fue fundado en 1823 y es el museo más antiguo de la República de Colombia. El museo alberga una colección de más de 20.000 objetos que representan la historia, el arte y la cultura de Colombia."),
                Sitio("Museo del oro", "museo_oro", "El Museo del Oro del Banco de la República es un museo ubicado en la ciudad de Bogotá, Colombia. Fue fundado en 1939 y alberga la colección de orfebrería precolombina más importante del mundo. "),
                Sitio("Plaza de bolivar", "plazabolivar", "La Plaza de Bolívar es la plaza principal de la ciudad de Bogotá, Colombia. Está ubicada en el centro histórico de la ciudad, entre las carreras Séptima y Octava con calles Décima y Once.")
            )
        )

    }
}
