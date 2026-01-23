package org.iesra

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(val id: Int, val descripcion: String) {
    var realizada: Boolean = false
    var fechaRealizacion: String? = null

    fun marcarComoRealizada() {
        if (realizada == false) {
            realizada = true
            val ahora = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            fechaRealizacion = ahora.format(formatter)
        }
    }

    override fun toString(): String {
        return if (realizada) {
            "[$id] $descripcion ✔ (Realizada el $fechaRealizacion)"
        } else {
            "[$id] $descripcion ⏳ (Pendiente)"
        }
    }
}
