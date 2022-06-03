public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo ="alguna_imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(i) = " + archivo.substring(i+1));
        
    }
}
