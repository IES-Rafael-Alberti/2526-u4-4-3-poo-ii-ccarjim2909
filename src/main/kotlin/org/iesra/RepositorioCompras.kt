package org.iesra

class RepositorioCompras {
    var compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): Set<Domicilio>  {
        return compras.map {it.cliente.domicilio}.toSet()
    }


}