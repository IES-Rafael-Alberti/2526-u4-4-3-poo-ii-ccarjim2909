package org.iesra

class Cuenta (var numero: Int, var saldo: Double) {


    fun saldoDisponibles(): Double {
        return saldo
    }

    fun recibirAbono(cantidad: Double){
        require(cantidad > 0 ) { "cantidad tiene que ser mayor a 0" }
        saldo += cantidad
    }

    fun realizarPago(cantidad: Double) {
        require(cantidad > 0 ) { "cantidad tiene que ser mayor a 0" }
        saldo -= cantidad
    }

    fun esMorosa(persona: Persona): Boolean {
        for (cuenta in persona.cuentas) {
            if (cuenta != null && cuenta.saldo < 0) {
                return true
            }
        }
        return false
    }
}