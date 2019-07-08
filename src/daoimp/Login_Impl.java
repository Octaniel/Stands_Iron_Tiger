
package daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Funcionario;
import vew.Menu_View;

public class Login_Impl{
PreparedStatement ps=null;
    Connection co=null;
    ResultSet rs= null;
    public Login_Impl(){
        co=Conexao.conectar();
    }
    public boolean logar(Funcionario f) {
     String sql= "SELECT * FROM \"public\".\"Funcionario\" where \"Nome de Usuario\"=? and \"Senha\"=?";
     boolean e=true;
    try {
       ps=co.prepareStatement(sql);
       ps.setString(1, f.getNome_de_usuario());
       ps.setString(2, f.getSenha());
       rs=ps.executeQuery();
       if(rs.next()){
          Menu_View m=new Menu_View();
          m.setVisible(true);
          m.nomeusuario.setText(rs.getString("Nome"));
          m.statusfun.setText(rs.getString("Status"));
          m.statusfun.setVisible(false);
          e= true;
       }else{
           JOptionPane.showMessageDialog(null, "Usuario e a senha invalida");
           e= false;
       }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
        e=false;
    }
    return e;
    }
    public boolean logarar(Funcionario f) {
    String sql= "SELECT * FROM \"public\".\"Funcionario\" where \"Nome de Usuario\"=? and \"Senha\"=?";
     boolean e=true;
    try {
       ps=co.prepareStatement(sql);
       ps.setString(1, f.getNome_de_usuario());
       ps.setString(2, f.getSenha());
       rs=ps.executeQuery();
       if(rs.next()){
             e= true;
       }else{
           JOptionPane.showMessageDialog(null, "Usuario e a senha invalida");
           e= false;
       }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
        e=false;
    }
    return e;
    }    }

