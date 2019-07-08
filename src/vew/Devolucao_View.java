/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vew;

import daoimp.Devolucao_Impl;
import daoimp.Empresa_Impl;
import javax.swing.JOptionPane;
import model.Devolucao;
import model.Empresa;
import static vew.Empresa_Vew.emptabela;

/**
 *
 * @author jailson bom jesus
 */
public class Devolucao_View extends javax.swing.JInternalFrame {

    /**
     * Creates new form devolucaoview
     */
    public Devolucao_View() {
        initComponents();
        devrecebido.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        devtabela = new javax.swing.JTable();
        devneste = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        devcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        devplaca = new javax.swing.JTextField();
        devbusca = new javax.swing.JToggleButton();
        devrecebido = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1100, 650));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        devtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        devtabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devtabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(devtabela);

        devneste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "Mês", "Semana" }));
        devneste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devnesteActionPerformed(evt);
            }
        });

        jLabel1.setText("Neste(a):");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Placa de carro:");

        devbusca.setText("buscar");
        devbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devbuscaActionPerformed(evt);
            }
        });

        devrecebido.setText("Recebido");
        devrecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devrecebidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devneste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(devbusca))
            .addGroup(layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addComponent(devrecebido)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(devneste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(devcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(devplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(devbusca)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(devrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devnesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devnesteActionPerformed
            Devolucao_Impl de=new Devolucao_Impl();
            String s=devneste.getSelectedItem().toString();
            de.pesquisar(devcliente.getText(),devplaca.getText(),s, devtabela);
    }//GEN-LAST:event_devnesteActionPerformed

    private void devtabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devtabelaMouseClicked
            devrecebido.setVisible(true);
    }//GEN-LAST:event_devtabelaMouseClicked

    private void devrecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devrecebidoActionPerformed
            devrecebido.setVisible(false);
    }//GEN-LAST:event_devrecebidoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
            Devolucao_Impl de=new Devolucao_Impl();
            String s=devneste.getSelectedItem().toString();
            de.pesquisar(devcliente.getText(),devplaca.getText(),s, devtabela);
    }//GEN-LAST:event_formInternalFrameOpened

    private void devbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devbuscaActionPerformed
            Devolucao_Impl de=new Devolucao_Impl();
            String s=devneste.getSelectedItem().toString();
            de.pesquisar(devcliente.getText(),devplaca.getText(),s, devtabela);
    }//GEN-LAST:event_devbuscaActionPerformed
 
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton devbusca;
    private javax.swing.JTextField devcliente;
    private javax.swing.JComboBox<String> devneste;
    private javax.swing.JTextField devplaca;
    private javax.swing.JToggleButton devrecebido;
    private javax.swing.JTable devtabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
