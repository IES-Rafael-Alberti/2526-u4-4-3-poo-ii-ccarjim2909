package org.iesra

class Persona(val dni: String) {

    val cuentas: Array<Cuenta?> = arrayOfNulls(3)


    fun anadirCuenta(cuenta: Cuenta): Boolean {
        for (i in cuentas.indices) {
            if (cuentas[i] == null) {
                cuentas[i] = cuenta
                return true
            }
        }
        return false
    }
}


