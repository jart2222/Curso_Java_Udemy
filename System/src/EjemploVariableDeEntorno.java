import java.util.Map;

public class EjemploVariableDeEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv=System.getenv();
        System.out.println("variables de ambiente del sistema = "+varEnv);
        System.out.println("-----------------LISTADO DE VARIABLES DE ENTORNO DEL SISTEMA---------------");
        for (String key: varEnv.keySet()) {
            System.out.println(key +" => "+varEnv.get(key));
        }
        System.out.println(".............................");
        String username=System.getenv("USER");
        System.out.println("username = " + username);

        String javaHome=System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir= System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path=System.getenv("PATH");
        System.out.println("path = " + path);

        String path2= varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        String sshAgent= varEnv.get("SSH_AGENT_PID");
        System.out.println("sshAgent = " + sshAgent);
    }
}
