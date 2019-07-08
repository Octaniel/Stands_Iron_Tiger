
package daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Aluguel;
import model.Conexao;
import dao.Generic_Dao;


public class Aluguel_Impl implements Generic_Dao {
    PreparedStatement ps=null;
    Connection cn=null;
    ResultSet rs=null;

    public Aluguel_Impl() {
        cn=Conexao.conectar();
    }
    
    public int alugar(Aluguel a){
        String sql="INSERT INTO public.\"Aluguel\"(\n" +
"	\"Data inicio\", \"Data fim\", \"Hora inicio\", \"Hora fim\", \"Carro\", \"Cliente\")\n" +
"	VALUES ( ?, ?, ?,?, ?, ?)";
        try {
            ps=cn.prepareStatement(sql);
            ps.setDate(1,new Date(a.getData_inicial().getTime()));
            ps.setDate(2, new Date(a.getData_final().getTime()));
            ps.setString(3, a.getHora_inicial());
            ps.setString(4, a.getHora_final());
            ps.setString(5, a.getPlaca_de_carro());
            ps.setString(6, a.getNome_do_cliente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alugado com sussesso!");
            return 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alugar!"+ex);
            return 0;
        }
    }

    @Override
    public void pesquisar(String s, JTable j) {
            String sql="";
    }

    @Override
    public void remover(JTable j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}