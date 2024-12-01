import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos elementos tendrá el arreglo? ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        boolean[] contado = new boolean[n];

        System.out.println("Ingresa los elementos:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (!contado[i]) { 
                int cuenta = 1;
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        cuenta++;
                        contado[j] = true;
                    }
                }
                System.out.println("Número " + arreglo[i] + " aparece " + cuenta + " veces.");
            }
        }

    }
}