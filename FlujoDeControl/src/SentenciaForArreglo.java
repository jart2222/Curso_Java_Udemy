import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres={"Andres","Pepe","Maria","Paco","Lalo","Bea","pepa","jose"};
        int count = nombres.length;
        /*
        for (int i = 0; i < count ; i++) {
            if (nombres[i].toLowerCase().contains("Andres".toLowerCase())||
            nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }

            System.out.println("nombres = " + nombres[i]);
        }
        */
        String buscar= JOptionPane.showInputDialog("ingrese un nombre por ejemplo, \"pepe\" ");
        System.out.println("buscar = " + buscar);

        boolean encontrado=false;

        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado=true;
                break;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar+" encontrado");
        } else {
            JOptionPane.showMessageDialog(null,buscar+" no encontrado");
        }


    }
}
