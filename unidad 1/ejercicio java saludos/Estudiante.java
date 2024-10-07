package saludos;

public class Estudiante extends Persona{

    public Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    public String saludar() {
        return super.saludar() + " " + getNombre();
    }
}
