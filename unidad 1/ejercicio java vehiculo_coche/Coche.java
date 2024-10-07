package vehiculo_coche;

public class Coche extends Vehiculo {

    private int numero_puertas;

    public Coche(String marca, int numero_puertas) {
        super(marca);
        this.numero_puertas = numero_puertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", tiene  " + numero_puertas + " puertas";
    }
}
