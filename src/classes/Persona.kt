package classes

open class Persona(var nombre: String, var edad: Int, var id: String) {

    open fun mostrarRol() {
        println("Rol: Desconocido")
    }
}