//para crear variables deben ser del mismmo tipo del arreglo
//pasa una referencia no un valor

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {
        String[] productos={"Kingston Pendrive 64GB","Samsung Galaxy","Disco Duro SSD Samsung Externo","Asus Notebook",
                "Macbook Air","Chromecast 4ta generacion","Bicicleta Oxford"};
        int total=productos.length;

        Arrays.sort(productos);
        imprimir(productos);
        arregloInverso(productos);
        imprimir(productos);

        //Collections.reverse(Arrays.asList(productos));


    }
    public static void arregloInverso(String[] arreglo){
        int total2=arreglo.length;
        int total=arreglo.length;

        for (int i = 0; i <total2 ; i++) {
            String actual= arreglo[i];
            String inverso=arreglo[total-1-i];
            arreglo[i]=inverso;
            arreglo[total-1-i]=actual;
            total2--;
        }

    }

    public static void imprimir(String[] productos){
        int total= productos.length;
        System.out.println("\n ===Usando for ===");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }
    }

}
