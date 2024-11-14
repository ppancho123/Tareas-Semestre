import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinanza!");
        System.out.println("La computadora ha elegido un número entre 1 y 100.");
        System.out.println("Tienes que adivinar el número.");

        while (true) {
            System.out.println("Ingrese un número:");
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número que ingresaste es menor que el número secreto.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número que ingresaste es mayor que el número secreto.");
            } else {
                System.out.println("Felicidades! Adivinaste el número secreto en " + intentos + " intentos.");
                break;
            }
        }

    }
}