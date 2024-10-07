package laboratorio_4;

public class Empleado {

    private String nombre;
    private double salario ;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre){
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

    public double calcularBono(double salario){
        return salario * 0.1;

    }

    @Override
    public String toString() {
        return "Empleado : " + nombre + ", Salario : " + salario;
    }
}
