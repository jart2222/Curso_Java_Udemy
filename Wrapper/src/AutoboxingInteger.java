public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer [] enteros={1,2,3,4,5,6,7,8,9,10,
        12,13,14,15};
        int suma=0;

        for (Integer i:enteros) {
            suma +=i.intValue();
        }

        System.out.println("suma = " + suma);
        suma=0;

        for (Integer i: enteros) {
            suma+=i;
        }
        System.out.println("suma = " + suma);
    }
}
