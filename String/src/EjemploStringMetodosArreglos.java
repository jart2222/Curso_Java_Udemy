public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas="trabalenguas";
        char [] arreglo= trabalenguas.toCharArray();
        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println(arreglo[i]);
        }

        String[] arreglo2=trabalenguas.split("a");

        for (int j = 0; j <arreglo2.length ; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo ="alguna.imagen.jfx";
        String[] archivoArr=archivo.split("\\.");//[.]
        for (int k = 0; k < archivoArr.length; k++) {
            System.out.println(archivoArr[k]);
        }


    }
}
