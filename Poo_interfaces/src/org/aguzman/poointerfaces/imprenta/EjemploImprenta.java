package org.aguzman.poointerfaces.imprenta;
import org.aguzman.poointerfaces.imprenta.modelo.*;
import static org.aguzman.poointerfaces.imprenta.modelo.Genero.*;
import static org.aguzman.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv =new Curriculo( new Persona("John","Doe"),"Ingeniero de sistemas","Resumen ....");
        cv.addExperencia("Java")
                .addExperencia("Oracle DBA")
                .addExperencia("Spring Framework")
                .addExperencia("Desarrollador Fullstack")
                .addExperencia("Angular");

        Libro libro=new Libro(new Persona("Erich" ,"Gamma"),"Patrones de diseño: Elem. Reusables POO"
        , PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe informe=new Informe(new Persona("Martin" ,"Fowler"), new Persona("James","Gosling"),"Estudio sobre microservicios");
       imprimir(cv);
       imprimir(informe);
       imprimir(libro);

       Imprimible objImp =new Imprimible() {
           @Override
           public String imprimir() {
               return "Hola que tal, imprimiendo un objeto generico de una clase anonima!";
           }
       };

       imprimir(objImp);

        System.out.println(TEXTO_DEFECTO);

    }

}
