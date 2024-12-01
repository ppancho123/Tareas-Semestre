import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Ingresa 15 números enteros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0], menor = numeros[0];
        int posMayor = 0, posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Número mayor: " + mayor + " en la posición " + posMayor);
        System.out.println("Número menor: " + menor + " en la posición " + posMenor);
    }
}