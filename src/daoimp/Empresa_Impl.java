package daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Conexao;
import model.Empresa;
import net.proteanit.sql.DbUtils;
import vew.Empresa_Vew;
import dao.Generic_Dao;

public class Empresa_Impl implements Generic_Dao {

    PreparedStatement ps = null;
    Connection co = null;
    ResultSet rs = null;

    public Empresa_Impl() {
        co = Conexao.conectar();
    }

    public void inserir(Empresa e) {
        String sql = "insert into \"public\".\"Empresa\"(\"Nome\",\"Zona\",\"Distrito\",\"Numero de funcionario\") values(?,?,?,?)";

        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, e.getNome());
            ps.setString(2, e.getZona());
            ps.setString(3, e.getDistrito());
            ps.setInt(4, e.getNfuncionarios());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iserir no banco de dados" + ex);
        }
    }

    @Override
    public void pesquisar(String s, JTable j) {
        String sql = "SELECT \"Nome\", \"Distrito\", \"Zona\", \"Numero de funcionario\"\n"
                + "	FROM public.\"Empresa\" where \"Nome\" like ?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Empresa_Vew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(JTable j) {
        String sql = "DELETE FROM \"public\".\"Empresa\" where \"Nome\"=?";
        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, j.getModel().getValueAt(i, 0).toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
        }
    }

    

    public void editar(Empresa e,JTable j) {
        String sql = "UPDATE \"public\".\"Empresa\" SET \"Nome\"=?,\"Zona\"=?,\"Distrito\"=?,\"Numero de funcionario\"=? WHERE \"Nome\"=?";
        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, e.getNome());
            ps.setString(2, e.getZona());
            ps.setString(3, e.getDistrito());
            ps.setInt(4, e.getNfuncionarios());
            ps.setString(5, j.getModel().getValueAt(i, 0).toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
