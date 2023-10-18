package proveMaxGrupo64.Vistas;

public class Consultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        this.setSize(750, 650);
        this.setTitle("Consultas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jlConsultas = new javax.swing.JLabel();
        jbProductosPorCompra = new javax.swing.JButton();
        jbProveedoresPorProducto = new javax.swing.JButton();
        jbComprasProveedor = new javax.swing.JButton();
        jbProductosMasComprados = new javax.swing.JButton();
        jbProductosMenorStock = new javax.swing.JButton();
        jbProductosCompra = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jlConsultas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlConsultas.setText("CONSULTAR");

        jbProductosPorCompra.setBackground(new java.awt.Color(0, 102, 204));
        jbProductosPorCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbProductosPorCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbProductosPorCompra.setText("Productos de una Compra");

        jbProveedoresPorProducto.setBackground(new java.awt.Color(0, 102, 204));
        jbProveedoresPorProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbProveedoresPorProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbProveedoresPorProducto.setText("Proveedores por Producto");

        jbComprasProveedor.setBackground(new java.awt.Color(0, 102, 204));
        jbComprasProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbComprasProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jbComprasProveedor.setText("Compras a un Proveedor");

        jbProductosMasComprados.setBackground(new java.awt.Color(0, 102, 204));
        jbProductosMasComprados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbProductosMasComprados.setForeground(new java.awt.Color(255, 255, 255));
        jbProductosMasComprados.setText("Productos Más Comprados");

        jbProductosMenorStock.setBackground(new java.awt.Color(0, 102, 204));
        jbProductosMenorStock.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbProductosMenorStock.setForeground(new java.awt.Color(255, 255, 255));
        jbProductosMenorStock.setText("Productos de Menor Stock");

        jbProductosCompra.setBackground(new java.awt.Color(0, 102, 204));
        jbProductosCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbProductosCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbProductosCompra.setText("Productos de una Compra");

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addComponent(jbProductosCompra)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpFondoLayout.createSequentialGroup()
                        .addComponent(jbProveedoresPorProducto)
                        .addGap(18, 18, 18)
                        .addComponent(jbProductosMasComprados)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbProductosMenorStock)
                    .addComponent(jbProductosPorCompra))
                .addGap(17, 17, 17))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbComprasProveedor)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlConsultas)
                .addGap(57, 57, 57)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProductosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbComprasProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProductosPorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProveedoresPorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProductosMasComprados, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProductosMenorStock, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbComprasProveedor;
    private javax.swing.JButton jbProductosCompra;
    private javax.swing.JButton jbProductosMasComprados;
    private javax.swing.JButton jbProductosMenorStock;
    private javax.swing.JButton jbProductosPorCompra;
    private javax.swing.JButton jbProveedoresPorProducto;
    private javax.swing.JLabel jlConsultas;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables
}
