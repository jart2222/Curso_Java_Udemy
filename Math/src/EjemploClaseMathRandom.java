import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[]colores={"azul","rojo","verde","blanco","negro"};
        double random=Math.random();
        System.out.println("random = " + random);
        random*=colores.length;
        System.out.println("random = " + random);
        random=Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int) random]);

        Random randomObj=new Random();
        int randomInt=15+randomObj.nextInt(10);
        //crea un numero aleatorio entre 0-10 y se lo suma a 15 para que rango  sea [15,25)
        System.out.println("randomInt = " + randomInt);

        randomInt=randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
