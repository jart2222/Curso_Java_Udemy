//se pasa la referencia no el valor

public class PasaPorReferencia2 {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Andres");
        System.out.println("iniciamos metodo main ");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Invocando al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos de la persona modificados!");



    }
    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test ...");
        persona.setNombre("Pepe");
        System.out.println("... Finalizamos el metodo test");
    }

}
