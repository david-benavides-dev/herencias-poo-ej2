package classes

class Profesor(nombre: String, edad: Int, id: String, private var departamento: String, private var aniosExperiencia: Int): Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Profesor\nDepartamento: $departamento")
        mostrarExpereriencia()
    }

    private fun mostrarExpereriencia() {
        println("Años de experiencia: $aniosExperiencia")
    }
}