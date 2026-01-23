package org.iesra

class ListaTareas {

    private val tareas = mutableListOf<Tarea>()
    private var contadorId = 1

    fun agregarTarea(descripcion: String) {
        val tarea = Tarea(contadorId, descripcion)
        tareas.add(tarea)
        contadorId++
    }

    fun eliminarTarea(id: Int): Boolean {
        return tareas.removeIf { it.id == id }
    }

    fun marcarTareaRealizada(id: Int): Boolean {
        val tarea = tareas.find { it.id == id }
        tarea?.marcarComoRealizada()
        return tarea != null
    }

    fun mostrarTodas() {
        if (tareas.isEmpty()) {
            println("No hay tareas")
        } else {
            tareas.forEach { println(it) }
        }
    }

    fun mostrarPendientes() {
        tareas.filter { !it.realizada }
            .forEach { println(it) }
    }

    fun mostrarRealizadas() {
        tareas.filter { it.realizada }
            .forEach { println(it) }
    }
}
