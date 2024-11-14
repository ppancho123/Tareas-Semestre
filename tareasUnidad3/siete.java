import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = scanner.nextInt();
        scanner.close();

        if (esPalindromo(num)) {
            System.out.println("El número " + num + " es palíndromo.");
        } else {
            System.out.println("El número " + num + " no es palíndromo.");
        }
    }

    public static boolean esPalindromo(int num) {
        int inverso = 0;
        int original = num;

        while (num != 0) {
            int digito = num % 10;
            inverso = inverso * 10 + digito;
            num /= 10;
        }

        return inverso == original;

    }
}