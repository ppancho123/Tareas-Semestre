//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String correoElectronico = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        double salario = 50000.75;

        // Cifrar correo electrónico
        String[] partesCorreo = correoElectronico.split("@");
        String usuario = partesCorreo[0];
        String dominio = partesCorreo[1];
        String usuarioInvertido = new StringBuilder(usuario).reverse().toString();
        String correoCifrado = usuarioInvertido + "@" + dominio;

        // Cifrar fecha de ascenso
        String[] partesFecha = fechaAscenso.split("-");
        int ano = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int dia = Integer.parseInt(partesFecha[2]);
        int sumaComponentes = ano + mes + dia;
        String fechaCifrada = String.valueOf(sumaComponentes);

        // Cifrar salario
        String salarioString = String.valueOf(salario);
        String[] partesSalario = salarioString.split("\\.");
        int parteEntera = Integer.parseInt(partesSalario[0]);
        double parteDecimal = Double.parseDouble("0." + partesSalario[1]);
        double diferencia = Math.abs(parteEntera - parteDecimal);
        double salarioCifrado = (diferencia * 2);

        // Construir cadena final
        String cadenaCifrada = correoCifrado + "/" + fechaCifrada + "/" + salarioCifrado;

        System.out.println(cadenaCifrada);

    }
}