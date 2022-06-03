import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String [] usernames=new String[3];
        String [] passwords=new  String[3];
        usernames[0]="andres";
        usernames[1]="jose";
        usernames[2]="pepe";
        passwords[0]="12345";
        passwords[1]="contraseña";
        passwords[2]="123";*/

        String [] usernames= {"andres","jose","contraseña"};
        String [] passwords= {"12345","contraseña","123"};

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String u= scanner.next();
        System.out.println("Ingrese su contraseña: ");
        String p=scanner.next();

        boolean esAutentificado=false ;

        for (int i = 0; i < usernames.length; i++) {
            /*  if (  usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutentificado=true;
                break;  */
            esAutentificado= (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutentificado;
            }

        String mensaje=(esAutentificado)?"Bienvenido usuario ".concat(u).concat("!"):
                "lo sentimos, usuario o contraseña incorrectos \n Lo sentimos requiere autorizacion";
        System.out.println(mensaje);

       /*
        if (esAutentificado){

            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }
        else {
            System.out.println("Lo siento requiere autentificacion");
        } */
    }
}
