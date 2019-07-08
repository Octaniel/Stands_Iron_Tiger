package daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Carro;
import model.Conexao;
import net.proteanit.sql.DbUtils;
import dao.Generic_Dao;

public class Carro_Impl implements Generic_Dao {

    PreparedStatement ps = null;
    Connection co = null;
    ResultSet rs = null;

    public Carro_Impl() {
        co = Conexao.conectar();
    }

    public void adicionar(Carro c) {
        String sql = "INSERT INTO public.\"Carro\" (\"Categoria\", \"Marca\", \"Modelo\", \"Ano\", \"Placa\", \"Fabricante\", \"Kilometragem\", \"Preco\",\"Status\",\"Preço de venda\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, c.getCategoria());
            ps.setString(2, c.getMarca());
            ps.setString(3, c.getModelo());
            ps.setLong(4, c.getAno());
            ps.setString(5, c.getPlaca());
            ps.setString(6, c.getFabricante());
            ps.setInt(7, c.getKilometragem());
            ps.setDouble(8, c.getPreco_aluguer_dia());
            ps.setString(9, c.getStatus());
            ps.setDouble(10, c.getPreco_venda());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iserir no banco de dados" + ex);
        }
    }

    @Override
    public void pesquisar(String s, JTable j) {
        String sql = "SELECT \"Categoria\", \"Marca\", \"Modelo\", \"Ano\", \"Placa\", \"Fabricante\", \"Kilometragem\", \"Preco\", \"Status\",\"Preço de venda\" FROM public.\"Carro\" where \"Marca\" like ?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
        }
    }

    public void pesquisarav(String s, JTable j) {
        String sql = "SELECT \"Marca\", \"Modelo\", \"Ano\", \"Placa\", \"Preco\" FROM public.\"Carro\" where \"Marca\" like ?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
        }
    }
    
     public void pesquisarava(String st, JTable j) {
        String sql = "SELECT \"Marca\", \"Modelo\", \"Ano\", \"Placa\", \"Preco\" FROM public.\"Carro\" where \"Status\" like ? and \"Marca\" like ?";
        try {
            String s="Disponivel";
            ps = co.prepareStatement(sql);
            ps.setString(1, s + "%");
            ps.setString(2, st + "%");
            rs = ps.executeQuery();
            j.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
        }
    }

    @Override
    public void remover(JTable j) {
        String sql = "DELETE FROM public.\"Carro\"\n"
                + "	WHERE \"Placa\"=?";
        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, j.getModel().getValueAt(i, 4).toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
        }
    }
    
     public void removerav(String placa) {
        String sql = "DELETE FROM public.\"Carro\"\n"
                + "	WHERE \"Placa\"=?";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, placa);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public void editar(Carro c) {
        String sql = "UPDATE public.\"Carro\"\n"
                + "	SET  \"Preco\"=?,\"Preço de venda\"=?\n"
                + "	WHERE \"Placa\"=?";

        try {
            ps = co.prepareStatement(sql);
            ps.setDouble(1, c.getPreco_aluguer_dia());
            ps.setDouble(2, c.getPreco_venda());
            ps.setString(3, c.getPlaca());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados" + ex);
        }
    }
      public void editarav(Carro c) {
        String sql = "UPDATE public.\"Carro\"\n"
                + "	SET  \"Status\"=?\n"
                + "	WHERE \"Placa\"=?";

        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, c.getStatus());
            ps.setString(2, c.getPlaca());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados" + ex);
        }
    }
}
