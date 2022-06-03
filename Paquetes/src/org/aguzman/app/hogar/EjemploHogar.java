package org.aguzman.app.hogar;
import static org.aguzman.app.hogar.Persona.saludar;
import org.aguzman.app.jardin.Perro;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p= new Persona();//  no es necesario exportar por que pertenecen al mismo paquete
        Perro perro=new Perro();// class public
        // no se pueden ocupar metodos de perro por ser protected
        String saludo=saludar();

    }
}
