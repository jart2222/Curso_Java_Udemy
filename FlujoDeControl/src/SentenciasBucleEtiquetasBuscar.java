public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase="tres triste tigres tragan trigo trigo en un trigal";
        String palabra="trigo";

        int maxPalabra=palabra.length();
        int maxFrase=frase.length()-maxPalabra;

        int cantidad=0;
        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k=i;
            for (int j = 0; j <maxPalabra ; j++) {
                if (frase.charAt(k++)!= palabra.charAt(j)){
                    i++;
                    continue buscar;
                }

            }
            cantidad++;
            i=i+maxPalabra;
        }

        System.out.println("la palabra \" "+palabra+ " \" se encontro "+cantidad+ " veces" );
    }
}
