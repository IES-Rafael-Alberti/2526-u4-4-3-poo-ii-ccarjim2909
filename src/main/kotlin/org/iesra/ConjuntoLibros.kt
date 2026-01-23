package org.iesra

class ConjuntoLibros(private val capacidad: Int) {

    private val libros: Array<Libro?> = arrayOfNulls(capacidad)

    fun anadirLibro(libro: Libro): Boolean {
        for (l in libros) {
            if (l != null && l.titulo == libro.titulo && l.autor == libro.autor) {
                return false
            }
        }

        for (i in libros.indices) {
            if (libros[i] == null) {
                libros[i] = libro
                return true
            }
        }
        return false
    }

    fun eliminarPorTitulo(titulo: String): Boolean {
        for (i in libros.indices) {
            if (libros[i] != null && libros[i]!!.titulo == titulo) {
                libros[i] = null
                return true
            }
        }
        return false
    }

    fun eliminarPorAutor(autor: String): Boolean {
        var eliminado = false
        for (i in libros.indices) {
            if (libros[i] != null && libros[i]!!.autor == autor) {
                libros[i] = null
                eliminado = true
            }
        }
        return eliminado
    }

    fun mostrarMayorCalificacion() {
        var mejor: Libro? = null

        for (libro in libros) {
            if (libro != null) {
                if (mejor == null || libro.calificacion > mejor.calificacion) {
                    mejor = libro
                }
            }
        }

        if (mejor != null) {
            println("Libro con mayor calificacion:")
            println(mejor)
        } else {
            println("No hay libros")
        }
    }

    fun mostrarMenorCalificacion() {
        var peor: Libro? = null

        for (libro in libros) {
            if (libro != null) {
                if (peor == null || libro.calificacion < peor.calificacion) {
                    peor = libro
                }
            }
        }

        if (peor != null) {
            println("Libro con menor calificacion:")
            println(peor)
        } else {
            println("No hay libros")
        }
    }

    fun mostrarTodo() {
        println("Contenido del conjunto:")
        for (libro in libros) {
            if (libro != null) {
                println(libro)
            }
        }
    }
}
