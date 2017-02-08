package jFrame;

import model.Grafos;
import model.Vertice;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    Grafos g = new Grafos();
    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        chkBoxNOrientado = new javax.swing.JCheckBox();
        chkBoxOrientado = new javax.swing.JCheckBox();
        btnAbrir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldVertice = new javax.swing.JTextField();
        btnAddVertice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldArestaDestino = new javax.swing.JTextField();
        btnAddAresta = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtFieldArestaOrigem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkBoxNOrientado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkBoxNOrientado.setText("Não Orientado");
        chkBoxNOrientado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxNOrientadoActionPerformed(evt);
            }
        });

        chkBoxOrientado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkBoxOrientado.setText("Orientado");
        chkBoxOrientado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxOrientadoActionPerformed(evt);
            }
        });

        btnAbrir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ab.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Vertice");

        txtFieldVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldVerticeActionPerformed(evt);
            }
        });

        btnAddVertice.setText("+");
        btnAddVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVerticeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Aresta Origem");

        btnAddAresta.setText("+");
        btnAddAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArestaActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fx.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Aresta Destino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFieldVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldArestaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFieldArestaDestino))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddAresta)
                    .addComponent(btnAddVertice, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVertice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldArestaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldArestaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddAresta)))
                .addGap(14, 14, 14))
        );

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sv.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jTxtDisplay.setEditable(false);
        jTxtDisplay.setBackground(new java.awt.Color(0, 0, 0));
        jTxtDisplay.setColumns(20);
        jTxtDisplay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTxtDisplay.setForeground(new java.awt.Color(51, 255, 102));
        jTxtDisplay.setRows(5);
        jTxtDisplay.setCaretColor(new java.awt.Color(51, 255, 102));
        jTxtDisplay.setSelectedTextColor(new java.awt.Color(0, 255, 102));
        jScrollPane1.setViewportView(jTxtDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(chkBoxOrientado)
                                .addGap(8, 8, 8)
                                .addComponent(chkBoxNOrientado)
                                .addGap(48, 48, 48)
                                .addComponent(btnAbrir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAbrir)
                        .addComponent(chkBoxOrientado)
                        .addComponent(chkBoxNOrientado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void chkBoxOrientadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxOrientadoActionPerformed
       chkBoxNOrientado.setSelected(false);
       g.setTipo("orientado");
    }//GEN-LAST:event_chkBoxOrientadoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
       g.abrir(g);
      JOptionPane.showMessageDialog(null,"Carregado com Sucesso!!");
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       g.salvar(g);
        JOptionPane.showMessageDialog(null,"Salvo com Sucesso!!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void chkBoxNOrientadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxNOrientadoActionPerformed
       chkBoxOrientado.setSelected(false);
       g.setTipo("nOrientado");
    }//GEN-LAST:event_chkBoxNOrientadoActionPerformed

    private void txtFieldVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldVerticeActionPerformed
   
    }//GEN-LAST:event_txtFieldVerticeActionPerformed

    private void btnAddVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVerticeActionPerformed
       g.addVertice( Integer.parseInt(txtFieldVertice.getText()));
       txtFieldVertice.setText("");
      jTxtDisplay.setText("Vertice: ("+g.getVertice()+")");
       if(g.getTipo() == null){
      //     txtDisplay.setText("ESCOLHA UM TIPO:\nOrientado ou Não Orientado");
       }
    }//GEN-LAST:event_btnAddVerticeActionPerformed

    private void btnAddArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArestaActionPerformed
       g.addAresta(Integer.parseInt(txtFieldArestaOrigem.getText()),Integer.parseInt(txtFieldArestaDestino.getText()));
       txtFieldArestaOrigem.setText("");
       txtFieldArestaDestino.setText("");
       jTxtDisplay.setText("Aresta: ("+g.getAresta()+")");

    }//GEN-LAST:event_btnAddArestaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAddAresta;
    private javax.swing.JButton btnAddVertice;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox chkBoxNOrientado;
    private javax.swing.JCheckBox chkBoxOrientado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtDisplay;
    private javax.swing.JTextField txtFieldArestaDestino;
    private javax.swing.JTextField txtFieldArestaOrigem;
    private javax.swing.JTextField txtFieldVertice;
    // End of variables declaration//GEN-END:variables
}
