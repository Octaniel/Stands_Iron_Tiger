package model;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
 static Connection conn;
    public static Connection conectar() {
        
        try {
                Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stands", "postgres", "1234");
          
        } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, "Erro a conectar ao Base de dados"+ex);
        }
       
       return conn;
    }
   
}

