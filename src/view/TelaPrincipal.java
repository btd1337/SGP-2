package view;

import dao.ResultSetTableModel;

import controller.MesaController;
import model.Produto;
import model.Pedido;
import model.Mesa;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author btd
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ArrayList<Mesa> mesas;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Produto> produtos;
    private DefaultListModel<Mesa> modeloMesa;
    private DefaultListModel<Pedido> modeloPedido;
    private DefaultListModel<Produto> modeloProduto;
    private ResultSetTableModel tabelaMesas;
    
    
    
    public TelaPrincipal() throws SQLException {
        initComponents();
        
        mesas = new ArrayList();
        pedidos = new ArrayList();
        produtos = new ArrayList();
        
        tabelaMesas = new ResultSetTableModel("SELECT id, ocupacao FROM Mesas");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMesas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblDescricaoMesa = new javax.swing.JLabel();
        btnFechaComanda = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHorarioEntrada = new javax.swing.JTextField();
        btnAbreMesa = new javax.swing.JToggleButton();
        btnAbreMesa1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        btnAdicionaItem1 = new javax.swing.JButton();
        lblQtde = new javax.swing.JLabel();
        spnQtdeDeItens = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menOpcoes = new javax.swing.JMenu();
        mitemAdicionaMesa = new javax.swing.JMenuItem();
        mitemRemoveMesa = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitemAdicionaProduto = new javax.swing.JMenuItem();
        HandlerRemoveProduto = new javax.swing.JMenuItem();
        menEditar = new javax.swing.JMenu();
        mitemEditaProduto = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        mitemInstrucoes = new javax.swing.JMenuItem();
        mitemSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 0, 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(135, 0, 6));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N

        lblMesas.setFont(new java.awt.Font("Open Sans Semibold", 0, 24)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(255, 255, 255));
        lblMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesas.setText("MESAS");
        lblMesas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        try{
            jTable1.setModel(new ResultSetTableModel("SELECT id, ocupacao FROM Mesas"));
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMesas, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMesas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(135, 0, 6));

        lblDescricaoMesa.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblDescricaoMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricaoMesa.setText("DESCRIÇÃO DA MESA");

        btnFechaComanda.setBackground(new java.awt.Color(192, 57, 42));
        btnFechaComanda.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnFechaComanda.setForeground(new java.awt.Color(255, 255, 255));
        btnFechaComanda.setText("Fechar Comanda");
        btnFechaComanda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnFechaComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerFechaComanda(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Horário de Entrada:");

        txtHorarioEntrada.setEditable(false);
        txtHorarioEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txtHorarioEntrada.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtHorarioEntrada.setForeground(new java.awt.Color(0, 0, 0));
        txtHorarioEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbreMesa.setBackground(new java.awt.Color(192, 57, 42));
        btnAbreMesa.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAbreMesa.setForeground(new java.awt.Color(255, 255, 255));
        btnAbreMesa.setText("Cancelar Pedido");
        btnAbreMesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAbreMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerBtnCancelaPedido(evt);
            }
        });

        btnAbreMesa1.setBackground(new java.awt.Color(192, 57, 42));
        btnAbreMesa1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAbreMesa1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbreMesa1.setText("Abrir Mesa");
        btnAbreMesa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAbreMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerBtnAbreMesa(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAbreMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFechaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbreMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(136, 0, 6));

        lblProdutos.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("PIZZAS");

        btnAdicionaItem1.setBackground(new java.awt.Color(192, 57, 42));
        btnAdicionaItem1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAdicionaItem1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionaItem1.setText("Adicionar Item");
        btnAdicionaItem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAdicionaItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerAdicionaPedido(evt);
            }
        });

        lblQtde.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblQtde.setForeground(new java.awt.Color(255, 255, 255));
        lblQtde.setText("Qtde");

        spnQtdeDeItens.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N

        try{
            jTable3.setModel(new ResultSetTableModel("SELECT nome,P,M,G FROM Pizzas"));
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(btnAdicionaItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtde)
                    .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionaItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menOpcoes.setText("Opções");

        mitemAdicionaMesa.setText("Adicionar Mesa");
        mitemAdicionaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemAdicionaMesaActionPerformed(evt);
            }
        });
        menOpcoes.add(mitemAdicionaMesa);

        mitemRemoveMesa.setText("Remover Mesa");
        mitemRemoveMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerRemoveMesa(evt);
            }
        });
        menOpcoes.add(mitemRemoveMesa);
        menOpcoes.add(jSeparator1);

        mitemAdicionaProduto.setText("Adicionar Produto");
        mitemAdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemAdicionaProdutoActionPerformed(evt);
            }
        });
        menOpcoes.add(mitemAdicionaProduto);

        HandlerRemoveProduto.setText("Remover Produto");
        HandlerRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerRemoveProdutoActionPerformed(evt);
            }
        });
        menOpcoes.add(HandlerRemoveProduto);

        jMenuBar1.add(menOpcoes);

        menEditar.setText("Editar");

        mitemEditaProduto.setText("Editar Produto");
        mitemEditaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerEditaItem(evt);
            }
        });
        menEditar.add(mitemEditaProduto);

        jMenuBar1.add(menEditar);

        menAjuda.setText("Ajuda");

        mitemInstrucoes.setText("Instruções");
        mitemInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerMItemInstrucoes(evt);
            }
        });
        menAjuda.add(mitemInstrucoes);

        mitemSobre.setText("Sobre");
        mitemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerMItemSobre(evt);
            }
        });
        menAjuda.add(mitemSobre);

        jMenuBar1.add(menAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HandlerFechaComanda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerFechaComanda
        MesaController m = new MesaController();
        
        m.fechaComanda();
        
    }//GEN-LAST:event_HandlerFechaComanda

    private void HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerAdicionaPedido
        MesaController m = new MesaController();
        
        m.adicionaPedido();
    }//GEN-LAST:event_HandlerAdicionaPedido

    private void mitemAdicionaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaMesaActionPerformed
        MesaController m = new MesaController();
        
        m.adicionaMesa();
        
    }//GEN-LAST:event_mitemAdicionaMesaActionPerformed

    private void HandlerRemoveMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerRemoveMesa
        MesaController m = new MesaController();
        
        m.removeMesa();
    }//GEN-LAST:event_HandlerRemoveMesa

    private void mitemAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaProdutoActionPerformed
        TelaAddProduto tAddProduto = new TelaAddProduto();    
        tAddProduto.setVisible(true);       
        
        
    }//GEN-LAST:event_mitemAdicionaProdutoActionPerformed

    private void txtHorarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioEntradaActionPerformed

    private void HandlerBtnCancelaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnCancelaPedido
        MesaController m = new MesaController();
        
        m.cancelaPedido();
        
    }//GEN-LAST:event_HandlerBtnCancelaPedido

    private void HandlerRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerRemoveProdutoActionPerformed
        MesaController m = new MesaController();
        
        m.removeProduto();
    }//GEN-LAST:event_HandlerRemoveProdutoActionPerformed

    private void HandlerBtnAbreMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnAbreMesa
        int idMesa = 1;
        MesaController m = new MesaController();
         
        m.abreMesa(idMesa);
    }//GEN-LAST:event_HandlerBtnAbreMesa

    private void HandlerEditaItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerEditaItem
        JOptionPane.showMessageDialog(null, 
                "Função em Implementação!","Editar",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_HandlerEditaItem

    private void HandlerMItemSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerMItemSobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        sobre.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        sobre.setLocationRelativeTo(null);
    }//GEN-LAST:event_HandlerMItemSobre

    private void HandlerMItemInstrucoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerMItemInstrucoes
        JOptionPane.showMessageDialog(null, 
                "Função em Implementação!","Instruções",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_HandlerMItemInstrucoes

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem HandlerRemoveProduto;
    private javax.swing.JToggleButton btnAbreMesa;
    private javax.swing.JToggleButton btnAbreMesa1;
    private javax.swing.JButton btnAdicionaItem1;
    private javax.swing.JToggleButton btnFechaComanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDescricaoMesa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenu menEditar;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem mitemAdicionaMesa;
    private javax.swing.JMenuItem mitemAdicionaProduto;
    private javax.swing.JMenuItem mitemEditaProduto;
    private javax.swing.JMenuItem mitemInstrucoes;
    private javax.swing.JMenuItem mitemRemoveMesa;
    private javax.swing.JMenuItem mitemSobre;
    private javax.swing.JSpinner spnQtdeDeItens;
    private javax.swing.JTextField txtHorarioEntrada;
    // End of variables declaration//GEN-END:variables

    private class TelaAddProduto extends JFrame{
        
        private JLabel lblNomeProduto;
        private JLabel lblValorProduto;
        private JTextField txtNomeProduto;
        private JTextField txtValorProduto;
        private JButton btnLimpar;
        private JButton btnAdicionar;

        public TelaAddProduto() {
            super("Adicionar Produto");
            //alinhamento à direita
            setLayout(new FlowLayout(FlowLayout.TRAILING,5,15));
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setSize(315, 150); 
            setResizable(false);
            setLocationRelativeTo(null);
            
            
            lblNomeProduto = new JLabel("Nome do Produto");
            lblValorProduto = new JLabel("Valor(R$)");
            txtNomeProduto = new JTextField(15);
            txtValorProduto = new JTextField(15);
            btnLimpar = new JButton("Limpar");
            btnAdicionar = new JButton("Adicionar");
            
            add(lblNomeProduto);
            add(txtNomeProduto);
            add(lblValorProduto);
            add(txtValorProduto);
            add(btnLimpar);
            add(btnAdicionar);
            
            BtnLimparHandler btnLimparHandler = new BtnLimparHandler();
            btnLimpar.addActionListener(btnLimparHandler);
            
            BtnAdicionarHandler btnAdicionarHandler = new BtnAdicionarHandler();
            btnAdicionar.addActionListener(btnAdicionarHandler);
        }
        
        private class BtnLimparHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNomeProduto.setText("");
                txtValorProduto.setText("");
            }
            
        }
        
        private class BtnAdicionarHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
        }
    }
}
