//se pasa la referencia no el valor
public class PasaPorReferencia {
    public static void main(String[] args) {
        int [] edad={10,12,13};
        System.out.println("Iniciamos el metodo main");
        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad[i]= "+edad[i]);
        }
        System.out.println("Antes de llamar el metodo test");
        test(edad);
        System.out.println("Despues de llamar el metodo test");

        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad[i]= "+edad[i]);
        }
    }
    public static void test(int [] edadArr){
        System.out.println("iniciamos el metodo test ");
        for (int i = 0; i < edadArr.length ; i++) {
            edadArr[i]+=20;
        }
        System.out.println("Finalizamos el metodo test");
    }

}
