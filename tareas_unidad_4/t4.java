public class Main {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Arreglo en orden inverso:");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}