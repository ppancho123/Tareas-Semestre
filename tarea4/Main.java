//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Fórmula 1: (12 + 8) * (5 - 3) - (6 / 2) / ((3 * 4) + (8 / 2))

        double numerador = (12 + 8) * (5 - 3) - (6 / 2);
        double denominador = (3 * 4) + (8 / 2);
        double resultado = numerador / denominador;

        System.out.println("El resultado de la fórmula 1 es: " + resultado);

//Fórmula 2
        double numeradorDos = (((9 * 5) - (15 + 3) + (8 * 2) - (12 / 4)) * (7 + 2) - ((6 * 3) / 2));
        double denominadorDos = (2 + ((3 * 2) / (4 - 2))) + (5 * ((8 / 4) + 1)) - (6.0 / (2 + 1));
        double resultadoDos = numeradorDos / denominadorDos;

        System.out.println("El resultado de la fórmula 2 es: " + resultadoDos);

//Fórmula 3
        double numeradorTres = ((6 + 4) * 3) - (18 / 2);
        double denominadorTres = (8 - 5) + (3 * 2);
        double resultadoTres = numeradorTres / denominadorTres;

        System.out.println("El resultado de la fórmula 3 es: " + resultadoTres);

    }
}