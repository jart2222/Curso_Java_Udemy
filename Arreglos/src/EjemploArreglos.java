//para crear variables deben ser del mismmo tipo del arreglo
//pasa una referencia no un valor

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos=new String[7];
        productos[0]="Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsung Externo";
        productos[3]="Asus Notebook";
        productos[4]="Macbook Air";
        productos[5]="Chromecast 4ta generacion";
        productos[6]="Bicicleta Oxford";

        Arrays.sort(productos);// ordena las posiciones si es string en orden alfabetico

        String prod1=productos[0];
        String prod2=productos[1];
        String prod3=productos[2];
        String prod4=productos[3];
        String prod5=productos[4];
        String prod6=productos[5];
        String prod7=productos[6];

        System.out.println("productos[0] = "+prod1);
        System.out.println("productos[1] = "+prod2);
        System.out.println("productos[2] = "+prod3);
        System.out.println("productos[3] = "+prod4);
        System.out.println("productos[4] = "+prod5);
        System.out.println("productos[5] = "+prod6);
        System.out.println("productos[6] = "+prod7);


        int[] numero=new int[4];
        numero[0]=10;
        numero[1]=Integer.valueOf("7");
        numero[2]=35;
        numero[3]=-1;

        Arrays.sort(numero);

        int i=numero[0];
        int j=numero[1];
        int k=numero[2];
        int l=numero[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }
}
