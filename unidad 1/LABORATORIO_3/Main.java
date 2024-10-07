package LABORATORIO_3;

import java.io.PipedWriter;

public class Main {

    public static void main(String[] args) {

        // CREAMOS EL OBJETO PERSONA
        Persona persona = new Persona("Elio", 24,"Elio.huaman.27@umsch.edu.pe");

        System.out.println(persona);

        // USAMOS LOS METODOS DE MODIFICACION
        persona.setNombre("henry");
        persona.setEdad(28);

        System.out.printf("\nEl nombre actualizado es : " + persona.getNombre());
        System.out.printf("\nEl nombre actualizado es : " + persona.getEdad());
    }
}// FIN CLASS MAIN
