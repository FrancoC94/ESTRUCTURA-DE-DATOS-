import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val consultorio = Consultorio()

        consultorio.agregarTurno("María")
        consultorio.agregarTurno("José")
        consultorio.agregarTurno("Lucía")

        println("\n--- Lista de turnos ---")
        consultorio.mostrarTurnos()

        println("\n--- Atendiendo al primer paciente ---")
        consultorio.atenderPaciente()

        println("\n--- Lista actualizada de turnos ---")
        consultorio.mostrarTurnos()
    }
}

internal class Consultorio {
    private val turnos: Queue<String> = LinkedList()

    fun agregarTurno(nombre: String) {
        turnos.add(nombre)
        println("Turno agregado para: $nombre")
    }

    fun atenderPaciente() {
        val paciente = turnos.poll()
        if (paciente != null) {
            println("Paciente atendido: $paciente")
        } else {
            println("No hay pacientes en espera.")
        }
    }

    fun mostrarTurnos() {
        if (turnos.isEmpty()) {
            println("No hay turnos registrados.")
        } else {
            println("Pacientes en espera:")
            for (nombre in turnos) {
                println("- $nombre")
            }
        }
    }
}

