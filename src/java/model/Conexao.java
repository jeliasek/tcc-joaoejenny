package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    final static String usuario = "root";
    final static String senha = "joao";
    final static String enderecoBanco = "localhost/tcc";

    public static Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            return DriverManager.getConnection("jdbc:mysql://" + enderecoBanco, usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) throws ClassNotFoundException {
        Conexao.getConnection();
    }

}
