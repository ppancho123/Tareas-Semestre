public class Main {
        public static double celsiusAFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }

        public static void main(String[] args) {
            double[] valoresCelsius = {0, 25, 30, -10, 100};

            System.out.println("Conversión de grados Celsius a Fahrenheit:");
            for (int i = 0; i < valoresCelsius.length; i++) {
                double celsius = valoresCelsius[i];
                System.out.println(celsius + "°C = " + celsiusAFahrenheit(celsius) + "°F");
            }
        }
    }


