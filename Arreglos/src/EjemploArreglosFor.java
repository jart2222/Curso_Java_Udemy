//para crear variables deben ser del mismmo tipo del arreglo
//pasa una referencia no un valor

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos=new String[7];
        int total=productos.length;

        productos[0]="Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsung Externo";
        productos[3]="Asus Notebook";
        productos[4]="Macbook Air";
        productos[5]="Chromecast 4ta generacion";
        productos[6]="Bicicleta Oxford";

        Arrays.sort(productos);// ordena las posiciones si es string en orden alfabetico

        for (int i = 0; i <total ; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }
        System.out.println("===Usando foreach===");
        for (String prod: productos) {
            System.out.println("prod= "+prod);
        }
        System.out.println("===Usando while===");
        int i=0;
        while (i<total){
            System.out.println("para indice "+i+" : "+productos[i]);
            i++;
        }
        System.out.println("===Usando do while===");
        int j=0;
        do {
            System.out.println("para indice "+j+" : "+productos[j]);
            j++;
        }while (j<total);


        int[] numero=new int[4];

        int totalNumero=numero.length;

        for (int k = 0; k < totalNumero; k++) {
            numero[k]=k+3;
        }

        for (int k = 0; k < totalNumero; k++) {
            System.out.println("numeros = "+numero[k]);
        }

    }
}
