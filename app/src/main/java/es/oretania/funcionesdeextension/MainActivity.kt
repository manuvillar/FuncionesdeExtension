package es.oretania.funcionesdeextension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.oretania.funcionesdeextension.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.idBoton.setOnClickListener{
            //Usamos la función de extensión toast
            toast("Mensaje de duración corta")
            toast("Mensaje de duración larga", Toast.LENGTH_LONG)

            val age:Int? = null
            if(age.esNulo()){
                toast("Age es nulo")
            }
        }
    }
}