package LABORATORIO_3;

import javax.print.attribute.standard.NumberOfDocuments;

public class Persona {

    // DEFINIMOS LOS ATRIBUTOS
    private String nombre;
    private int edad;
    private String correo;


    // CREAMOS EL METODO CONSTRUCTOR
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString()
    // METODO PARA MOSTRAR LA INFORMACION DEL OBJETO
    {
        return "Nombre : " + nombre + "Edad : " + edad + ", correo : " + correo;
    }
}
