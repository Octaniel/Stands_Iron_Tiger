package daoimp;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Conexao;
import model.Devolucao;
import net.proteanit.sql.DbUtils;

public class Devolucao_Impl {

    PreparedStatement ps = null;
    Connection co = null;
    ResultSet rs = null;

    public Devolucao_Impl() {
        co = Conexao.conectar();
    }

    public void inserir(Devolucao d) {
        String sql = "INSERT INTO public.\"Devolucao\"(\n"
                + "	\"Nome de Cliente\", \"Placa de carro\", \"Marca de carro\", \"Telefone de Cliente\", \"Data de entrega\", \"Hora de entrega\", \"Semana\",\"Mes\", \"Ano\")\n"
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, d.getNomecliente());
            ps.setString(2, d.getPlacacarro());
            ps.setString(3, d.getMarcacarro());
            ps.setInt(4, d.getNumerocliente());
            ps.setDate(5, new java.sql.Date(d.getDatafinal().getTime()));
            ps.setString(6, d.getHorafinal());
            Calendar ca = Calendar.getInstance();
            ca.setTime(d.getDatafinal());
            int semana = ca.get(Calendar.WEEK_OF_MONTH);
            int mes = ca.get(Calendar.MONTH) + 1;
            int ano = ca.get(Calendar.YEAR);
            ps.setInt(7, semana);
            ps.setInt(8, mes);
            ps.setInt(9, ano);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        }

    }

    public void pesquisar(String nomecliente, String placacarro, String s, JTable tabela) {
        String sql = "";
        int t;
        Calendar c = Calendar.getInstance();
        java.util.Date dt = new java.util.Date();
        c.setTime(dt);
        switch (s) {
            case "Semana":
                t = c.get(Calendar.WEEK_OF_MONTH);
                //JOptionPane.showMessageDialog(null, t);
                sql = "SELECT \"Nome de Cliente\", \"Placa de carro\", \"Marca de carro\", \"Telefone de Cliente\", \"Data de entrega\", \"Hora de entrega\"\n" +
"   	FROM public.\"Devolucao\" where \"Nome de Cliente\" like ? and \"Placa de carro\" like ? and \"Semana\"=?";
                break;
            case "Mês":
                t = c.get(Calendar.MONTH) + 1;
                //JOptionPane.showMessageDialog(null, t);
                sql = "SELECT \"Nome de Cliente\", \"Placa de carro\", \"Marca de carro\", \"Telefone de Cliente\", \"Data de entrega\", \"Hora de entrega\"\n" +
"   	FROM public.\"Devolucao\" where \"Nome de Cliente\" like ? and \"Placa de carro\" like ? and \"Mes\"=?";
                break;
            default:
                t = c.get(Calendar.YEAR);
                sql = "SELECT \"Nome de Cliente\", \"Placa de carro\", \"Marca de carro\", \"Telefone de Cliente\", \"Data de entrega\", \"Hora de entrega\"\n" +
"   	FROM public.\"Devolucao\" where \"Nome de Cliente\" like ? and \"Placa de carro\" like ? and \"Ano\"=?";
                break;
        }
        try {
            ps = co.prepareStatement(sql);
            //JOptionPane.showMessageDialog(null, nomecliente);
            ps.setString(1, nomecliente + "%");
            ps.setString(2, placacarro + "%");
            ps.setInt(3, t);
            rs = ps.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    
}
