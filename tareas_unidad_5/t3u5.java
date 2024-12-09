public class Main {
        public static void imprimirPositivos(int[] numeros) {
            System.out.println("Números positivos:");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    System.out.println(numeros[i]);
                }
            }
        }

        public static void main(String[] args) {
            int[] numeros = {-5, 10, 0, -3, 20, 15};

            imprimirPositivos(numeros);
        }
    }
