package laboratorio_4_1;

public class VehiculoMotorizado extends Vehiculo{

    private String color;

    public VehiculoMotorizado(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio);
        this.color = color;
    }

    public String toString(){
        return super.toString() + ", Color : " + color;
    }
}
