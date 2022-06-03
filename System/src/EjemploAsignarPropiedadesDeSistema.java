import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo=new FileInputStream("src/config2.properties");
            Properties p=new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.perzonalizada","Mi valor guardado en el objeto");
            System.setProperties(p);

            Properties ps= System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.perzonalizada\") = " + ps.getProperty("mi.propiedad.perzonalizada"));
            System.out.println(ps.getProperty("config.puerto.servidor"));
            System.out.println(ps.getProperty("config.autor.nombre"));
            System.out.println(ps.getProperty("config.autor.email"));

            ps.list(System.out);


        } catch (Exception e) {
            System.err.println("no existe el archivo " + e);
            System.exit(1);
        }

    }
}