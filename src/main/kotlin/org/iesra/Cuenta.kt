package org.iesra
import Persona

class Cuenta (var numero: Int, var saldo: Double) {


    fun saldoDisponibles(): Double {
        return saldo
    }

    fun recibirAbono(cantidad: Double){
        require(numero > 0 ) { "cantidad tiene que ser mayor a 0" }
        saldo += cantidad
    }

    fun realizarPago(cantidad: Double) {
        require(numero > 0 ) { "cantidad tiene que ser mayor a 0" }
        saldo -= cantidad
    }

    fun esMorosa(persona: Persona): Boolean {
        if (persona.cuentas < 0.0 )
            return true
        else{
            return false}
    }


}


fun main() {
    var cuenta1 = Cuenta(1,0.0)
    var cuenta2 = Cuenta(12,700.0)
    println(cuenta1.saldoDisponibles())
    println(cuenta2.saldoDisponibles())

    println(cuenta1.recibirAbono(1100.0))
    println(cuenta2.realizarPago(750.0))


}
