package laboratorio_4_1;

public class Main {

    public static void main(String[] args) {

        VehiculoMotorizado coche = new Coche("Toyota", "RV4", 2500, "azul");
        VehiculoMotorizado motocicleta = new Motocicleta("Ford", "R8", 4700, "Negro");

        System.out.println(coche);
        System.out.println(motocicleta);


    }
}
