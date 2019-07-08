
package vew;

import daoimp.Aluguel_Impl;
import daoimp.Carro_Impl;
import daoimp.Cliente_Impl;
import daoimp.Devolucao_Impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Aluguel;
import model.Carro;
import model.Devolucao;

public class Alugar_View extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alugar
     */
    public Alugar_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        aluprincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aluclitabela = new javax.swing.JTable();
        aluclipesquisa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        alunomcliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aluinicio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        aluplacarro = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alucartabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        alucarpesquisa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        alufim = new com.toedter.calendar.JDateChooser();
        horainicio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        horafim = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        popupMenu1.setLabel("popupMenu1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Aluguel");
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

        aluprincipal.setPreferredSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        aluclitabela.setModel(new javax.swing.table.DefaultTableModel(
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
        aluclitabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluclitabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(aluclitabela);

        aluclipesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluclipesquisaActionPerformed(evt);
            }
        });
        aluclipesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aluclipesquisaKeyReleased(evt);
            }
        });

        jLabel7.setText("Nome:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/55369 (1).jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addfun.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aluclipesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(aluclipesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setText("Cliente:");

        jLabel3.setText("Inicio:");

        jLabel6.setText("Placa:");

        try {
            aluplacarro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("STP-##-##A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vacation_Rental.512.jpg"))); // NOI18N
        jToggleButton1.setToolTipText("Alugar");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Fim:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Carro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        alucartabela.setModel(new javax.swing.table.DefaultTableModel(
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
        alucartabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alucartabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(alucartabela);

        jLabel5.setText("Marca:");

        alucarpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alucarpesquisaKeyReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/55369 (1).jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/55369 (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alucarpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(jLabel8)
                    .addContainerGap(270, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(alucarpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jLabel8)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );

        horainicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00" }));
        horainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horainicioActionPerformed(evt);
            }
        });

        jLabel10.setText("Hora inicio:");

        jLabel11.setText("Hora fim:");

        horafim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00" }));

        jLabel12.setText("Preço total:");

        javax.swing.GroupLayout aluprincipalLayout = new javax.swing.GroupLayout(aluprincipal);
        aluprincipal.setLayout(aluprincipalLayout);
        aluprincipalLayout.setHorizontalGroup(
            aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluprincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aluprincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alunomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aluinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(alufim, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(horafim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(aluplacarro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(311, 311, 311))
            .addGroup(aluprincipalLayout.createSequentialGroup()
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aluprincipalLayout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jToggleButton1))
                    .addGroup(aluprincipalLayout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aluprincipalLayout.setVerticalGroup(
            aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aluprincipalLayout.createSequentialGroup()
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aluprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(horainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(aluprincipalLayout.createSequentialGroup()
                        .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(aluprincipalLayout.createSequentialGroup()
                                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(alunomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aluplacarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(aluprincipalLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(aluinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(aluprincipalLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(alufim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(aluprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jToggleButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(aluprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aluprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aluclipesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluclipesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluclipesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente_View cv = new Cliente_View();
        Menu_View me = new Menu_View();
        aluprincipal.setVisible(false);
        cv.setVisible(true);
        this.add(cv);
        //  me.mendesktop.add(cv);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Cliente_Impl cd = new Cliente_Impl();
        cd.pesquisarav(aluclipesquisa.getText(), aluclitabela);
        Carro_Impl cad = new Carro_Impl();
        cad.pesquisarava(alucarpesquisa.getText(), alucartabela);
    }//GEN-LAST:event_formInternalFrameOpened

    private void aluclitabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluclitabelaMouseClicked
        int i = aluclitabela.getSelectedRow();
        alunomcliente.setText(aluclitabela.getModel().getValueAt(i, 0).toString());

    }//GEN-LAST:event_aluclitabelaMouseClicked

    private void alucartabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alucartabelaMouseClicked
        int i = alucartabela.getSelectedRow();
        aluplacarro.setText(alucartabela.getModel().getValueAt(i, 3).toString());
    }//GEN-LAST:event_alucartabelaMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Date date = new Date();
        boolean b = true;
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        if (aluinicio.getDate().getYear() < date.getYear() || alufim.getDate().getYear() < date.getYear() || aluinicio.getDate().getYear() > alufim.getDate().getYear()) {
            b = false;
            JOptionPane.showMessageDialog(null, "O ano que preencheste não é aceitavel!", "Erro no ano", JOptionPane.ERROR_MESSAGE);
        } else {
            if (aluinicio.getDate().getMonth() < date.getMonth() || alufim.getDate().getMonth() < date.getMonth() || aluinicio.getDate().getMonth() > alufim.getDate().getMonth()) {
                if (aluinicio.getDate().getYear() == alufim.getDate().getYear()) {
                    b = false;
                    JOptionPane.showMessageDialog(null, "O mês que preencheste não é aceitavel!", "Erro no mês", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (Integer.parseInt(sf.format(aluinicio.getDate()).subSequence(0, 2).toString()) < Integer.parseInt(sf.format(date).subSequence(0, 2).toString()) || Integer.parseInt(sf.format(alufim.getDate()).subSequence(0, 2).toString()) < Integer.parseInt(sf.format(date).subSequence(0, 2).toString()) || Integer.parseInt(sf.format(aluinicio.getDate()).subSequence(0, 2).toString()) > Integer.parseInt(sf.format(alufim.getDate()).subSequence(0, 2).toString())) {
                    if (aluinicio.getDate().getMonth() == date.getMonth() || alufim.getDate().getMonth() == date.getMonth()) {
                        b = false;
                        JOptionPane.showMessageDialog(null, "O dia que preencheste não é aceitavel!", "Erro no dia", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    if (Integer.parseInt(horainicio.getSelectedItem().toString().subSequence(0, 2).toString()) < date.getHours() || Integer.parseInt(horafim.getSelectedItem().toString().subSequence(0, 2).toString()) < date.getHours()) {
                        if (aluinicio.getDate().getYear() < date.getYear() || alufim.getDate().getYear() < date.getYear()) {
                            if (aluinicio.getDate().getMonth() < date.getMonth() || alufim.getDate().getMonth() < date.getMonth()) {
                                if (Integer.parseInt(sf.format(aluinicio.getDate()).subSequence(0, 2).toString()) == Integer.parseInt(sf.format(date).subSequence(0, 2).toString()) || Integer.parseInt(sf.format(alufim.getDate()).subSequence(0, 2).toString()) == Integer.parseInt(sf.format(date).subSequence(0, 2).toString())) {
                                    b = false;
                                    JOptionPane.showMessageDialog(null, "A hora que preencheste não é aceitavel", "Erro na hora", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    if (Integer.parseInt(horainicio.getSelectedItem().toString().subSequence(0, 2).toString()) > Integer.parseInt(horafim.getSelectedItem().toString().subSequence(0, 2).toString())) {
                        if (Integer.parseInt(sf.format(aluinicio.getDate()).subSequence(0, 2).toString()) == Integer.parseInt(sf.format(alufim.getDate()).subSequence(0, 2).toString())) {
                            b = false;
                            JOptionPane.showMessageDialog(null, "A hora que preencheste não é aceitavel", "Erro na hora", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }

        }
        if (b == true) {
            int it = alucartabela.getSelectedRow();
            Aluguel al = new Aluguel();
            Carro_Impl cd = new Carro_Impl();
            Devolucao_Impl di=new Devolucao_Impl();
            Devolucao de=new Devolucao();
            de.setNomecliente(alunomcliente.getText());
            de.setNumerocliente(Integer.parseInt(aluclitabela.getModel().getValueAt(it, 2).toString()));
            de.setMarcacarro(alucartabela.getModel().getValueAt(it, 0).toString());
            de.setPlacacarro(aluplacarro.getText());
            de.setDatafinal(alufim.getDate());
            de.setHorafinal(horafim.getSelectedItem().toString());
            di.inserir(de);
            Carro c = new Carro();
            al.setData_final(alufim.getDate());
            al.setData_inicial(aluinicio.getDate());
            al.setHora_final(horafim.getSelectedItem().toString());
            al.setHora_inicial(horainicio.getSelectedItem().toString());
            al.setNome_do_cliente(alunomcliente.getText());
            al.setPlaca_de_carro(aluplacarro.getText());
            Aluguel_Impl ad = new Aluguel_Impl();
            c.setStatus("Alugado");
            c.setPlaca(aluplacarro.getText());
            int i=ad.alugar(al);
            if(i==1){
            cd.editarav(c);
            }
            cd.pesquisarava(alucarpesquisa.getText(), alucartabela);
            alufim.setDate(null);
            aluinicio.setDate(null);
            alunomcliente.setText("");
            aluplacarro.setText("");
            
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void horainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horainicioActionPerformed

    private void aluclipesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aluclipesquisaKeyReleased
        Cliente_Impl cd = new Cliente_Impl();
        cd.pesquisarav(aluclipesquisa.getText(), aluclitabela);
    }//GEN-LAST:event_aluclipesquisaKeyReleased

    private void alucarpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alucarpesquisaKeyReleased
        Carro_Impl cad = new Carro_Impl();
        cad.pesquisarava(alucarpesquisa.getText(), alucartabela);
    }//GEN-LAST:event_alucarpesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alucarpesquisa;
    private javax.swing.JTable alucartabela;
    private javax.swing.JTextField aluclipesquisa;
    public javax.swing.JTable aluclitabela;
    private com.toedter.calendar.JDateChooser alufim;
    private com.toedter.calendar.JDateChooser aluinicio;
    private javax.swing.JTextField alunomcliente;
    private javax.swing.JFormattedTextField aluplacarro;
    private javax.swing.JPanel aluprincipal;
    private javax.swing.JComboBox<String> horafim;
    private javax.swing.JComboBox<String> horainicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
