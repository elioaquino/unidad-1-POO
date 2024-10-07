package excepciones;

public class Main {

    public static void main(String[] args) {
        Forma triangulo = new Triangulo(2,2);
        Forma cuadrado = new Cuadrado(2);

        System.out.println(triangulo.calcularArea());
        System.out.println(cuadrado.calcularArea());
    }
}
