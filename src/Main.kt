import classes.*

fun main() {
    // * Instancia de estudiante
    val estudiante = Estudiante("Juan Pérez", 20, "E123", "Ingeniería", 8.5)
    estudiante.mostrarRol()
    println()

    // * Instancia de profesor
    val profesor = Profesor("María López", 45, "P456", "Matemáticas", 15)
    profesor.mostrarRol()
}