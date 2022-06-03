package org.aguzman.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {
    private Persona persona;
    private String carrera;
    private List<String> experiecia;

    public Curriculo(Persona persona, String carrera,String contenido) {
        super(contenido);
        this.persona=persona;
        this.carrera=carrera;
        this.experiecia=new ArrayList<>();
    }

    public Curriculo addExperencia(String exp){
        experiecia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb= new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp:this.experiecia) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }

}
