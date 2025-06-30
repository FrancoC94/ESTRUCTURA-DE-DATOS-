
import java.util.ArrayList;
import java.util.Scanner;

class NotasAsignaturas {
    public static void main(String[] args) {
        // Lista de asignaturas
        ArrayList<String> asignaturas = new ArrayList<>();
        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Química");
        asignaturas.add("Historia");
        asignaturas.add("Lengua");

        // Lista para guardar las notas
        ArrayList<Double> notas = new ArrayList<>();

        // Objeto para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir las notas al usuario
        for (String asignatura : asignaturas) {
            System.out.print("¿Qué nota has sacado en " + asignatura + "? ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        // Mostrar las asignaturas con sus notas
        System.out.println("\nResumen de tus calificaciones:");
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println("En " + asignaturas.get(i) + " has sacado " + notas.get(i));
        }

        scanner.close();
    }
}

