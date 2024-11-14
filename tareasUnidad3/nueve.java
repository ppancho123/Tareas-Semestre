import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        System.out.println("Ingrese el rango:");
        int rango = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + " hasta " + rango + ":");
        for (int i = 1; i <= rango; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
    }
}