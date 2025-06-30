import java.util.ArrayList;

class AsignaturasCurso {
    public static void main(String[] args) {
        // Crear una lista para almacenar las asignaturas
        ArrayList<String> asignaturas = new ArrayList<>();

        // Agregar asignaturas a la lista
        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Química");
        asignaturas.add("Historia");
        asignaturas.add("Lengua");

        // Mostrar un mensaje de bienvenida
        System.out.println(" ¡Hola! Bienvenido al sistema de gestión del curso.");
        System.out.println(" Aquí tienes la lista de asignaturas que cursarás este año:\n");

        // Mostrar cada asignatura con formato
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + asignaturas.get(i));
        }

        // Mensaje final
        System.out.println("\n ¡Listo! Ya puedes comenzar a estudiar. ¡Mucho éxito! ");
    }
}


