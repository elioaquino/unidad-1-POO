package vehiculo_coche;

public class Vehiculo {

    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "marca : " + marca;
    }
}
