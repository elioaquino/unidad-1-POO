package LABO_3_EJERCICIO2;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto
        CuentaBancaria cuenta = new CuentaBancaria(7845223, 500, "Henry");

        // Imprimimos la informacion del objeto
        System.out.println(cuenta);

        // Depositar dinero
        cuenta.depositar(500);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());

        // Intentar retirar dinero
        cuenta.retirar(200);
        System.out.println("Saldo después de retirar: " + cuenta.getSaldo());

        // Intentar retirar más dinero del disponible
        cuenta.retirar(1000);
    }
}
