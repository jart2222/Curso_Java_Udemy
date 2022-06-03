public class EjemplosMatricesTranspuesta {
    public static void main(String[] args) {
        int[][] matriz={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };//matriz

        System.out.println("Matriz: \n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }//for j
            System.out.println();
        }//for i

        int aux;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {

                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;

            }//for j
        }//for i

        System.out.println("\nMatriz transpuesta: \n");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }// for j
            System.out.println();
        }//for i

    }// main
}
