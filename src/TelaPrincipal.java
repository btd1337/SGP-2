
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
    
    
    
    public TelaPrincipal() {
        initComponents();
        
        mesas = new ArrayList();
        pedidos = new ArrayList();
        produtos = new ArrayList();
        
        //Inicializa 10 Mesas
        for(int i=0; i<10; i++){
            Mesa novaMesa = new Mesa();
        
        DefaultListModel<Mesa> mesas;
        mesas = (DefaultListModel<Mesa>)lstMesas.getModel();        
        mesas.addElement(novaMesa);
        }
        
        //Inicializa Produtos
        Produto p = new Produto("Pizza Americana",26.0);                      
        //adiciona a JList de produtos
        DefaultListModel<Produto> dlmProdutos;
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p);
        
        Produto p1 = new Produto("Pizza de Atum",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p1);
                
        Produto p2 = new Produto("Pizza de Bacon",27.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p2);
        
        
        Produto p3 = new Produto("Pizza de Calabresa",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p3);
        
        
        Produto p4 = new Produto("Pizza de Catupiry",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p4);
        
        
        Produto p5 = new Produto("Pizza de Frango",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p5);
        
        
        Produto p6 = new Produto("Pizza de Lombo",26.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p6);
        
        
        Produto p7 = new Produto("Pizza de Mussarela",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p7);
        
        
        Produto p8 = new Produto("Pizza Paulista",27.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p8);
        
        
        Produto p9 = new Produto("Pizza Portuguesa",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p9);
        
        
        Produto p10 = new Produto("Coca Cola 2L",5.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p10);
        
        
        Produto p11 = new Produto("Coca Cola 500mL",3.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p11);
        
        
        Produto p12 = new Produto("Agua Mineral 300mL",2.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p12);
        
        
        Produto p13 = new Produto("Brahma",4.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p13);
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
        lstMesas = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        lblDescricaoMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDescricaoMesa = new javax.swing.JList();
        btnFechaComanda = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHorarioEntrada = new javax.swing.JTextField();
        btnAbreMesa = new javax.swing.JToggleButton();
        btnAbreMesa1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProdutos = new javax.swing.JList();
        btnAdicionaItem1 = new javax.swing.JButton();
        lblQtde = new javax.swing.JLabel();
        spnQtdeDeItens = new javax.swing.JSpinner();
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

        lstMesas.setBackground(new java.awt.Color(255, 255, 255));
        lstMesas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstMesas.setForeground(new java.awt.Color(51, 51, 51));
        lstMesas.setModel(new DefaultListModel<Mesa>());
        lstMesas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMesas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMesasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMesas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(135, 0, 6));

        lblDescricaoMesa.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblDescricaoMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricaoMesa.setText("DESCRIÇÃO DA MESA");

        lstDescricaoMesa.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstDescricaoMesa.setModel(new DefaultListModel<Pedido>());
        lstDescricaoMesa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstDescricaoMesa);

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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnAbreMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAbreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFechaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        lblProdutos.setText("PRODUTOS");

        lstProdutos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstProdutos.setModel(new DefaultListModel<Produto>());
        lstProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstProdutos);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btnAdicionaItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(88, 88, 88)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HandlerFechaComanda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerFechaComanda
        Mesa mesa = (Mesa) lstMesas.getSelectedValue();
        
        mesa.fecharComanda();
        
        txtHorarioEntrada.setText("");
        
        /*DefaultListModel<Mesa> listaDeMesas;
        listaDeMesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        
        //mesaAtual.getElementAt(lstMesas.getSelectedIndex()).abrirMesa();
        
        
        
        JOptionPane.showMessageDialog(null,
                listaDeMesas.getElementAt(lstMesas.getSelectedIndex()).fecharComanda(),
                "Comanda", JOptionPane.INFORMATION_MESSAGE);
        */
    }//GEN-LAST:event_HandlerFechaComanda

    private void HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerAdicionaPedido
        int index = lstProdutos.getSelectedIndex();
        
        if((Integer)spnQtdeDeItens.getValue()>0){
            Pedido pedido = new Pedido((Produto) lstProdutos.getModel().getElementAt(index),
                    (Integer)spnQtdeDeItens.getValue());    

            //adiciona ao array list da mesa
            Mesa mesaAtual = new Mesa(1);   //Não acrescentar nova mesa
            mesaAtual = (Mesa) lstMesas.getSelectedValue();

            //Verifica se a Mesa Atual ainda não foi aberta
            if(!mesaAtual.isOcupacaoMesa()){
                mesaAtual.abrirMesa();                 
            }        

            mesaAtual.acrescentarPedido(pedido);        

            //Atualiza o DefaultListModel da Mesa Atual
            lstDescricaoMesa.setModel(mesaAtual.getDlmPedidos());
            txtHorarioEntrada.setText(mesaAtual.getHorarioEntrada());
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Quantidade do pedido deve ser maior do que 1",
                    "Erro no Pedido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_HandlerAdicionaPedido

    private void mitemAdicionaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaMesaActionPerformed
        Mesa novaMesa = new Mesa();
        
        DefaultListModel<Mesa> mesas;
        mesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        
        mesas.addElement(novaMesa);        
        
    }//GEN-LAST:event_mitemAdicionaMesaActionPerformed

    private void HandlerRemoveMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerRemoveMesa
        DefaultListModel<Mesa> listaMesas;
        listaMesas = (DefaultListModel<Mesa>) lstMesas.getModel();
        listaMesas.remove(listaMesas.getSize()-1);
    }//GEN-LAST:event_HandlerRemoveMesa

    private void mitemAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaProdutoActionPerformed
        TelaAddProduto tAddProduto = new TelaAddProduto();    
        tAddProduto.setVisible(true);       
        
        
    }//GEN-LAST:event_mitemAdicionaProdutoActionPerformed

    private void txtHorarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioEntradaActionPerformed

    private void lstMesasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMesasValueChanged
        int index = lstMesas.getSelectedIndex();
        
        DefaultListModel<Mesa> listaDeMesas;
        listaDeMesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        
        
        txtHorarioEntrada.setText((String)listaDeMesas.getElementAt(index).getHorarioEntrada());
        lstDescricaoMesa.setModel(listaDeMesas.getElementAt(index).getDlmPedidos());
    }//GEN-LAST:event_lstMesasValueChanged

    private void HandlerBtnCancelaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnCancelaPedido
        DefaultListModel<Pedido> listaDePedidos;
        listaDePedidos = (DefaultListModel<Pedido>) lstDescricaoMesa.getModel();
        
        //verifica se o pedido tem mais de 1 item
        int qtdeDisponivel = listaDePedidos.getElementAt(
                lstDescricaoMesa.getSelectedIndex()).getQtdeDoProduto();

        if(qtdeDisponivel > 1){   //Verifica se tem mais de 1 item para remover
            int numItensRemover;   //quantidade que será removida
            numItensRemover = Integer.parseInt(
                    JOptionPane.showInputDialog("Quantidade a ser cancelada"));
            
            //verifica se não foi passado número superior a qtde já pedida
            if(numItensRemover>qtdeDisponivel){
                JOptionPane.showMessageDialog(
                        null, "Quantidade Para Cancelamento é Superior ao Pedido",
                        "Erro no Cancelamento de Pedido", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(numItensRemover == qtdeDisponivel){//verifica se vai zerar
                    listaDePedidos.remove(lstDescricaoMesa.getSelectedIndex());
                }
                else{
                    listaDePedidos.getElementAt(
                            lstDescricaoMesa.getSelectedIndex()).cancelarItem(numItensRemover);
                    lstDescricaoMesa.setModel(listaDePedidos);  //atualiza
                }
            }
        }
        else{       
            listaDePedidos.remove(lstDescricaoMesa.getSelectedIndex());
        }
        
    }//GEN-LAST:event_HandlerBtnCancelaPedido

    private void HandlerRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerRemoveProdutoActionPerformed
        DefaultListModel<Produto> listaDeProdutos;
        listaDeProdutos = (DefaultListModel<Produto>) lstProdutos.getModel();
        listaDeProdutos.remove(lstProdutos.getSelectedIndex());
    }//GEN-LAST:event_HandlerRemoveProdutoActionPerformed

    private void HandlerBtnAbreMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnAbreMesa
         int index = lstMesas.getSelectedIndex();
        
        DefaultListModel<Mesa> listaDeMesas;
        listaDeMesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        
        listaDeMesas.getElementAt(index).abrirMesa();
        txtHorarioEntrada.setText((String)listaDeMesas.getElementAt(index).getHorarioEntrada());
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
                new TelaPrincipal().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDescricaoMesa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JList lstDescricaoMesa;
    private javax.swing.JList lstMesas;
    private javax.swing.JList lstProdutos;
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
                
                if("".equals(txtNomeProduto.getText())){
                    JOptionPane.showMessageDialog(null,
                            "O nome do produto não pode estar vázio",
                                "Erro",JOptionPane.ERROR_MESSAGE);               
                }
                else{                                       
                    
                    try {
                        //verifica se valor da caixa de texto é um número
                        double valor = Double.parseDouble(
                                txtValorProduto.getText());
                        //cria produto que será adicionado
                        Produto p = new Produto(
                            txtNomeProduto.getText(),
                            valor);                        
                        
                        //adiciona a JList de produtos
                        DefaultListModel<Produto> produtos;
                        produtos = (DefaultListModel<Produto>)lstProdutos.getModel();
                        produtos.addElement(p);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,"Valor inválido!",
                                "Erro",JOptionPane.ERROR_MESSAGE);
                    }                  
                    

                    txtNomeProduto.setText("");
                    txtValorProduto.setText("");
                }
            }
            
        }
    }
}
