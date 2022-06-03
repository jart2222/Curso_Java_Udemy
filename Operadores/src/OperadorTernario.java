import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable =(7==5)?"si es verdadero":"es falso";
        System.out.println("variable = " + variable);
        String estado="";
        double promedio=0.0;
        double matematicas=0.0;
        double ciencias=0.0;
        double historia=0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas");
        matematicas=s.nextDouble();

        System.out.println("Ingrese la nota de ciencias");
        ciencias=s.nextDouble();

        System.out.println("Ingrese la nota de historia");
        historia=s.nextDouble();

        promedio=(matematicas+ciencias+historia)/3;
        System.out.println("promedio = " + promedio);

        estado= promedio>= 5.49 ?"Aprobado":"Rechazado";
        System.out.println("estado = " + estado);

    }
}
