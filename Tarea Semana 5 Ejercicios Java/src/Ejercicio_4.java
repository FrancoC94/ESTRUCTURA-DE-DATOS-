import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NumerosLoteria {
    public static void main(String[] args) {
        // Crear una lista para almacenar los números
        ArrayList<Integer> numerosLoteria = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los 6 números ganadores de la lotería primitiva:");

        // Pedir 6 números al usuario
        for (int i = 1; i <= 6; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            numerosLoteria.add(numero);
        }

        // Ordenar la lista de menor a mayor
        Collections.sort(numerosLoteria);

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ganadores ordenados de menor a mayor:");
        for (int numero : numerosLoteria) {
            System.out.println(numero);
        }

        scanner.close();
    }
}

