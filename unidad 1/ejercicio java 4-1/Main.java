package laboratorio_4;

import java.util.EnumMap;

public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("henry", 5000);
        Gerente gerente = new Gerente("Josue", 7541);

        System.out.println(empleado);
        System.out.println("El bono del empleado es : " + empleado.calcularBono(empleado.getSalario()));
        System.out.println("\n" + gerente);
        System.out.println("El bono del gerente es : " + gerente.calcularBono(gerente.getSalario()));

    }
}
