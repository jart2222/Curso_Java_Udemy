    import java.util.Scanner;

public class EjemploArregloDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a= new int[10];
        int elemento, posicion;
        Scanner s= new Scanner(System.in);

        for (int i = 0; i <a.length ; i++) {
            System.out.print("Ingrese un numero: ");
            a[i]=s.nextInt();
        }

        System.out.println();
        System.out.println("Nuevo elemento: ");
        elemento=s.nextInt();

        System.out.println("Posicion donde agregar de (0 a 9)");
        posicion=s.nextInt();
        for (int i = a.length-2; i >=posicion ; i--) {//
            a[i+1]=a[i];                       //a[9]=a[8] a[8]=a[7]
        }

        a[posicion]=elemento;
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
