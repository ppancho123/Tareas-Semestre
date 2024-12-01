import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        int mayor = Integer.MIN_VALUE;
        int filaMayor = 0, columnaMayor = 0;

        System.out.println("Matriz generada con valores aleatorios:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1; 
                System.out.print(matriz[i][j] + "\t");

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
            System.out.println();
        }

        System.out.println("El mayor elemento es: " + mayor + " en la posición [" + filaMayor + "][" + columnaMayor + "]");
    }
}