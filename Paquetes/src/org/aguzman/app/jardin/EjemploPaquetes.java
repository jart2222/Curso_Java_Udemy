package org.aguzman.app.jardin;
import org.aguzman.app.hogar.*;
import static org.aguzman.app.hogar.Persona.saludar;
import static org.aguzman.app.hogar.Persona.*;
import static org.aguzman.app.hogar.ColorPelo.*;


public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.setNombre("Andres");
        p.setApellido("Guzman");
        p.setColorPelo(RUBIO);
        System.out.println(p.getNombre());
        System.out.println("p.getColorPelo() = " + p.getColorPelo());

        Perro perro= new Perro();
        perro.nombre="tobby";
        perro.raza="Bulldog";

        String jugando= perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo= saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer= GENERO_FEMENINO;
        String generoHombre=GENERO_MASCULINO;
    }
}
