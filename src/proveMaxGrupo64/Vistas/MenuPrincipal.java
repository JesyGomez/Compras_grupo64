package proveMaxGrupo64.Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
       this.setExtendedState(this.MAXIMIZED_BOTH);
        Escritorio = new EscritorioModificado();
        this.setContentPane(Escritorio);
        setLocationRelativeTo(null);
        this.setTitle("ProveMax-Sistema de Compras");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmConsultas = new javax.swing.JMenu();
        jmProductosPorCompra = new javax.swing.JMenuItem();
        jmComprasPorProveedor = new javax.swing.JMenuItem();
        jmProveedorPorProducto = new javax.swing.JMenuItem();
        jmProductosMasComprados = new javax.swing.JMenuItem();
        jmProductosMenorStock = new javax.swing.JMenuItem();
        jmProductosPorFecha = new javax.swing.JMenuItem();
        jMCompras = new javax.swing.JMenu();
        jmRegistrarCompra = new javax.swing.JMenuItem();
        jMProductos = new javax.swing.JMenu();
        jmRegistroProductos = new javax.swing.JMenuItem();
        jMProveedores = new javax.swing.JMenu();
        jmForProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(1100, 645));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuestionario.png"))); // NOI18N
        jmConsultas.setText("Consultas");
        jmConsultas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmConsultas.setPreferredSize(new java.awt.Dimension(150, 50));

        jmProductosPorCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmProductosPorCompra.setText("Productos por Compra");
        jmProductosPorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosPorCompraActionPerformed(evt);
            }
        });
        jmConsultas.add(jmProductosPorCompra);

        jmComprasPorProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmComprasPorProveedor.setText("Compras por Proveedor");
        jmComprasPorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComprasPorProveedorActionPerformed(evt);
            }
        });
        jmConsultas.add(jmComprasPorProveedor);

        jmProveedorPorProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmProveedorPorProducto.setText("Proveedor por Producto");
        jmProveedorPorProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedorPorProductoActionPerformed(evt);
            }
        });
        jmConsultas.add(jmProveedorPorProducto);

        jmProductosMasComprados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmProductosMasComprados.setText("Productos mas Comprados");
        jmProductosMasComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosMasCompradosActionPerformed(evt);
            }
        });
        jmConsultas.add(jmProductosMasComprados);

        jmProductosMenorStock.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmProductosMenorStock.setText("Producto de Menor Stock");
        jmProductosMenorStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosMenorStockActionPerformed(evt);
            }
        });
        jmConsultas.add(jmProductosMenorStock);

        jmProductosPorFecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmProductosPorFecha.setText("Productos por Fecha");
        jmProductosPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosPorFechaActionPerformed(evt);
            }
        });
        jmConsultas.add(jmProductosPorFecha);

        jMenuBar1.add(jmConsultas);

        jMCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ComprasLogo.png"))); // NOI18N
        jMCompras.setText("Compras");
        jMCompras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMCompras.setPreferredSize(new java.awt.Dimension(150, 50));

        jmRegistrarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmRegistrarCompra.setText("Registrar Compras");
        jmRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarCompraActionPerformed(evt);
            }
        });
        jMCompras.add(jmRegistrarCompra);

        jMenuBar1.add(jMCompras);

        jMProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producDos.png"))); // NOI18N
        jMProductos.setText("Productos");
        jMProductos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMProductos.setPreferredSize(new java.awt.Dimension(150, 50));

        jmRegistroProductos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmRegistroProductos.setText("Registro de Productos");
        jmRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroProductosActionPerformed(evt);
            }
        });
        jMProductos.add(jmRegistroProductos);

        jMenuBar1.add(jMProductos);

        jMProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono8.png"))); // NOI18N
        jMProveedores.setText("Proveedores");
        jMProveedores.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMProveedores.setPreferredSize(new java.awt.Dimension(150, 50));

        jmForProveedores.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmForProveedores.setText("Formulario de proveedores");
        jmForProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmForProveedoresActionPerformed(evt);
            }
        });
        jMProveedores.add(jmForProveedores);

        jMenuBar1.add(jMProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroProductosActionPerformed

        Escritorio.removeAll();
        Escritorio.repaint();
        ProductoView pv = new ProductoView();
        pv.setVisible(true);
        Escritorio.add(pv);
        Escritorio.moveToFront(pv);
    }//GEN-LAST:event_jmRegistroProductosActionPerformed

    private void jmForProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmForProveedoresActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ProveedorView prv = new ProveedorView();
        prv.setVisible(true);
        Escritorio.add(prv);
        Escritorio.moveToFront(prv);
    }//GEN-LAST:event_jmForProveedoresActionPerformed

    private void jmRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarCompraActionPerformed

        Escritorio.removeAll();
        Escritorio.repaint();
        CompraView cv = new CompraView();
        cv.setVisible(true);
        Escritorio.add(cv);
        Escritorio.moveToFront(cv);
    }//GEN-LAST:event_jmRegistrarCompraActionPerformed

    private void jmProductosPorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosPorCompraActionPerformed
       
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosdeUnaCompra ppc = new ProductosdeUnaCompra();
        ppc.setVisible(true);
        Escritorio.add(ppc);
        Escritorio.moveToFront(ppc);
    }//GEN-LAST:event_jmProductosPorCompraActionPerformed

    private void jmComprasPorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComprasPorProveedorActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ComprasaUnProveedor cxp = new ComprasaUnProveedor();
        cxp.setVisible(true);
        Escritorio.add(cxp);
        Escritorio.moveToFront(cxp);
    }//GEN-LAST:event_jmComprasPorProveedorActionPerformed

    private void jmProveedorPorProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedorPorProductoActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ProveePorProducto ppp = new ProveePorProducto();
        ppp.setVisible(true);
        Escritorio.add(ppp);
        Escritorio.moveToFront(ppp);
    }//GEN-LAST:event_jmProveedorPorProductoActionPerformed

    private void jmProductosMasCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosMasCompradosActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosMasComprados pmc = new ProductosMasComprados();
        pmc.setVisible(true);
        Escritorio.add(pmc);
        Escritorio.moveToFront(pmc);
    }//GEN-LAST:event_jmProductosMasCompradosActionPerformed

    private void jmProductosMenorStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosMenorStockActionPerformed
      
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosdeMenorStock pms = new ProductosdeMenorStock();
        pms.setVisible(true);
        Escritorio.add(pms);
        Escritorio.moveToFront(pms);
    }//GEN-LAST:event_jmProductosMenorStockActionPerformed

    private void jmProductosPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosPorFechaActionPerformed

        Escritorio.removeAll();
        Escritorio.repaint();
        ProducCompraPorFecha ppc = new ProducCompraPorFecha();
        ppc.setVisible(true);
        Escritorio.add(ppc);
        Escritorio.moveToFront(ppc);
    }//GEN-LAST:event_jmProductosPorFechaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMCompras;
    private javax.swing.JMenu jMProductos;
    private javax.swing.JMenu jMProveedores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmComprasPorProveedor;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmForProveedores;
    private javax.swing.JMenuItem jmProductosMasComprados;
    private javax.swing.JMenuItem jmProductosMenorStock;
    private javax.swing.JMenuItem jmProductosPorCompra;
    private javax.swing.JMenuItem jmProductosPorFecha;
    private javax.swing.JMenuItem jmProveedorPorProducto;
    private javax.swing.JMenuItem jmRegistrarCompra;
    private javax.swing.JMenuItem jmRegistroProductos;
    // End of variables declaration//GEN-END:variables
}
