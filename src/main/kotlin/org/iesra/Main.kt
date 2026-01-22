package org.iesra

fun main() {

    val domicilio1 = Domicilio("Avenida Ronda del estero", 59)
    val cliente1 = Cliente("Cristian", domicilio1)
    val compra1 = Compra(cliente1,"Miercoles", 35.9)





    println(domicilio1)
    println(cliente1)
    println(compra1)


    }
