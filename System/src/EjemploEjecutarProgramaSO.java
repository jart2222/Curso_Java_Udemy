import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("Windows")){
                proceso= rt.exec("notepad");
            }else if (System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso=rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso=rt.exec("vi");
            }else {
                proceso=rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido: "+e.getMessage());
            System.exit(1);
        }

        System.out.println("se ha cerrado el programa");
        System.exit(0);
    }
}
