public class EjercicioReordenarArreglos {
    public static void main(String[] args) {

        int[] numeros= new int[10];
        int total=numeros.length;
        int[] numerosReordenados=new int[total];


        for (int i = 0; i < total; i++) {
            numeros[i]= i+1;
        }

        for (int i = 0; i <total ; i++) {
            if (i==0){
                numerosReordenados[i]=numeros[total-1];
            }
            if (i>0){
                numerosReordenados[i]=numeros[i-1];
            }

        }

        for (int i = 0; i < total; i++) {
            System.out.print("numeros[i] = " + numeros[i]);
            System.out.println(" , numerosReordenados[i] = " + numerosReordenados[i]);

        }
    }
}
