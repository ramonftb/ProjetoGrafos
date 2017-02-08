/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextArea;
import model.Aresta;
import model.Grafo;
import model.Vertice;
import model.Graphml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    Grafo grafo = new Grafo();
    Graphml graphml = new Graphml();
    List<Vertice>listaVertice = new ArrayList<Vertice>();
    List<Aresta>listaAresta = new ArrayList<Aresta>();
    private String choose = null;
    //boolean ca = false;
    public FrmPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        MatrizIncidencia = new javax.swing.JButton();
        MatrizAdjacencia = new javax.swing.JButton();
        ListaAdjacencia = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        abrirXML = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnGrau = new javax.swing.JButton();
        incidente = new javax.swing.JButton();
        Conjunto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAdicionarVertice3 = new javax.swing.JButton();
        btnEditarAresta = new javax.swing.JButton();
        btnAdicionarVertice5 = new javax.swing.JButton();
        cbNo1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbNo2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnConfAresta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbNo1Editar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbNoNovo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbNo2Editar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        NovoPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnEditarVertice = new javax.swing.JButton();
        btnDelVertice = new javax.swing.JButton();
        txtVertice = new javax.swing.JTextField();
        btnAddVertice = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnConfVertice = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EditarVertice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EditarNovoVertice = new javax.swing.JTextField();
        btnIncidentes = new javax.swing.JButton();
        btnAdjacentes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Display"));

        display.setEditable(false);
        display.setBackground(new java.awt.Color(0, 0, 0));
        display.setColumns(10);
        display.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        display.setForeground(new java.awt.Color(0, 255, 0));
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
        );

        MatrizIncidencia.setText("Matriz Incidência");
        MatrizIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizIncidenciaActionPerformed(evt);
            }
        });

        MatrizAdjacencia.setText("Matriz Adjacência");
        MatrizAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizAdjacenciaActionPerformed(evt);
            }
        });

        ListaAdjacencia.setText("Lista Adjacência");
        ListaAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaAdjacenciaActionPerformed(evt);
            }
        });

        Salvar.setBackground(new java.awt.Color(102, 255, 102));
        Salvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        abrirXML.setBackground(new java.awt.Color(153, 153, 255));
        abrirXML.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        abrirXML.setText("Abrir");
        abrirXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirXMLActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Gerar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnGrau.setText("Grau");
        btnGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrauActionPerformed(evt);
            }
        });

        incidente.setText("Ordem do Grafo");
        incidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incidenteActionPerformed(evt);
            }
        });

        Conjunto.setText("Conjunto");
        Conjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConjuntoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafico"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("                                         Imagem");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aresta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnAdicionarVertice3.setForeground(new java.awt.Color(0, 255, 0));
        btnAdicionarVertice3.setText("Adicionar");
        btnAdicionarVertice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVertice3ActionPerformed(evt);
            }
        });

        btnEditarAresta.setForeground(new java.awt.Color(0, 0, 204));
        btnEditarAresta.setText("Editar");
        btnEditarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarArestaActionPerformed(evt);
            }
        });

        btnAdicionarVertice5.setForeground(new java.awt.Color(255, 0, 0));
        btnAdicionarVertice5.setText("Deletar");
        btnAdicionarVertice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVertice5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("No2");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("No1");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Aresta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(153, 153, 153));

        btnConfAresta.setForeground(new java.awt.Color(0, 255, 0));
        btnConfAresta.setText("Confirmar");
        btnConfAresta.setEnabled(false);
        btnConfAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfArestaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("No1");

        cbNo1Editar.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Novo");

        cbNoNovo.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("No2");

        cbNo2Editar.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Peso");

        NovoPeso.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNoNovo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(cbNo1Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbNo2Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NovoPeso))
                    .addComponent(btnConfAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbNo2Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)
                        .addComponent(NovoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbNo1Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbNoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(btnConfAresta))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Peso");

        peso.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAdicionarVertice3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarVertice5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarVertice3)
                    .addComponent(btnEditarAresta)
                    .addComponent(btnAdicionarVertice5))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vertice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnEditarVertice.setForeground(new java.awt.Color(0, 0, 255));
        btnEditarVertice.setText("Editar");
        btnEditarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVerticeActionPerformed(evt);
            }
        });

        btnDelVertice.setForeground(new java.awt.Color(255, 0, 0));
        btnDelVertice.setText("Deletar");
        btnDelVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelVerticeActionPerformed(evt);
            }
        });

        btnAddVertice.setForeground(new java.awt.Color(0, 255, 0));
        btnAddVertice.setText("Adicionar");
        btnAddVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVerticeActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Vertice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnConfVertice.setForeground(new java.awt.Color(0, 255, 0));
        btnConfVertice.setText("Confirmar");
        btnConfVertice.setEnabled(false);
        btnConfVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfVerticeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Vertice");

        EditarVertice.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Novo");

        EditarNovoVertice.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditarNovoVertice))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfVertice))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EditarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EditarNovoVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfVertice)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtVertice)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnAddVertice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelVertice))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarVertice)
                    .addComponent(btnDelVertice)
                    .addComponent(btnAddVertice))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnIncidentes.setText("Incidentes");
        btnIncidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncidentesActionPerformed(evt);
            }
        });

        btnAdjacentes.setText("Adjacentes");
        btnAdjacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjacentesActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(abrirXML, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(incidente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MatrizIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(btnIncidentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MatrizAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(Conjunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGrau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ListaAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addGap(47, 47, 47))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAdjacentes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abrirXML)
                            .addComponent(Salvar)
                            .addComponent(jButton2)
                            .addComponent(btnSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfo)
                            .addComponent(btnLimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncidentes)
                            .addComponent(btnAdjacentes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(incidente)
                            .addComponent(Conjunto)
                            .addComponent(btnGrau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MatrizIncidencia)
                            .addComponent(MatrizAdjacencia)
                            .addComponent(ListaAdjacencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarVertice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVertice3ActionPerformed
        Aresta a = new Aresta();
        a.setNode1(grafo.getListaVertices().get(cbNo1.getSelectedIndex()));
        a.setNode2(grafo.getListaVertices().get(cbNo2.getSelectedIndex())); 
        a.setPeso(Integer.parseInt(peso.getText()));
        grafo.addAresta(a);
        ImprimeAresta();
    }//GEN-LAST:event_btnAdicionarVertice3ActionPerformed

    private void btnConfArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfArestaActionPerformed
        jLabel7.setForeground(Color.gray);
        jLabel8.setForeground(Color.gray);
        jLabel9.setForeground(Color.gray); 
        jLabel10.setForeground(Color.gray); 
        
        cbNo1Editar.setEnabled(false);
        cbNo2Editar.setEnabled(false);
        cbNoNovo.setEnabled(false);
        NovoPeso.setEnabled(false);
        btnConfAresta.setEnabled(false);
        btnEditarAresta.setEnabled(true);
       
         Aresta a = new Aresta();
        a.setNode1(grafo.getListaVertices().get(cbNo1Editar.getSelectedIndex()));
        a.setNode2(grafo.getListaVertices().get(cbNoNovo.getSelectedIndex())); 
        a.setPeso(Integer.parseInt(NovoPeso.getText()));
        grafo.addAresta(a); 
        grafo.removerAresta((String) cbNo1Editar.getSelectedItem(), (String) cbNo2Editar.getSelectedItem());
        //grafo.EditarAresta(grafo,(String) cbNo1Editar.getSelectedItem(), (String) cbNo2.getSelectedItem(),(String) cbNo2Editar.getSelectedItem());
        ImprimeAresta();
    }//GEN-LAST:event_btnConfArestaActionPerformed

    private void btnEditarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVerticeActionPerformed
        jLabel4.setForeground(Color.black);
        jLabel5.setForeground(Color.black);    
        EditarVertice.setEnabled(true);
        EditarNovoVertice.setEnabled(true);
        btnConfVertice.setEnabled(true);
        btnEditarVertice.setEnabled(false);
    }//GEN-LAST:event_btnEditarVerticeActionPerformed

    private void btnDelVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelVerticeActionPerformed
        cbNo1.removeItem(txtVertice.getText());
        cbNo2.removeItem(txtVertice.getText());
        cbNo1Editar.removeItem(txtVertice.getText());
        cbNo2Editar.removeItem(txtVertice.getText());
        cbNoNovo.addItem(txtVertice.getText());
       
        display.setText(grafo.removerVertice(txtVertice.getText()));
    }//GEN-LAST:event_btnDelVerticeActionPerformed

    private void btnAddVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVerticeActionPerformed
        Vertice no = new Vertice();
        if (txtVertice.getText().equals("")) {
           display.setText("Selecione um nome para o Vértice ");
        } else {
            cbNo1.addItem(txtVertice.getText());
            cbNo2.addItem(txtVertice.getText());
            cbNoNovo.addItem(txtVertice.getText());
            cbNo1Editar.addItem(txtVertice.getText());
            cbNo2Editar.addItem(txtVertice.getText());

            no.setId(txtVertice.getText());
            grafo.addVertice(no);
        }
        txtVertice.setText("");
        ImprimeVertice();
    }//GEN-LAST:event_btnAddVerticeActionPerformed

    private void btnConfVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfVerticeActionPerformed
        cbNo1.removeItem(EditarVertice.getText());
        cbNo2.removeItem(EditarVertice.getText());
        cbNoNovo.removeItem(EditarVertice.getText());
        cbNo1.addItem(EditarNovoVertice.getText());
        cbNo2.addItem(EditarNovoVertice.getText());
        cbNoNovo.addItem(EditarNovoVertice.getText());
        display.setText(grafo.EditarVertice(grafo,EditarVertice.getText(),EditarNovoVertice.getText()));
        
        EditarVertice.setText("");
        EditarNovoVertice.setText("");
        btnEditarVertice.setEnabled(true);
        btnConfVertice.setEnabled(false);
        jLabel4.setForeground(Color.gray);
        jLabel5.setForeground(Color.gray);    
        EditarVertice.setEnabled(false);
        EditarNovoVertice.setEnabled(false);
    }//GEN-LAST:event_btnConfVerticeActionPerformed

    private void btnAdicionarVertice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVertice5ActionPerformed
       display.setText(grafo.removerAresta((String) cbNo1.getSelectedItem(), (String) cbNo2.getSelectedItem()));
    }//GEN-LAST:event_btnAdicionarVertice5ActionPerformed

    private void ListaAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaAdjacenciaActionPerformed
       display.setText("Lista Adjacência\n"+grafo.listaAdjacencia(grafo));
    }//GEN-LAST:event_ListaAdjacenciaActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroXML = new FileNameExtensionFilter("Arquivos XML", "xml");
        arquivo.addChoosableFileFilter(filtroXML);
        arquivo.setAcceptAllFileFilterUsed(false);
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            display.setText(arquivo.getSelectedFile().getAbsolutePath());
            choose = display.getText();
        }

        try {
             XStream xstream = new XStream(new DomDriver());
             String xml = null;
             
             xstream.omitField(Aresta.class, "node1");
             xstream.omitField(Aresta.class, "node2");
             xstream.omitField(Vertice.class, "grau");
             xstream.alias("graphml", Graphml.class);
             xstream.alias("graph", Grafo.class);
             xstream.alias("node", Vertice.class);
             xstream.alias("edge", Aresta.class);         
             xstream.useAttributeFor("source", String.class);
             xstream.useAttributeFor("target", String.class);
             xstream.useAttributeFor("distancia", String.class);
             xstream.useAttributeFor("visitado", String.class);
             xstream.useAttributeFor("weight", String.class);
             xstream.useAttributeFor("xmlns", String.class);
             xstream.useAttributeFor("edgedefault", String.class);
             xstream.useAttributeFor("id", String.class);
             xstream.addImplicitArray(Grafo.class, "vertices");
             xstream.addImplicitArray(Grafo.class, "arestas");
        
            xml = xstream.toXML(graphml);
            System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + xml);
            File file = new File(choose + ".xml");
            PrintWriter print = new PrintWriter(file);
            print.write(xml);
            print.flush();
            print.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void abrirXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirXMLActionPerformed
        //ca = true;
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroXML = new FileNameExtensionFilter("Arquivos XML", "xml");
        arquivo.addChoosableFileFilter(filtroXML);
        arquivo.setAcceptAllFileFilterUsed(false);
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            display.setText(arquivo.getSelectedFile().getAbsolutePath());
            choose = display.getText();
            try {
                FileReader leitor = new FileReader(choose);
                XStream xstream = new XStream(new DomDriver());
             
                xstream.omitField(Aresta.class, "node1");
                xstream.omitField(Aresta.class, "node2");
                xstream.omitField(Vertice.class, "grau");
                xstream.alias("graph", Grafo.class);
                xstream.alias("node", Vertice.class);
                xstream.alias("edge", Aresta.class);
                xstream.alias("graphml", Graphml.class);
                xstream.useAttributeFor("source", String.class);
                xstream.useAttributeFor("target", String.class);
                xstream.useAttributeFor("distancia", String.class);
                xstream.useAttributeFor("visitado", String.class);
                xstream.useAttributeFor("weight", String.class);
                xstream.useAttributeFor("xmlns", String.class);
                xstream.useAttributeFor("edgedefault", String.class);
                xstream.useAttributeFor("id", String.class);
                xstream.addImplicitArray(Grafo.class, "vertices");
                xstream.addImplicitArray(Grafo.class, "arestas");
        
                graphml = null;
                graphml = (Graphml) xstream.fromXML(leitor);
                ArrayList lst = (ArrayList) graphml.getGraph().getListaArestas();
                graphml.getGraph().setListaVertices(new ArrayList<Vertice>());
                graphml.getGraph().setListaAresta(new ArrayList<Aresta>());
                for (Object e : lst) {
                    if (e instanceof Vertice) {
                        graphml.getGraph().getListaVertices().add((Vertice) e);
                    } else {
                        graphml.getGraph().getListaArestas().add((Aresta) e);
                    }
                }

                for (Aresta aresta : graphml.getGraph().getListaArestas()) {
                    for (Vertice no : graphml.getGraph().getListaVertices()) {
                        if (no.getId().equals(aresta.getSource())) {
                            aresta.setNode1(no);
                        }
                        if (no.getId().equals(aresta.getTarget())) {
                            aresta.setNode2(no);
                        }
                    }
                }
                listaVertice = (ArrayList<Vertice>) graphml.getGraph().getListaVertices();
                listaAresta = (ArrayList<Aresta>) graphml.getGraph().getListaArestas();
                grafo.setListaAresta(listaAresta);
                grafo.setListaVertices(listaVertice);
                
                String r ="",r2="";
                for(int i = 0; i < listaVertice.size();i++){
                    cbNo1.addItem(listaVertice.get(i).getId());
                    cbNo2.addItem(listaVertice.get(i).getId());
                    cbNoNovo.addItem(listaVertice.get(i).getId());
                    cbNo1Editar.addItem(listaVertice.get(i).getId());
                    cbNo2Editar.addItem(listaVertice.get(i).getId());
                    r+= "("+listaVertice.get(i).getId()+")";
                    if(i < listaVertice.size() - 1){
                        r+=",";
                    }
                }
                for(int i = 0; i < grafo.getListaArestas().size();i++){
                r2+= "("+grafo.getListaArestas().get(i).getNode1().getId()+","+grafo.getListaArestas().get(i).getNode2().getId()+")";
                    if(i < grafo.getListaArestas().size() - 1){
                        r2+=",";
                     }
                }
       display.setText("Vertice: { "+r+" }\nAresta: {"+r2+"}");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_abrirXMLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            grafo.setListaVertices(grafo.getListaVertices());
            grafo.setListaAresta(grafo.getListaArestas());
            display.setText(""+(grafo.geraGrafico(grafo)));

            for(int i=0; i< grafo.getListaArestas().size();i++){
                try {
                    Process p;
                    File arquivo = new File("src\\os\\dot\\fileS.dot");
                    try (FileWriter fw = new FileWriter(arquivo)) {

                        fw.write(""+grafo.geraGrafico(grafo));

                        fw.flush();
                    } catch (IOException ex) {
                        System.out.println("Erro ao Criar Arquivo: " + ex.getMessage());
                    }

                    String commandLine = "dot -Tpng " + arquivo.getCanonicalPath() + " -o src\\os\\img\\fileS.png";

                    p = Runtime.getRuntime().exec(commandLine);
                    while (p.isAlive()) {
                    }

                    File arqImg = new File("src\\os\\img\\fileS.png");
                    ImageIcon image = new ImageIcon(arqImg.getCanonicalPath());
                    image.getImage().flush();
                    jLabel1.setIcon(image);
                    jLabel1.setText("");

                } catch (IOException ex) {
                    System.out.println("Erro do Executar Comando: " + ex.getMessage());
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MatrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizAdjacenciaActionPerformed
        display.setText("Matriz Adjacência\n\n"+grafo.matrizAdjacencia(grafo));
    }//GEN-LAST:event_MatrizAdjacenciaActionPerformed

    private void MatrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizIncidenciaActionPerformed
        display.setText("Matriz Incidência\n\n"+grafo.matrizIncidencia(grafo));
    }//GEN-LAST:event_MatrizIncidenciaActionPerformed

    private void ConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConjuntoActionPerformed
        display.setText("Conjunto\n\n"+grafo.conjunto(grafo));
    }//GEN-LAST:event_ConjuntoActionPerformed

    private void incidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incidenteActionPerformed
        display.setText("Ordem do Grafo é: "+listaVertice.size());
    }//GEN-LAST:event_incidenteActionPerformed

    private void btnGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrauActionPerformed
       display.setText(grafo.getGrau(grafo));
    }//GEN-LAST:event_btnGrauActionPerformed

    private void btnIncidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidentesActionPerformed
        display.setText(grafo.getIncidentes());
    }//GEN-LAST:event_btnIncidentesActionPerformed

    private void btnAdjacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjacentesActionPerformed
        display.setText(grafo.getAdjacentes());
    }//GEN-LAST:event_btnAdjacentesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarArestaActionPerformed
        jLabel7.setForeground(Color.black);
        jLabel8.setForeground(Color.black);
        jLabel9.setForeground(Color.black); 
        jLabel10.setForeground(Color.black); 
        
        cbNo1Editar.setEnabled(true);
        cbNo2Editar.setEnabled(true);
        cbNoNovo.setEnabled(true);
        NovoPeso.setEnabled(true);
        btnConfAresta.setEnabled(true);
        btnEditarAresta.setEnabled(false);
    }//GEN-LAST:event_btnEditarArestaActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
         String r="\nVertice\n{";
        for(int i = 0; i < listaVertice.size();i++){
           r+= "("+listaVertice.get(i).getId()+")";
           if(i < listaVertice.size() - 1){
               r+=",";
           }
        }
        r+="}\n\nAresta\n{";
        for(int i = 0; i < listaAresta.size();i++){
           r+= "("+listaAresta.get(i).getNode1().getId()+","+listaAresta.get(i).getNode2().getId()+")";
           if(i < listaAresta.size() - 1){
               r+=",";
           }
        }
        r+="}\n\nGrau do vertice\n";
        for (Vertice no : listaVertice) {
                r += grafo.getGrau(grafo);
            }
        grafo.setListaVertices(listaVertice);
        grafo.setListaAresta(listaAresta);
        
        r+="\n\nMatriz Adjacente\n"+(grafo.matrizAdjacencia(grafo));
        r+="\n\nMatriz Incidência\n"+(grafo.matrizIncidencia(grafo));
        r+="\n\nLista Adjacência\n"+(grafo.listaAdjacencia(grafo));
        r+="\n\nConjunto\n"+(grafo.conjunto(grafo));
        display.setText("Informação\n"+r);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        grafo.getListaVertices().clear();
        grafo.getListaArestas().clear();
        cbNo1.removeAllItems();
        cbNo2.removeAllItems();
        cbNoNovo.removeAllItems();
        cbNo1Editar.removeAllItems();
        cbNo2Editar.removeAllItems();
    }//GEN-LAST:event_btnLimparActionPerformed
