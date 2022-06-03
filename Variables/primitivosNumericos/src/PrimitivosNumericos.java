public class PrimitivosNumericos {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        byte numeroByte=127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: "+Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: "+Byte.SIZE);
        System.out.println("valor maximo de un byte: "+Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: "+Byte.MIN_VALUE);
        System.out.println("----------------------------------");
        short numeroShort=30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a: "+Short.BYTES);
        System.out.println("tipo short corresponde en bites a: "+Short.SIZE);
        System.out.println("valor maximo de un short: "+Short.MAX_VALUE);
        System.out.println("valor minimo de un short: "+Short.MIN_VALUE);

        System.out.println("----------------------------------");
        int numeroInt =2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a: "+Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: "+Integer.SIZE);
        System.out.println("valor maximo de un int: "+Integer.MAX_VALUE);
        System.out.println("valor minimo de un int: "+Integer.MIN_VALUE);
        System.out.println("----------------------------------");
        long numeroLong=2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a: "+Long.BYTES);
        System.out.println("tipo long corresponde en bites a: "+Long.SIZE);
        System.out.println("valor maximo de un long: "+Long.MAX_VALUE);
        System.out.println("valor minimo de un long: "+Long.MIN_VALUE);
        System.out.println("----------------------------------");
        float realFloat=0.0000000003f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a: "+Float.BYTES);
        System.out.println("tipo float corresponde en bites a: "+Float.SIZE);
        System.out.println("valor maximo de un float: "+Float.MAX_VALUE);
        System.out.println("valor minimo de un float: "+Float.MIN_VALUE);
        System.out.println("----------------------------------");
        double realDouble=3.49234449494;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a: "+Double.BYTES);
        System.out.println("tipo double corresponde en bites a: "+Double.SIZE);
        System.out.println("valor maximo de un double: "+Double.MAX_VALUE);
        System.out.println("valor minimo de un double: "+Double.MIN_VALUE);



    }
}
