public class EjemplosMatricesSumarFIlasColumnas {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6}, 
                {7,8,9}};//a
        int sumarFilas,sumaColumna;


        
        for (int i = 0; i < a.length; i++) {
            sumaColumna=0;
            sumarFilas=0;
            for (int j = 0; j < a[i].length; j++) {
                sumarFilas +=a[i][j];
                sumaColumna+=a[j][i];
            }//for j
            System.out.println("Total fila "+i+": "+sumarFilas);
            System.out.println("Total columna  "+i+": "+sumaColumna);
        }//for i
    }// main
}//class EjemplosMatricesSumar