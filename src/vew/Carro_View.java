package vew;

import daoimp.Carro_Impl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Carro;

public class Carro_View extends javax.swing.JInternalFrame {

    public Carro_View() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carpesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartabela = new javax.swing.JTable();
        carpreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        carmodelo = new javax.swing.JTextField();
        carplaca = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        carcategoria = new javax.swing.JComboBox<>();
        carfabricante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        caradd = new javax.swing.JButton();
        caremove = new javax.swing.JButton();
        caredit = new javax.swing.JButton();
        carmarca = new javax.swing.JTextField();
        carid = new javax.swing.JLabel();
        caranno = new com.toedter.calendar.JYearChooser();
        jLabel11 = new javax.swing.JLabel();
        carprevenda = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carro");
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

        carpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carpesquisaKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/55369 (1).jpg"))); // NOI18N

        cartabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        cartabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartabela);

        jLabel5.setText("Ano:");

        jLabel7.setText("Preço por dia:");

        jLabel6.setText("Categoria:");

        try {
            carplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("STP-##-##A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Marca:");

        jLabel4.setText("Modelo:");

        jLabel9.setText("Placa:");

        jLabel10.setText("Categoria:");

        carcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mini", "Econômico", "Intermediário", "Grande", "Estate", "Vans", "Luxo" }));
        carcategoria.setToolTipText("");

        jLabel8.setText("Fabricante:");

        caradd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/54657.200.jpg"))); // NOI18N
        caradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraddActionPerformed(evt);
            }
        });

        caremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove_Car.512.jpg"))); // NOI18N
        caremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caremoveActionPerformed(evt);
            }
        });

        caredit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.2.jpg"))); // NOI18N
        caredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careditActionPerformed(evt);
            }
        });

        carid.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        carid.setText("jLabel11");

        jLabel11.setText("Preço de venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(caradd)
                        .addGap(106, 106, 106)
                        .addComponent(caremove)
                        .addGap(104, 104, 104)
                        .addComponent(caredit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caranno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(319, 319, 319)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carprevenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(carid))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(871, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(162, 162, 162)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(carmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(carmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(carplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(caranno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(carpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(carcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(carfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(carprevenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caremove, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caredit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caradd))
                .addGap(19, 19, 19)
                .addComponent(carid))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(506, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caremoveActionPerformed
        Carro_Impl cd = new Carro_Impl();
        cd.remover(cartabela);
        cd.pesquisar(carpesquisa.getText(), cartabela);
        caradd.setVisible(true);
        caranno.setEnabled(true);
        //caranno.setYear();
        carcategoria.setEnabled(true);
        carfabricante.setEnabled(true);
        carfabricante.setText("");
        carmarca.setEnabled(true);
        carprevenda.setText("");
        carmarca.setText("");
        carmodelo.setEnabled(true);
        carmodelo.setText("");
        carplaca.setEnabled(true);
        carplaca.setText("");
        carpreco.setText("");
    }//GEN-LAST:event_caremoveActionPerformed

    private void caraddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraddActionPerformed
        
        Carro c = new Carro();
        Carro_Impl cd = new Carro_Impl();
        c.setAno(caranno.getYear());
        c.setCategoria(carcategoria.getSelectedItem().toString());
        c.setFabricante(carfabricante.getText());
        c.setPreco_aluguer_dia(Double.parseDouble(carpreco.getText()));
        c.setMarca(carmarca.getText());
        c.setModelo(carmodelo.getText());
        c.setPlaca(carplaca.getText());
        c.setPreco_aluguer_dia(Double.parseDouble(carpreco.getText()));
        c.setPreco_venda(Double.parseDouble(carprevenda.getText()));
        c.setStatus("Disponivel");
        Date dt=new Date();
        Calendar cal=Calendar.getInstance();
        cal.setTime(dt);
        if(cal.get(Calendar.YEAR)<caranno.getYear()){
            JOptionPane.showMessageDialog(null, "Como podes por ano:"+caranno.getYear()+", Se entamos no ano:"+cal.get(Calendar.YEAR),"Erro no ano",JOptionPane.ERROR_MESSAGE);
        }else{
        cd.adicionar(c);
        cd.pesquisar(carpesquisa.getText(), cartabela);
        carprevenda.setText("");
        carfabricante.setText("");
        carmarca.setText("");
        carmodelo.setText("");
        carplaca.setText("");
        carpreco.setText("");
        }
    }//GEN-LAST:event_caraddActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Carro_Impl cd = new Carro_Impl();
        cd.pesquisar(carpesquisa.getText(), cartabela);
    }//GEN-LAST:event_formInternalFrameOpened

    private void carpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carpesquisaKeyReleased
        Carro_Impl cd = new Carro_Impl();
        cd.pesquisar(carpesquisa.getText(), cartabela);
    }//GEN-LAST:event_carpesquisaKeyReleased

    private void cartabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartabelaMouseClicked
        int i = cartabela.getSelectedRow();
        //carid.setText(cartabela.getModel().getValueAt(i, 0).toString());
        carmarca.setText(cartabela.getModel().getValueAt(i, 1).toString());
        carmodelo.setText(cartabela.getModel().getValueAt(i, 2).toString());
        caranno.setYear(Integer.parseInt(cartabela.getModel().getValueAt(i, 3).toString()));
        carplaca.setText(cartabela.getModel().getValueAt(i, 4).toString());
        carpreco.setText(cartabela.getModel().getValueAt(i, 7).toString());
        carfabricante.setText(cartabela.getModel().getValueAt(i, 5).toString());
        carcategoria.setSelectedItem(cartabela.getModel().getValueAt(i, 0).toString());
        caradd.setVisible(false);
        caranno.setEnabled(false);
        carcategoria.setEnabled(false);
        carfabricante.setEnabled(false);
        carmarca.setEnabled(false);
        carmodelo.setEnabled(false);
        carplaca.setEnabled(false);
    }//GEN-LAST:event_cartabelaMouseClicked

    private void careditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careditActionPerformed
        Carro c = new Carro();
        Carro_Impl cd = new Carro_Impl();
        //c.setId(Integer.parseInt(carid.getText()));
        c.setAno(caranno.getYear());
        c.setCategoria(carcategoria.getSelectedItem().toString());
        c.setFabricante(carfabricante.getText());
        c.setPreco_aluguer_dia(Double.parseDouble(carpreco.getText()));
        c.setPreco_venda(Double.parseDouble(carprevenda.getText()));
        c.setMarca(carmarca.getText());
        c.setModelo(carmodelo.getText());
        c.setPlaca(carplaca.getText());
        cd.editar(c);
        cd.pesquisar(carpesquisa.getText(), cartabela);
        caranno.setEnabled(true);
        //caranno.setText("");
        carcategoria.setEnabled(true);
        carfabricante.setEnabled(true);
        carprevenda.setText("");
        carfabricante.setText("");
        carmarca.setEnabled(true);
        carmarca.setText("");
        carmodelo.setEnabled(true);
        carmodelo.setText("");
        carplaca.setEnabled(true);
        carplaca.setText("");
        carpreco.setText("");
        caradd.setVisible(true);
    }//GEN-LAST:event_careditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caradd;
    private com.toedter.calendar.JYearChooser caranno;
    private javax.swing.JComboBox<String> carcategoria;
    private javax.swing.JButton caredit;
    private javax.swing.JButton caremove;
    private javax.swing.JTextField carfabricante;
    private javax.swing.JLabel carid;
    private javax.swing.JTextField carmarca;
    private javax.swing.JTextField carmodelo;
    private javax.swing.JTextField carpesquisa;
    private javax.swing.JFormattedTextField carplaca;
    private javax.swing.JTextField carpreco;
    private javax.swing.JTextField carprevenda;
    private javax.swing.JTable cartabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
