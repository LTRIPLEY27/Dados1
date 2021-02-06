package org.insbaixcamp.dados


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private var devuelveImagen = mutableListOf<Int>() // atributo del objeto dado (array de imágenes)
    private lateinit var retornaResultado: ImageView  // obliga a usar un modificador lateint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retornaResultado = findViewById(R.id.imagebDado)   // hace el llamado al imageView del activiyMain

        val botonInicio = findViewById<Button>(R.id.botonInicio)  // have el llamado al botton

        botonInicio.setOnClickListener {

            botonInicio.isEnabled = true   // condicional para que el boton se reinicie y esté disponible
            getValorAzar()   //  de cumplirse, obtener el resultado de la función azar
        }
            // se almacenan los drawables en el arreglo
        devuelveImagen.add(R.drawable.ig_dado_uno)
        devuelveImagen.add(R.drawable.ig_dado_dos)
        devuelveImagen.add(R.drawable.ig_dado_tres)
        devuelveImagen.add(R.drawable.ig_dado_cuatro)
        devuelveImagen.add(R.drawable.ig_dado_cinco)
        devuelveImagen.add(R.drawable.ig_dado_seis)

    }

    private fun getValorAzar(){    // función para retornar el número azar entre un rango del 1 al 6

        val azar = (1..6).random()

        retornaResultado.setImageResource(devuelveImagen.elementAt(azar))   // a la variable "retornaResultado" le adherimos el numero retorno de la variable azar, haciendo uso del arreglo

    }

}
