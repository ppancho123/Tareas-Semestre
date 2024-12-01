import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[10];
        double suma = 0;

        System.out.println("Ingresa las calificaciones de 10 estudiantes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / 10;
        int porEncima = 0, porDebajo = 0;

        for (double calificacion : calificaciones) {
            if (calificacion > promedio) porEncima++;
            else if (calificacion < promedio) porDebajo++;
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificaciones por encima del promedio: " + porEncima);
        System.out.println("Calificaciones por debajo del promedio: " + porDebajo);
    }
}