public void ImprimeVertice(){
        String r="";
      
            for(int i = 0; i < grafo.getListaVertices().size();i++){
                r+= "("+grafo.getListaVertices().get(i).getId()+")";
                if(i < grafo.getListaVertices().size() - 1){
                    r+=",";
                }
             }
       display.setText("Vertice: { "+r+" }");
       
    }
    public void ImprimeAresta(){
         String r="";
             for(int i = 0; i < grafo.getListaArestas().size();i++){
                r+= "("+grafo.getListaArestas().get(i).getNode1().getId()+","+grafo.getListaArestas().get(i).getNode2().getId()+
                        ","+grafo.getListaArestas().get(i).getPeso()+")";
                if(i < grafo.getListaArestas().size() - 1){
                    r+=",";
                }
             }
       display.setText("Aresta: { "+r+" }");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Conjunto;
    private javax.swing.JTextField EditarNovoVertice;
    private javax.swing.JTextField EditarVertice;
    private javax.swing.JButton ListaAdjacencia;
    private javax.swing.JButton MatrizAdjacencia;
    private javax.swing.JButton MatrizIncidencia;
    private javax.swing.JTextField NovoPeso;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton abrirXML;
    private javax.swing.JButton btnAddVertice;
    private javax.swing.JButton btnAdicionarVertice3;
    private javax.swing.JButton btnAdicionarVertice5;
    private javax.swing.JButton btnAdjacentes;
    private javax.swing.JButton btnConfAresta;
    private javax.swing.JButton btnConfVertice;
    private javax.swing.JButton btnDelVertice;
    private javax.swing.JButton btnEditarAresta;
    private javax.swing.JButton btnEditarVertice;
    private javax.swing.JButton btnGrau;
    private javax.swing.JButton btnIncidentes;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbNo1;
    private javax.swing.JComboBox<String> cbNo1Editar;
    private javax.swing.JComboBox<String> cbNo2;
    private javax.swing.JComboBox<String> cbNo2Editar;
    private javax.swing.JComboBox<String> cbNoNovo;
    private javax.swing.JTextArea display;
    private javax.swing.JButton incidente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField txtVertice;
    // End of variables declaration//GEN-END:variables
}
