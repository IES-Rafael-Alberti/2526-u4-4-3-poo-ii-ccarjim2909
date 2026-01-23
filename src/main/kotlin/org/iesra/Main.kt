package org.iesra

fun main() {


    println("\nEjercicio 4.6")
    println("--------------------------------")


    val domicilio1 = Domicilio("Avenida Ronda del estero", 59)
    val cliente1 = Cliente("Cristian", domicilio1)
    val compra1 = Compra(cliente1,"Miercoles", 35.9)



    println(domicilio1)
    println(cliente1)
    println(compra1)



    println("\nEjercicio 4.7")
    println("--------------------------------")

    val persona = Persona("12345678A")

    val c1 = Cuenta(1, 0.0)
    val c2 = Cuenta(2, 700.0)

    persona.anadirCuenta(c1)
    persona.anadirCuenta(c2)

    c1.recibirAbono(1100.0)
    c2.realizarPago(750.0)

    println("¿Es morosa? ${c1.esMorosa(persona)}")





    println("\nEjercicio 4.8")
    println("--------------------------------")



        val conjunto = ConjuntoLibros(5)

        val libro1 = Libro("Mein Kampf", "Adolf Hitler", 345, 10)
        val libro2 = Libro("El Quijote", "Cervantes", 678, 9)

        conjunto.anadirLibro(libro1)
        conjunto.anadirLibro(libro2)

        conjunto.mostrarTodo()


        conjunto.eliminarPorTitulo("Mein Kampf")


        conjunto.eliminarPorAutor("Cervantes")


        conjunto.mostrarTodo()


        val libro3 = Libro("Hijos de la revolucion", "Antonio Guillermo Yuste", 567, 8)
        conjunto.anadirLibro(libro3)


        conjunto.mostrarTodo()





    println("\nEjercicio 4.9")
    println("--------------------------------")


    val lista = ListaTareas()
    var opcion: Int

    do {
        println(
            """
        ---- MENÚ ----
        1. Agregar tarea
        2. Eliminar tarea
        3. Marcar tarea como realizada
        4. Mostrar todas las tareas
        5. Mostrar tareas pendientes
        6. Mostrar tareas realizadas
        0. Salir
        ----------------
    """
        )

        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Descripción: ")
                val desc = readLine()!!
                lista.agregarTarea(desc)
            }

            2 -> {
                print("ID de la tarea a eliminar: ")
                val id = readLine()!!.toInt()
                if (!lista.eliminarTarea(id)) {
                    println("Tarea no encontrada")
                }
            }

            3 -> {
                print("ID de la tarea a marcar como realizada: ")
                val id = readLine()!!.toInt()
                if (!lista.marcarTareaRealizada(id)) {
                    println("Tarea no encontrada")
                }
            }

            4 -> lista.mostrarTodas()
            5 -> lista.mostrarPendientes()
            6 -> lista.mostrarRealizadas()
            0 -> println("Saliendo...")
            else -> println("Opción incorrecta")
        }

        } while (opcion != 0)



}
