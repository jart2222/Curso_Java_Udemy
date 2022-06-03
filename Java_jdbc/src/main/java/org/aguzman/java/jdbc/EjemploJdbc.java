package org.aguzman.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
        String username="root";
        String password="password";
        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stmt =conn.createStatement();
            ResultSet resultado= stmt.executeQuery("Select * from productos");

            while (resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }
            resultado.close();
            stmt.cancel();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
