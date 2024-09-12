import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Sección 1: Información de un libro favorito

        System.out.println("Nombre: La Metamorfosis");
        System.out.println("Autor: Franz Kafka");
        System.out.println("Fecha: de publicación: 1915");
        System.out.println("Género: Novela corta, Absurdo, Cuento de hadas, Literatura fantastica");
        System.out.println("No. de páginas: 128");

        //Sección 2: Información de un país que deseas visitar

        String nombreDelPais = "Inglaterra";
        String capital = "Londres";
        String idiomaOficial = "Ingles";
        int poblacion = 55980000;
        String moneda =  "Libra esterlina";

        System.out.println ("El país es: Inglaterra" + nombreDelPais);
        System.out.println ("La capital es: Londres" + capital);
        System.out.println ("El idioma es: Ingles" + idiomaOficial);
        System.out.println ("La poblacion es: " + poblacion);
        System.out.println ("La moneda es: " + moneda);

        //Sección 3: Información de un personaje histórico favorito

        String nombrePersonajeHistorico = "Ye Omari West";
        LocalDate fechaNacimiento = LocalDate.of(1977, 6, 8);
        String nacionalidad = "Estadounidense";
        String ocupacion = "Músico";
        String logroDestacado = "Cambió la historia del hip-hop";

        System.out.println ("El personaje histórico es:" + nombrePersonajeHistorico);
        System.out.println ("Nació en: " + fechaNacimiento);
        System.out.println ("Su nacionalidad es: " + nacionalidad);
        System.out.println ("Él es un: " + ocupacion);
        System.out.println ("Su logro destacado es: " + logroDestacado);
    }
}