import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitud de coordenadas al usuario
        System.out.println("Introduce la coordenada X1: ");
        double xUno = input.nextDouble();
        System.out.println("Introduce la coordenada Y1: ");
        double yUno = input.nextDouble();
        System.out.println("Introduce la coordenada X2: ");
        double xDos = input.nextDouble();
        System.out.println("Introduce la coordenada Y2: ");
        double yDos = input.nextDouble();

        // Cálculo de la distancia entre las coordenadas
        double distancia = Math.sqrt(Math.pow(xDos - xUno, 2) + Math.pow(yDos - yUno, 2));

        // Cálculo del ángulo en radianes
        double anguloRad = Math.atan2(yDos - yUno, xDos - xUno);

        // Cálculo del ángulo en grados
        double anguloDeg = Math.toDegrees(anguloRad);

        // Impresión de los resultados formateados

        System.out.println("\nResultados:");

        System.out.printf(" Coordenadas 1: (%.2f, %.2f)\n", xUno, yUno);
        System.out.printf(" Coordenadas 2: (%.2f, %.2f)\n", xDos, yDos);

        System.out.printf(" Distancia entre coordenadas: %.2f unidades\n", distancia);

        System.out.printf(" Ángulo en radianes: %.4f rad\n", anguloRad);
        System.out.printf(" Ángulo en grados: %.2f°\n", anguloDeg);


        input.close();
    }
}