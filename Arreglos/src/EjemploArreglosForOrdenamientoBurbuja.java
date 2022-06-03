//para crear variables deben ser del mismmo tipo del arreglo
//pasa una referencia no un valor

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos={"Kingston Pendrive 64GB","Samsung Galaxy","Disco Duro SSD Samsung Externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta generacion","Bicicleta Oxford"};
        shortBurbuja(productos);
        imprimir(productos);

        Integer[] numero=new Integer[4];
        numero[0]=10;
        numero[1]=Integer.valueOf("7");
        numero[2]=35;
        numero[3]=-1;

        shortBurbuja(numero);
        imprimir(numero);
    }


    public static void shortBurbuja(Object[] arreglo){
        int total=arreglo.length;
        int contador=0;
        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total-1-i; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j])<0){
                    Object auxiliar=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }


    public static void imprimir(Object[] productos){
        int total= productos.length;
        System.out.println("\n ===Usando for ===");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }
    }

}
