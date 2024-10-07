package excepciones;

public class Triangulo extends Forma{

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }
}
