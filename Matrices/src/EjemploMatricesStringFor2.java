public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres= {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};

        System.out.println("Iterando con foreach: ");

        for (String[] fila: nombres){ //Obtiene un arreglo de arreglos
            for (String nombre :fila) {//Obtiene cada elemento de sub arreglo
                System.out.print(nombre+"\t");
            }
            System.out.println();

        }
    }
}
