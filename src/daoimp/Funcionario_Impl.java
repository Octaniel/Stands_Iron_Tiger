/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Conexao;
import model.Funcionario;
import net.proteanit.sql.DbUtils;
import vew.Empresa_Vew;
import dao.Generic_Dao;

/**
 *
 * @author jailson bom jesus
 */
public class Funcionario_Impl implements Generic_Dao {

    PreparedStatement ps = null;
    Connection co = null;
    ResultSet rs = null;

    public Funcionario_Impl() {
        co = Conexao.conectar();
    }

    public void adicionar(Funcionario f) {
        String sql = "INSERT INTO public.\"Funcionario\"(\"Nome\", \"Distrito\", \"Zona\", \"Status\", \"Genero\", \"Salario\", \"Telefone\", \"Data de Nascimento\", \"Senha\", \"Nome de Usuario\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getDistrito());
            ps.setString(3, f.getZona());
            ps.setLong(7, f.getTelefone());
            ps.setString(4, f.getStatus());
            ps.setString(5, f.getGenero());
            ps.setDate(8, new Date(f.getData_de_nascimento().getTime()));
            ps.setDouble(6, f.getSalario());
            ps.setString(9, f.getSenha());
            ps.setString(10, f.getNome_de_usuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao iserir no banco de dados" + ex);
        }
    }

    @Override
    public void pesquisar(String s, JTable j) {
        String sql = "SELECT \"Nome\", \"Distrito\", \"Zona\", \"Status\", \"Genero\", \"Salario\", \"Telefone\", \"Data de Nascimento\"\n"
                + "	FROM public.\"Funcionario\" where \"Nome\" like ?";
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
        String sql = "DELETE FROM \"public\".\"Funcionario\" where \"Nome\"=? and \"Telefone\"=?";
        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, j.getModel().getValueAt(i, 0).toString());
            ps.setInt(2, Integer.parseInt(j.getModel().getValueAt(i, 6).toString()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
        }
    }

    public void editar(Funcionario f, JTable j) {
        String sql = "update \"public\".\"Funcionario\" set \"Distrito\"=?,\"Zona\"=?,\"Telefone\"=?,\"Status\"=?,\"Salario\"=?,\"Senha\"=?, \"Nome de Usuario\"=? where \"Nome\"=? and \"Telefone\"=?";

        try {
            int i = j.getSelectedRow();
            ps = co.prepareStatement(sql);
            ps.setString(1, f.getDistrito());
            ps.setString(2, f.getZona());
            ps.setLong(3, f.getTelefone());
            ps.setString(4, f.getStatus());
            ps.setDouble(5, f.getSalario());
            ps.setString(6, f.getSenha());
            ps.setString(7, f.getNome_de_usuario());
            ps.setString(8, j.getModel().getValueAt(i, 0).toString());
            ps.setInt(9, Integer.parseInt(j.getModel().getValueAt(i, 6).toString()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados" + ex);
        }
    }

    public void editarlogin(Funcionario f, Funcionario novof) {
        String sql = "UPDATE public.\"Funcionario\"\n" +
"	SET \"Senha\"=?, \"Nome de Usuario\"=?\n" +
"	WHERE \"Senha\"=? and \"Nome de Usuario\"=?;";
        try {
            JOptionPane.showMessageDialog(null, f.getSenha()+" "+f.getNome_de_usuario());
            ps = co.prepareStatement(sql);
            ps.setString(1, novof.getSenha());
            ps.setString(2, novof.getNome_de_usuario());
            ps.setString(3, f.getSenha());
            ps.setString(4, f.getNome_de_usuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Susseso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
}
