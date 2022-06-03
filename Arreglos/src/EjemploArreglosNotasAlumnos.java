import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumaNotasMatematicas=0,sumaNotasHistoria=0,sumaNotasLenguaje=0;

        claseMatematicas =new double[7];
        claseHistoria=new double[7];
        claseLenguaje=new double[7];

        Scanner s=new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matematicas");

        for (int i = 0; i <claseMatematicas.length ; i++) {
            claseMatematicas[i]=s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");

        for (int i = 0; i <claseHistoria.length ; i++) {
            claseHistoria[i]=s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");

        for (int i = 0; i <claseLenguaje.length ; i++) {
            claseLenguaje[i]=s.nextDouble();
        }

        for (int i = 0; i <7 ; i++) {
            sumaNotasMatematicas+=claseMatematicas[i];
            sumaNotasHistoria+=claseHistoria[i];
            sumaNotasLenguaje+=claseLenguaje[i];
        }

        double promedioMatematicas=(sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria=(sumaNotasHistoria/claseHistoria.length);
        double promedioLenguaje=(sumaNotasLenguaje/claseLenguaje.length);

        System.out.println("promedioMatematicas = " + promedioMatematicas);
        System.out.println("promedioHistoria = " + promedioHistoria);
        System.out.println("promedioLenguaje = " + promedioLenguaje);

        System.out.println("promedio total del curso: "+
                (promedioHistoria+promedioMatematicas+promedioLenguaje)/3);
        System.out.println("Ingrese el identificador del alumno de (0-6): ");
        int id=s.nextInt();
        double prmedioAlumno=(claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3;
        System.out.println("Promedio alumno Nro "+id+" : "+prmedioAlumno);
    }
}
