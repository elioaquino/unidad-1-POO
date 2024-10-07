package ejercicio_4;

public class Utilidades {

    // metodo para hacer la coversion
    public static double convertirCelsiusAFaahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;

        return fahrenheit;
    }

    // creamos el metodo principal
    public static void main(String[] args) {

        System.out.println("La conversion es : " + convertirCelsiusAFaahrenheit(10000));
    }

}
