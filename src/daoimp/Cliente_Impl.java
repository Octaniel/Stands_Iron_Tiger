package daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Cliente;
import model.Conexao;
import net.proteanit.sql.DbUtils;
import dao.Generic_Dao;

public class Cliente_Impl implements Generic_Dao {

    PreparedStatement ps = null;
    Connection co = null;
    ResultSet rs = null;

    public Cliente_Impl() {
        co = Conexao.conectar();
    }

    public void adicionar(Cliente c) {
        String sql = "INSERT INTO public.\"Cliente\"(\n"
                + "	\"Nome\", \"Data de Nascimento\", \"Nacionalidade\", \"Tipo\", \"Telefone\", \"Zona\", \"Distrito\", \"Genero\", \"Email\", \"Tipo de Documento\", \"Numero de Documento\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setDate(2, new Date(c.getData_de_nascimento().getTime()));
            ps.setString(3, c.getPais());
            ps.setString(4, c.getTipo_de_cliente());
            ps.setInt(5, (int) c.getTelefone());
            ps.setString(6, c.getZona());
            ps.setString(7, c.getDistrito());
            ps.setString(8, c.getGenero());
            ps.setString(9, c.getEmail());
            ps.setString(10, c.getTipo_de_documento());
            ps.setInt(11, c.getDocumento_de_identificacao());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iserir no banco de dados" + ex);
        }
    }

    @Override
    public void pesquisar(String s, JTable j) {
        final String sql = "SELECT \"Nome\", \"Data de Nascimento\", \"Nacionalidade\", \"Tipo\", \"Telefone\", \"Zona\", \"Distrito\", \"Genero\", \"Email\", \"Tipo de Documento\", \"Numero de Documento\"\n" +
"	FROM public.\"Cliente\" where \"Nome\" like ?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     public void pesquisarav(String s, JTable j) {
        final String sql = "SELECT \"Nome\", \"Data de Nascimento\", \"Telefone\", \"Numero de Documento\"\n" +
"	FROM public.\"Cliente\" where \"Nome\" like ?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void remover(JTable j) {
        String sql = "DELETE FROM \"public\".\"Cliente\" where \"Nome\"=?";
        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, j.getModel().getValueAt(i, 0).toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void editar(Cliente c) {
        String sql = "UPDATE public.\"Cliente\" SET \"Email\"=?, \"Telefone\"=?, \"Zona\"=?, \"Distrito\"=? WHERE \"Nome\"=?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, c.getEmail());
            ps.setLong(2, c.getTelefone());
            ps.setString(3, c.getZona());
            ps.setString(4, c.getDistrito());
            ps.setString(5, c.getNome());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados" + ex);
        }
    }

}
