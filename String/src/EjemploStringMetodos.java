public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre="Armando";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Armando\") = " + nombre.equals("Armando"));
        System.out.println("nombre.equals(\"armando\") = " + nombre.equals("armando"));
        System.out.println("nombre.equalsIgnoreCase(\"armando\") = " + nombre.equalsIgnoreCase("armando"));
        System.out.println("nombre.compareTo(\"Armando\") = " + nombre.compareTo("Armando"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.length()-1 = " + (nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));

        String trabalenguas="trabalenguas";
        System.out.println("trabalenguas"+trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas   ");
        System.out.println("  trabalenguas   ".trim());
        





    }
}
