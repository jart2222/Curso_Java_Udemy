import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        int numeroDecimal=0;
        //String numeroStr= scanner.nextLine();
        try {
            numeroDecimal=scanner.nextInt();//Integer.parseInt(numeroStr);
        }
        catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario="numero binario de " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
       // System.out.println("numeroDecimal = " + numeroDecimal);

        //int numeroBinario=0b11110;
        //System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal="numero octal de " + numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);

        //int numeroOctal=036;
        //System.out.println("numeroOctal = " + numeroOctal);

       // int numeroHex= 0x1e;
       // System.out.println("numeroHex = " + numeroHex);
        String resultadoHexadecimal="numero Hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal);


        String mensaje=resultadoBinario+"\n"+resultadoBinario+"\n"+resultadoOctal;
        System.out.println(mensaje);


    }
}
