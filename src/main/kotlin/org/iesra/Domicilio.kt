package org.iesra


data class Domicilio (val calle: String, val numero: Int) {
    fun dirCompleta(calle: String , numero: Int) : String {
        val domicilio = calle + numero
        return domicilio
    }
}


