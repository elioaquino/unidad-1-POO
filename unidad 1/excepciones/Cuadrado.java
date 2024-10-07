package excepciones;

public class Cuadrado extends Forma{

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }
}
