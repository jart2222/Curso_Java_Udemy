public class EjemploStringTestRedmientoConcat {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String c="c";

        StringBuilder sb = new StringBuilder(a);

        long inicio=System.currentTimeMillis();

        for (int i = 0; i <10000; i++) {
            //c=c.concat(a).concat(b).concat("\n");
            //c+=a+b+"\n";
            sb.append(a).append(b).append("\n");
            }
        System.gc();
        long fin =System.currentTimeMillis();

        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
}
}
