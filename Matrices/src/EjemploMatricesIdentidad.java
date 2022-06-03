public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        int[][] matriz=new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }//if i==j
            }//for j
        }//for i

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }//for j
            System.out.println();
        }//for i


    }//main
}
