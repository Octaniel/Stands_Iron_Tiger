package daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Venda;

public class Venda_Impl {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection co = null;

    public Venda_Impl() {
        co = Conexao.conectar();
    }

    public void vender(Venda v) {
        String sql = "INSERT INTO public.\"Venda\"(\n"
                + "	 \"Nome de Cliente\", \"Placa de Carro\", \"Data de venda\", \"Hora de venda\")\n"
                + "	VALUES ( ?, ?, ?, ?)";

        try {
            ps = co.prepareStatement(sql);
            ps.setString(1, v.getNome_do_cliente());
            ps.setString(2, v.getPlaca_de_carro());
            ps.setDate(3, new Date(v.getData_inicial().getTime()));
            ps.setString(4, v.getHora_inicial());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vendido com susseso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar venda!"+ex);
        }
    }
}
