import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr= JOptionPane.showInputDialog(null,"Ingrese un numero decimal");
        int numeroDecimal=0;

        try {
            numeroDecimal=Integer.parseInt(numeroStr);

        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero");
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
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
