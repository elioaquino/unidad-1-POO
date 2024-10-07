package excepciones_2;

public class CuentaBancaria{

    private double saldo;


    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad){

        try{
            if (cantidad < saldo){
                saldo-= cantidad;
            }
        }catch (Exception SaldoInsuficienteException){
            System.out.println("La cantidad debe ser menor que el saldo disponible!");
        }


    }
}
