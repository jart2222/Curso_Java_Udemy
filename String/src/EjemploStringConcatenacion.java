public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso ="Programacion Java";
        String profesor="Andrés Guzmán";

        String detalle =curso+" con el instuctor "+profesor;
        System.out.println(detalle);

        int numeroA=10;
        int numeroB=5;
        System.out.println(detalle+numeroA+numeroB);//str+num1+num2=(str)+num2=str
        System.out.println(numeroA+numeroB+detalle);//num1+num2+str=(num)+str=str

        String detalle2=curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
