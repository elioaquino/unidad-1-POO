package excepciones_2;

public class CuentaCorriente extends CuentaBancaria{

    final int Limite = 1000;

    public CuentaCorriente(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double cantidad) {
        super.retirar(cantidad);
    }
}
