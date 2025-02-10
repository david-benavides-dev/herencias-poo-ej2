package classes

class Estudiante(nombre: String, edad: Int, id: String, private var curso: String, private var calificacionPromedio: Double) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Estudiante\nCurso: $curso")
        mostrarCalificacion()
    }

    private fun mostrarCalificacion() {
        println("Calificación promedio: $calificacionPromedio")
    }
}