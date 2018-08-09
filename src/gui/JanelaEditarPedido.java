/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author User
 */
public class JanelaEditarPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaNovoPedido
     */
    public JanelaEditarPedido() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboxEntregador = new javax.swing.JComboBox();
        btnConfirmar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboxPagamento = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Editar Pedido");
        setToolTipText("");

        jLabel1.setText("Nome do Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Produtos");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-editar-20.png"))); // NOI18N
        btnEditar.setText("Editar Cliente");

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbPedido);
        if (tbPedido.getColumnModel().getColumnCount() > 0) {
            tbPedido.getColumnModel().getColumn(0).setMinWidth(50);
            tbPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbPedido.getColumnModel().getColumn(0).setMaxWidth(50);
            tbPedido.getColumnModel().getColumn(1).setResizable(false);
            tbPedido.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-pesquisar-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");

        jLabel5.setText("Entregador");

        cboxEntregador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entregador1", "Entregado2" }));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-selecionado-50.png"))); // NOI18N
        btnConfirmar.setText("Confirmar Pedido");

        jLabel2.setText("Forma de Pagamento");

        cboxPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Observação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(cboxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(btnEditar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBuscar)
                                        .addComponent(txtObservacao, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                                    .addGap(49, 49, 49)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(btnConfirmar)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(cboxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(23, 23, 23))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cboxEntregador;
    private javax.swing.JComboBox cboxPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacao;
    // End of variables declaration//GEN-END:variables
}
