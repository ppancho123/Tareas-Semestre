import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine().toLowerCase();

        char[] arreglo = new char[cadena.length()];
        int longitud = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                arreglo[longitud] = cadena.charAt(i);
                longitud++;
            }
        }

        boolean esPalindromo = true;
        for (int i = 0, j = longitud - 1; i < j; i++, j--) {
            if (arreglo[i] != arreglo[j]) {
                esPalindromo = false;
                break;
            }
        }

        System.out.println("¿Es palíndromo? " + esPalindromo);
    }
}