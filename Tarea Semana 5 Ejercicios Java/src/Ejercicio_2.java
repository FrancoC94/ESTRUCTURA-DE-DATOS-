import java.util.ArrayList;

class Ejercicio_2 {
    public static void main(String[] args) {
        ArrayList<String> asignaturas = new ArrayList<>();

        asignaturas.add("Matemáticas");
        asignaturas.add("Física");
        asignaturas.add("Química");
        asignaturas.add("Historia");
        asignaturas.add("Lengua");

        for (String asignatura : asignaturas) {
            System.out.println("Yo estudio " + asignatura + ".");
        }
    }
}
