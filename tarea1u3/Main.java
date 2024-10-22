//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombreCliente = "Carlos Martinez";
        String direccionIP = "192.168.0.1";
        int numeroCliente = 12345;

        String nombreCifrado = cifrarNombre(nombreCliente);

        String ipCifrada = cifrarIP(direccionIP);

        double numeroCifrado = cifrarNumeroCliente(numeroCliente);

        String datosCifrados = nombreCifrado + "|" + ipCifrada + "|" + numeroCifrado;
        System.out.println("Datos cifrados: " + datosCifrados);
    }

    public static String cifrarNombre(String nombre) {
        // Intercambiar la primera y última letra
        char primeraLetra = nombre.charAt(0);
        char ultimaLetra = nombre.charAt(nombre.length() - 1);
        nombre = ultimaLetra + nombre.substring(1, nombre.length() - 1) + primeraLetra;

        nombre = nombre.replace('a', '1')
                .replace('e', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('u', '5');

        return nombre;
    }

    public static String cifrarIP(String ip) {
        String[] octetos = ip.split("\\.");
        String ipHex = "";

        for (int i = 0; i < octetos.length; i++) {
            int valor = Integer.parseInt(octetos[i]);
            ipHex += Integer.toHexString(valor);
            if (i < octetos.length - 1) {
                ipHex += ".";
            }
        }

        return ipHex;
    }

    public static double cifrarNumeroCliente(int numero) {
        return (numero * 3 + 15) / 2.0;
    }
}