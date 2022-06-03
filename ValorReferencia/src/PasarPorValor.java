//Pasa valor no la referencia
//la clase Wrapeer es inmutable, se crea un nuevo objeto con un nuevo valor no se le cambia el nombre
public class PasarPorValor {
    public static void main(String[] args) {
        int i=10;
        System.out.println("Iniciamos el metodo main con i= "+i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de (i) con : "+i);

    }
    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i= "+i);
        i=35;
        System.out.println("Finaliza el metodo test con i= "+i);
    }
}
