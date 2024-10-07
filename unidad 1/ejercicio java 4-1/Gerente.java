package laboratorio_4;

public class Gerente{

    private String nombre;
    private double salario;

    public Gerente(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBono(double salario) {
        return salario * 0.15;
    }


    @Override
    public String toString() {
        return "Gerente : " + nombre + ", Salario : " + salario;
    }
}
