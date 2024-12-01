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

        System.out.println("Matriz generada con valores aleatorios:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Ingresa la primera fila a intercambiar (0 a " + (filas - 1) + "): ");
        int fila1 = scanner.nextInt();
        System.out.print("Ingresa la segunda fila a intercambiar (0 a " + (filas - 1) + "): ");
        int fila2 = scanner.nextInt();

        for (int j = 0; j < columnas; j++) {
            int temp = matriz[fila1][j];
            matriz[fila1][j] = matriz[fila2][j];
            matriz[fila2][j] = temp;
        }

        System.out.println("Matriz después de intercambiar filas:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}