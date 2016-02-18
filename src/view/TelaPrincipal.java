package view;

import controller.DBController;
import dao.ResultSetTableModel;

import controller.MesaController;
import controller.PedidoController;
import controller.ProdutoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.BaseDados;
import model.PizzasEnum;

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

    
    public TelaPrincipal() throws SQLException {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        radGroupBaseDeDados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMesas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        try{
            tabelaMesas = new javax.swing.JTable(new ResultSetTableModel("SELECT Mesa,Ocupado FROM Mesas"));
            jPanel3 = new javax.swing.JPanel();
            lblDescricaoMesa = new javax.swing.JLabel();
            btnFechaComanda = new javax.swing.JToggleButton();
            jPanel5 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            txtHorarioEntrada = new javax.swing.JTextField();
            btnAbreMesa = new javax.swing.JToggleButton();
            btnAbreMesa1 = new javax.swing.JToggleButton();
            jScrollPane4 = new javax.swing.JScrollPane();
            tabelaPedidosMesa = new javax.swing.JTable();
            jPanel4 = new javax.swing.JPanel();
            lblProdutos = new javax.swing.JLabel();
            btnAdicionaPedido = new javax.swing.JButton();
            lblQtde = new javax.swing.JLabel();
            spnQtdeDeItens = new javax.swing.JSpinner();
            lblProdutos1 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            tabelaExtras = new javax.swing.JTable();
            jScrollPane3 = new javax.swing.JScrollPane();
            tabelaPizzas = new javax.swing.JTable(new ResultSetTableModel("SELECT Pizza, P, M, G FROM Pizzas"));
            jMenuBar1 = new javax.swing.JMenuBar();
            menOpcoes = new javax.swing.JMenu();
            mitemAdicionaMesa = new javax.swing.JMenuItem();
            mitemRemoveMesa = new javax.swing.JMenuItem();
            jSeparator1 = new javax.swing.JPopupMenu.Separator();
            mitemAdicionaProduto = new javax.swing.JMenuItem();
            mItemRemoveProduto = new javax.swing.JMenuItem();
            jSeparator2 = new javax.swing.JPopupMenu.Separator();
            mItemSair = new javax.swing.JMenuItem();
            menEditar = new javax.swing.JMenu();
            mitemEditaProduto = new javax.swing.JMenuItem();
            jMenu5 = new javax.swing.JMenu();
            radArquivo = new javax.swing.JRadioButtonMenuItem();
            radSerial = new javax.swing.JRadioButtonMenuItem();
            radJDBC = new javax.swing.JRadioButtonMenuItem();
            menAjuda = new javax.swing.JMenu();
            mitemInstrucoes = new javax.swing.JMenuItem();
            mitemSobre = new javax.swing.JMenuItem();

            jMenu1.setText("jMenu1");

            jMenu2.setText("jMenu2");

            jMenu3.setText("File");
            jMenuBar2.add(jMenu3);

            jMenu4.setText("Edit");
            jMenuBar2.add(jMenu4);

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

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        tabelaMesas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        try{
            tabelaMesas.setModel(new ResultSetTableModel("SELECT Mesa,Ocupado FROM Mesas"));
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        tabelaMesas.setRowHeight(20);
        tabelaMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMesas);
        //tabelaMesas = new javax.swing.JTable();

        //tabelaMesas.setModel(new ResultSetTableModel("SELECT Mesa,Ocupado FROM Mesas"));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        try{
            tabelaPedidosMesa.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            tabelaPedidosMesa.setModel(new ResultSetTableModel("SELECT Nome,Descricao,Qtde,Valor FROM Pedidos WHERE Mesa = '" + getMesaSelecionda() + "'"));
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        jScrollPane4.setViewportView(tabelaPedidosMesa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbreMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbreMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel4.setBackground(new java.awt.Color(136, 0, 6));
        jPanel4.setPreferredSize(new java.awt.Dimension(1260, 766));

        lblProdutos.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("PIZZAS");

        btnAdicionaPedido.setBackground(new java.awt.Color(192, 57, 42));
        btnAdicionaPedido.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAdicionaPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionaPedido.setText("Adicionar Pedido");
        btnAdicionaPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAdicionaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerAdicionaPedido(evt);
            }
        });

        lblQtde.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblQtde.setForeground(new java.awt.Color(255, 255, 255));
        lblQtde.setText("Qtde");

        spnQtdeDeItens.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N

        lblProdutos1.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblProdutos1.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos1.setText("EXTRAS");

        try{
            tabelaExtras.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            tabelaExtras.setModel(new ResultSetTableModel("SELECT Produto, Descricao, Valor FROM Extras"));
            tabelaExtras.setRowHeight(20);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        tabelaExtras.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaExtrasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelaExtras.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                tabelaPizzas.getSelectionModel().clearSelection();
            }
        });
        jScrollPane2.setViewportView(tabelaExtras);

        try{
            tabelaPizzas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            tabelaPizzas.setModel(new ResultSetTableModel("SELECT Pizza, P, M, G FROM Pizzas"));
            tabelaPizzas.setRowHeight(20);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        jScrollPane3.setViewportView(tabelaPizzas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(761, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtde)
                    .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1251, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(16, Short.MAX_VALUE))
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

        mItemRemoveProduto.setText("Remover Produto");
        mItemRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemRemoveProdutoActionPerformed(evt);
            }
        });
        menOpcoes.add(mItemRemoveProduto);
        menOpcoes.add(jSeparator2);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        menOpcoes.add(mItemSair);

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

        jMenu5.setText("Base de Dados");

        radGroupBaseDeDados.add(radArquivo);
        radArquivo.setText("Arquivo");
        radArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radArquivoActionPerformed(evt);
            }
        });
        jMenu5.add(radArquivo);

        radGroupBaseDeDados.add(radSerial);
        radSerial.setText("Serial");
        radSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSerialActionPerformed(evt);
            }
        });
        jMenu5.add(radSerial);

        radGroupBaseDeDados.add(radJDBC);
        radJDBC.setSelected(true);
        radJDBC.setText("JDBC");
        radJDBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radJDBCActionPerformed(evt);
            }
        });
        jMenu5.add(radJDBC);

        jMenuBar1.add(jMenu5);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabelaPizzas(){
        BaseDados base = DBController.getBaseDados();
       switch(base){
            case Arquivo: break;

            case Serial: break;

            case JDBC: 
            {
                try {
                    tabelaPizzas.setModel(
                            new ResultSetTableModel(
                                    "SELECT Pizza,P,M,G FROM Pizzas"));

                    break;
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
            }
        }
    }
    
    public int getMesaSelecionda(){
        
        //caso não tenha nenhuma mesa selecionada exibir a mesa 1
        if(tabelaMesas.getSelectedRow()<0){
            return 1;
        }else{
            return tabelaMesas.getSelectedRow() + 1;
        }
    }
    
    public void atualizaTabelaPedidos(int mesaSelecionada) {
         BaseDados base = DBController.getBaseDados();
       switch(base){
            case Arquivo: break;

            case Serial: break;

            case JDBC: 
            {
                try {
                    tabelaPedidosMesa.setModel(
                            new ResultSetTableModel(
                                    "SELECT Nome, Descricao,Qtde, Valor FROM Pedidos "
                                            + "WHERE MESA='" + mesaSelecionada + "'"));
                    
                   
                    break;
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
            }
        }   
    }
    
    public void atualizaTabelaExtras(){
       BaseDados base = DBController.getBaseDados();
       switch(base){
            case Arquivo: break;

            case Serial: break;

            case JDBC: 
            {
                try {
                    tabelaExtras.setModel(
                            new ResultSetTableModel(
                                    "SELECT Produto, Descricao, Valor FROM Extras"));

                    break;
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
            }
        }
    }
    
    private void HandlerFechaComanda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerFechaComanda
        MesaController m = new MesaController();
        
        m.fechaComanda();
        
    }//GEN-LAST:event_HandlerFechaComanda

    private void HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerAdicionaPedido
        int tabelaPizzasLinhaSelecionada;
        int tabelaExtrasLinhaSelecionada;
        int mesaSelecionada;
        int qtde;
        
        mesaSelecionada  = tabelaMesas.getSelectedRow() +1;
        tabelaPizzasLinhaSelecionada = tabelaPizzas.getSelectedRow() +1;
        tabelaExtrasLinhaSelecionada = tabelaExtras.getSelectedRow() +1;
        qtde = (int) spnQtdeDeItens.getValue(); //captura a qtde de itens pedidos
        
        if(mesaSelecionada <= 0){
            JOptionPane.showMessageDialog(
                    null, "Selecione a mesa para realizar o pedido!","Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if(qtde <=0 ){
            JOptionPane.showMessageDialog(
                    null, "A quantidade de itens deve ser maior que 0!","Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        //caso tenha uma linha da tabela de pizzas selecionada
        else if(tabelaPizzasLinhaSelecionada>0){
           
            
            TelaTamanhoPizza tela = new TelaTamanhoPizza();
            
            //envia a informação da linha e da mesa selecionados
            //janela verifica qual o tamanho da pizza e inicia a construção
            //do pedido
            tela.setLinhaSelecionada(tabelaPizzasLinhaSelecionada);
            tela.setMesaSelecionada(mesaSelecionada);
            tela.setQtde(qtde);
            tela.setVisible(true);
            tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            
            
        }
        //caso tenha uma linha da tabela de extras selecionada
        else if(tabelaExtrasLinhaSelecionada>0){
            
            PedidoController pedido = new PedidoController();
            
            pedido.adicionaPedido(
                    tabelaExtrasLinhaSelecionada,mesaSelecionada,qtde);
            
            JOptionPane.showMessageDialog(
                    null, "Produto Adicionado!", "Novo Produto",
                    JOptionPane.INFORMATION_MESSAGE);
            
            atualizaTabelaPedidos(mesaSelecionada);
        }
        else{
            JOptionPane.showMessageDialog(
                    null, "Nenhum produto foi selecionado!","Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_HandlerAdicionaPedido

    private void mitemAdicionaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaMesaActionPerformed
            MesaController m = new MesaController();            
            m.adicionaMesa();
            
            atualizaTabelaMesas();
            
    }//GEN-LAST:event_mitemAdicionaMesaActionPerformed

    private void HandlerRemoveMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerRemoveMesa

            MesaController m = new MesaController();            
            m.removeMesa();
            
            atualizaTabelaMesas();

    }//GEN-LAST:event_HandlerRemoveMesa

    private void mitemAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaProdutoActionPerformed

            TelaAdicionaProduto tAddProduto = new TelaAdicionaProduto();
            tAddProduto.setVisible(true);
        
    }//GEN-LAST:event_mitemAdicionaProdutoActionPerformed

    private void txtHorarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioEntradaActionPerformed

    private void HandlerBtnCancelaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnCancelaPedido
        
        int mesa = 1;
        int pedido;
        int qtde = 0;
        
        
        //verificar a quantidade
        
        Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser cancelada: "));
        
        
        if(tabelaMesas.getSelectedRow()>=0 && tabelaPedidosMesa.getSelectedRow()>=0){
            
            pedido = tabelaPedidosMesa.getSelectedRow();
            MesaController m = new MesaController();        
            m.cancelaPedido(mesa,pedido,qtde);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "A mesa e o pedido devem estar selecionados!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
       
        
    }//GEN-LAST:event_HandlerBtnCancelaPedido

    private void mItemRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemRemoveProdutoActionPerformed
        
        int tabelaPizzasLinhaSelecionada;
        int tabelaExtrasLinhaSelecionada;
        
        tabelaPizzasLinhaSelecionada = tabelaPizzas.getSelectedRow() +1;
        tabelaExtrasLinhaSelecionada = tabelaExtras.getSelectedRow() +1;
        
        if(tabelaPizzasLinhaSelecionada>0){
           
            int op = JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?");
            
            if(op==0){  //caso confirme
                ProdutoController produto = new ProdutoController();
                
                produto.removePizza(tabelaPizzasLinhaSelecionada);
                
                //atualiza tabela
                BaseDados base = DBController.getBaseDados();
                switch(base){
                    case Arquivo: break;

                    case Serial: break;

                    case JDBC: 
                    {
                        try {
                            tabelaPizzas.setModel(
                                    new ResultSetTableModel("SELECT Pizza, P,M,G FROM Pizzas"));

                            break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                
            }
                      
            
        }
        //caso tenha uma linha da tabela de extras selecionada
        else if(tabelaExtrasLinhaSelecionada>0){
            
            int op = JOptionPane.showConfirmDialog(null, "Confirmar Exclusão?");
            
            if(op==0){  //caso confirme
                ProdutoController produto = new ProdutoController();
                
                produto.removeExtra(tabelaExtrasLinhaSelecionada);
                
                //atualiza tabela
                BaseDados base = DBController.getBaseDados();
                switch(base){
                    case Arquivo: break;

                    case Serial: break;

                    case JDBC: 
                    {
                        try {
                            tabelaExtras.setModel(new ResultSetTableModel(
                                "SELECT Produto, Descricao,Valor FROM Extras"));

                            break;
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(
                    null, "Nenhum produto foi selecionado!","Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mItemRemoveProdutoActionPerformed

    private void HandlerBtnAbreMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnAbreMesa
        int mesaSelecionada;
        
        mesaSelecionada  = tabelaMesas.getSelectedRow() +1;
        
        if(mesaSelecionada>0){
            MesaController m = new MesaController();         
            m.abreMesa(mesaSelecionada);
            
            atualizaTabelaMesas();
        }
        else{
            //caso nenhuma mesa esteja selecionada
            JOptionPane.showMessageDialog(
                    null, "Erro: Nenhuma mesa está selecionada!","Abrir Mesa",
                    JOptionPane.ERROR_MESSAGE);
        }
        
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

    private void tabelaExtrasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaExtrasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaExtrasAncestorAdded

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        //Encerra a aplicação
        System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void radArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radArquivoActionPerformed
        //Alterna a base de dados
        controller.DBController.setBaseDados(BaseDados.Arquivo);
        
        //criar código para alterar a visualização
    }//GEN-LAST:event_radArquivoActionPerformed

    private void radSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSerialActionPerformed
        //Alterna a base de dados
        controller.DBController.setBaseDados(BaseDados.Serial);
        
        //criar código para alterar a visualização
    }//GEN-LAST:event_radSerialActionPerformed

    private void radJDBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radJDBCActionPerformed
        try {
            //Alterna a base de dados
            controller.DBController.setBaseDados(BaseDados.JDBC);
            
            //altera visualização
            tabelaMesas.setModel(new ResultSetTableModel("SELECT Mesa,Ocupado FROM Mesas"));
            tabelaPizzas.setModel(new ResultSetTableModel("SELECT Pizza,P,M,G FROM Pizzas"));
            tabelaExtras.setModel(
                    new ResultSetTableModel("SELECT Produto,Descricao,Valor FROM Extras"));
            tabelaPedidosMesa.setModel(new ResultSetTableModel(
                    "SELECT Nome, Descricao, Qtde, Valor FROM Pedidos WHERE Mesa=1"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, 
                    "Erro ao alternar base de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_radJDBCActionPerformed

    private void tabelaMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMesasMouseClicked
        String entrada = "";
        //atualiza mesa de pedidos
        MesaController mesa = new MesaController();
        entrada = mesa.getHorarioEntrada(tabelaMesas.getSelectedRow() + 1);
        txtHorarioEntrada.setText(entrada);
        
        atualizaTabelaPedidos(tabelaMesas.getSelectedRow() + 1);
    }//GEN-LAST:event_tabelaMesasMouseClicked

    
    
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
    private javax.swing.JToggleButton btnAbreMesa;
    private javax.swing.JToggleButton btnAbreMesa1;
    private javax.swing.JButton btnAdicionaPedido;
    private javax.swing.JToggleButton btnFechaComanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblDescricaoMesa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblProdutos1;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JMenuItem mItemRemoveProduto;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenu menEditar;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem mitemAdicionaMesa;
    private javax.swing.JMenuItem mitemAdicionaProduto;
    private javax.swing.JMenuItem mitemEditaProduto;
    private javax.swing.JMenuItem mitemInstrucoes;
    private javax.swing.JMenuItem mitemRemoveMesa;
    private javax.swing.JMenuItem mitemSobre;
    private javax.swing.JRadioButtonMenuItem radArquivo;
    private javax.swing.ButtonGroup radGroupBaseDeDados;
    private javax.swing.JRadioButtonMenuItem radJDBC;
    private javax.swing.JRadioButtonMenuItem radSerial;
    private javax.swing.JSpinner spnQtdeDeItens;
    private javax.swing.JTable tabelaExtras;
    private javax.swing.JTable tabelaMesas;
    private javax.swing.JTable tabelaPedidosMesa;
    private javax.swing.JTable tabelaPizzas;
    private javax.swing.JTextField txtHorarioEntrada;
    // End of variables declaration//GEN-END:variables

    private void atualizaTabelaMesas() {
       BaseDados base = DBController.getBaseDados();
       switch(base){
            case Arquivo: break;

            case Serial: break;

            case JDBC: 
            {
                try {
                    tabelaMesas.setModel(
                            new ResultSetTableModel("SELECT Mesa, Ocupado FROM Mesas"));

                    break;
                } catch (SQLException ex) {
                        ex.printStackTrace();
                }
            }
        }
    }
    
    public class TelaAdicionaProduto extends javax.swing.JFrame {

    
    
    
    public TelaAdicionaProduto() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        radGroupTipo = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lblAdicionarProduto = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        radPizza = new javax.swing.JRadioButton();
        radExtras = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtValor3 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        radGroupTipo.add(radExtras);
        radGroupTipo.add(radPizza);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setText("Descrição:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel8.setText("Valor (R$):");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAdicionarProduto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblAdicionarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdicionarProduto.setText("ADICIONAR PRODUTO");

        lblTipo.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        radGroupTipo.add(radPizza);
        radPizza.setSelected(true);
        radPizza.setText("Pizza");
        radPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPizzaActionPerformed(evt);
            }
        });

        radGroupTipo.add(radExtras);
        radExtras.setText("Extras");
        radExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radExtrasActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblValor2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblValor2.setText("M (R$):");

        lblValor3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblValor3.setText("G (R$):");

        lblValor1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblValor1.setText("P (R$):");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radPizza)
                .addGap(18, 18, 18)
                .addComponent(radExtras)
                .addGap(95, 95, 95))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor1)
                            .addComponent(lblNome)
                            .addComponent(lblValor2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdicionarProduto)
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radPizza)
                    .addComponent(radExtras))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor2)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor3)
                    .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    
    private void radPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Exibe a ultima label
        lblValor1.setText("P (R$):");
        lblValor2.setText("M (R$):");
        lblValor3.setVisible(true);
        txtValor3.setVisible(true);
        
    }   
    

    private void radExtrasActionPerformed(java.awt.event.ActionEvent evt) {                                          
        lblValor1.setText("Descrição:");
        lblValor2.setText("Valor (R$):");
        lblValor3.setVisible(false);
        txtValor3.setVisible(false);
    }                                         

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //fecha a janela
        dispose();
    }                                           

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //verifica qual o tipo de produto
        if(radPizza.isSelected()){
            //criar pizza
            ProdutoController prodController = new ProdutoController();
            
            //aciona o controlador para criar o produto
            prodController.criaProduto(
                    txtNome.getText(),
                    Double.parseDouble(txtValor1.getText()),
                    Double.parseDouble(txtValor2.getText()),
                    Double.parseDouble(txtValor3.getText()));
            atualizaTabelaPizzas();
        }
        else{
            //criar extra
            ProdutoController prodController = new ProdutoController();
            
            //aciona o controlador para criar o produto
            prodController.criaProduto(
                    txtNome.getText(),
                    txtValor1.getText(),                     //descricao
                    Double.parseDouble(txtValor2.getText())  //valor
                    );
            
            atualizaTabelaExtras();
        }
        
    }                                            

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblAdicionarProduto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValor3;
    private javax.swing.JRadioButton radExtras;
    private javax.swing.ButtonGroup radGroupTipo;
    private javax.swing.JRadioButton radPizza;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValor3;
    // End of variables declaration                   

}
    
    public class TelaTamanhoPizza extends javax.swing.JFrame {

    /**
     * Creates new form TelaTamanhoPizza
     */
    private int linhaSelecionada;
    private int mesaSelecionada;
    private int qtde;

    
    
    public TelaTamanhoPizza() {
        initComponents();
    }
    
    public void setLinhaSelecionada(int linhaSelecionada) {
        this.linhaSelecionada = linhaSelecionada;
    }

    public void setMesaSelecionada(int mesaSelecionada) {
        this.mesaSelecionada = mesaSelecionada;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        radGroupTamanhoPizza = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblTamanhoPizza = new javax.swing.JLabel();
        radPequena = new javax.swing.JRadioButton();
        radMedia = new javax.swing.JRadioButton();
        radGrande = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        //adiciona os 3 botões ao grupo
        radGroupTamanhoPizza.add(radPequena);
        radGroupTamanhoPizza.add(radMedia);
        radGroupTamanhoPizza.add(radGrande);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 51));
        setPreferredSize(new java.awt.Dimension(300, 200));

        lblTamanhoPizza.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblTamanhoPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTamanhoPizza.setText("Qual o Tamanho da Pizza?");

        radGroupTamanhoPizza.add(radPequena);
        radPequena.setSelected(true);
        radPequena.setText("Pequena");
        radPequena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPequenaActionPerformed(evt);
            }
        });

        radGroupTamanhoPizza.add(radMedia);
        radMedia.setText("Media");
        radMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMediaActionPerformed(evt);
            }
        });

        radGroupTamanhoPizza.add(radGrande);
        radGrande.setText("Grande");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTamanhoPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radPequena)
                                .addGap(18, 18, 18)
                                .addComponent(radMedia)
                                .addGap(18, 18, 18)
                                .addComponent(radGrande)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTamanhoPizza)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radPequena)
                    .addComponent(radMedia)
                    .addComponent(radGrande))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void radPequenaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void radMediaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int tamPizza = 1;
        //verifica qual botão está selecionado
        if(radPequena.isSelected()){
            tamPizza = PizzasEnum.P.getValor;
        }
        else if(radMedia.isSelected()){
            tamPizza = PizzasEnum.M.getValor;
        }
        else{
            tamPizza = PizzasEnum.G.getValor;
        }
        
        PedidoController pedido = new PedidoController();          
        //chama o controlador pra fazer o pedido    
        pedido.adicionaPedido(
                linhaSelecionada,mesaSelecionada, tamPizza, qtde);
        
        atualizaTabelaPedidos(mesaSelecionada);
        dispose();
        
    }                                            

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTamanhoPizza;
    private javax.swing.JRadioButton radGrande;
    private javax.swing.ButtonGroup radGroupTamanhoPizza;
    private javax.swing.JRadioButton radMedia;
    private javax.swing.JRadioButton radPequena;
    // End of variables declaration                   

        
    }


}
