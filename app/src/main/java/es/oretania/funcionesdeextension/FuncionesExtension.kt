package es.oretania.funcionesdeextension

import android.app.Activity
import android.widget.Toast

//Creamos una función que extienda de Activity y recibirá un parámetro
// obligatorio (el texto a mostrar) y uno opcional, la longitud,
// ya que tiene un valor por defecto de tipo LENGTH_SHORT.
fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

//Comprueba si es null cualquier tipo de dato. Esta función extiende de Any,
// es decir, cualquier cosa y como puede ser null, tiene que llevar la
// interrogación (?). Luego simplemente vamos a devolver si this (cualquier
// objeto con el cual usemos esta función de extensión) es null.
fun Any?.esNulo() = this == null