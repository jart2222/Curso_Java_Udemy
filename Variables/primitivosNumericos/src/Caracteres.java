public class Caracteres {
    public static void main(String[] args) {
        char caracter ='\u0040';
        char decimal=64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal==caracter: "+(caracter==decimal));
        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo=caracter "+(simbolo==caracter));

        char espacio='\u0020';
        char retroceso='\b';
        char tabulador='\t';
        char nuevalinea='\n';
        char retornoCarro='\r';

        System.out.println("char correspode"+System.lineSeparator()+"en byte "+ Character.BYTES);
        System.out.println("char corresponde en bites "+Character.SIZE);
        System.out.println("valor maximo de un char: "+Character.MAX_VALUE);
        System.out.println("valor minimo de un char: "+Character.MIN_VALUE);

    }
}
