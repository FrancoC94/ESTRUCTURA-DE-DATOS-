import java.util.ArrayList;
import java.util.Collections;

class NumerosInversos {
    public static void main(String[] args) {
        // Crear la lista con los números del 1 al 10
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Invertir la lista
        Collections.reverse(numeros);

        // Mostrar los números separados por comas
        System.out.print("Números en orden inverso: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

