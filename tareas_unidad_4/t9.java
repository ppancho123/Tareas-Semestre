import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        int sumaPrincipal = 0, sumaSecundaria = 0;

        System.out.println("Matriz generada con valores aleatorios:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                System.out.print(matriz[i][j] + "\t");

                if (i == j) sumaPrincipal += matriz[i][j];
                if (i + j == n - 1) sumaSecundaria += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);
    }
}