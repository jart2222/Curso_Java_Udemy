public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre-incremento
        int i = 1;
        int j = ++i; //primero se incrementa y luego se asigna
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Post-incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j=i++;
        //primero se asigna y luego se incrementa
        System.out.println("j = " + j);
        System.out.println("final de i: "+i);

        //Pre-incremento
        i=3;
        j=--i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //Post-incrementos
        i=4;
        j=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);

    }
}
