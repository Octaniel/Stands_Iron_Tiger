/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vew;

import java.awt.Toolkit;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conexao;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jailson bom jesus
 */
public class Escolha_Relatorio_View extends javax.swing.JInternalFrame {
        Connection co;
    /**
     * Creates new form Escolha_Relatorio
     */
    public Escolha_Relatorio_View() {
        co=Conexao.conectar();
        this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width  / 2) - (this.getWidth() / 2)), 
                ((Toolkit.getDefaultToolkit().getScreenSize().height / 2) - (this.getHeight() / 2)));
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        esrtiporelatorio = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tipo relatorio");
        setPreferredSize(new java.awt.Dimension(308, 193));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 3), "Realorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(204, 0, 102))); // NOI18N

        esrtiporelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Clientes", "Aluguel", "Venda" }));
        esrtiporelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esrtiporelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(esrtiporelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(esrtiporelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esrtiporelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esrtiporelatorioActionPerformed
        String st=esrtiporelatorio.getSelectedItem().toString();
        if(st.equals("Aluguel")){
            try {
                JasperPrint jp=JasperFillManager.fillReport("C:/Users/jailson bom jesus/Documents/Stands/aluguel.jasper", null,co);
                JasperViewer.viewReport(jp);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro"+ex.getMessage());
            }
        }else if(st.equals("Clientes")){
            try {
                JasperPrint jp=JasperFillManager.fillReport("C:/Users/jailson bom jesus/Documents/Stands/clientes.jasper", null,co);
                JasperViewer.viewReport(jp);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro"+ex.getMessage());
            }
        }else if(st.equals("Venda")){
            try {
                JasperPrint jp=JasperFillManager.fillReport("C:/Users/jailson bom jesus/Documents/Stands/venda.jasper", null,co);
                JasperViewer.viewReport(jp);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro"+ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "A Escolha não é para ser selecionada,\n é para dizer que deves selecionar item abaixo","Erro a selecionar item",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_esrtiporelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> esrtiporelatorio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
