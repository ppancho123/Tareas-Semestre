public class Main {
        public static double calcularMedia(int[] numeros) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
            return (double) suma / numeros.length;
        }

        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            System.out.println("La media del arreglo es: " + calcularMedia(numeros));
        }
    }

