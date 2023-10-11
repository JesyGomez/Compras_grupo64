/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveMaxGrupo64.Vistas;

/**
 *
 * @author Windows 10 OS
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        Escritorio = new EscritorioModificado();
        this.setContentPane(Escritorio);
        setLocationRelativeTo(null);
        this.setTitle("Sistema de Compras");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAdmin = new javax.swing.JMenu();
        jMCompras = new javax.swing.JMenu();
        jmRegistrarCompra = new javax.swing.JMenuItem();
        jMProductos = new javax.swing.JMenu();
        jMIngresoProducto = new javax.swing.JMenuItem();
        jMProveedores = new javax.swing.JMenu();
        jMForProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(1100, 640));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMAdmin.setText("Administracion");
        jMenuBar1.add(jMAdmin);

        jMCompras.setText("Compras");

        jmRegistrarCompra.setText("Registrar Compras");
        jmRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarCompraActionPerformed(evt);
            }
        });
        jMCompras.add(jmRegistrarCompra);

        jMenuBar1.add(jMCompras);

        jMProductos.setText("Productos");

        jMIngresoProducto.setText("Ingreso de Producto");
        jMIngresoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIngresoProductoActionPerformed(evt);
            }
        });
        jMProductos.add(jMIngresoProducto);

        jMenuBar1.add(jMProductos);

        jMProveedores.setText("Proveedores");

        jMForProveedores.setText("Formulario de proveedores");
        jMForProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMForProveedoresActionPerformed(evt);
            }
        });
        jMProveedores.add(jMForProveedores);

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
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIngresoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngresoProductoActionPerformed
        // TODO add your handling code here:
        
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductoView pv = new ProductoView();
        pv.setVisible(true);
        Escritorio.add(pv);
        Escritorio.moveToFront(pv);
    }//GEN-LAST:event_jMIngresoProductoActionPerformed

    private void jMForProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMForProveedoresActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ProveedorView prv = new ProveedorView();
        prv.setVisible(true);
        Escritorio.add(prv);
        Escritorio.moveToFront(prv);
    }//GEN-LAST:event_jMForProveedoresActionPerformed

    private void jmRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarCompraActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        CompraView cv = new CompraView();
        cv.setVisible(true);
        Escritorio.add(cv);
        Escritorio.moveToFront(cv);
    }//GEN-LAST:event_jmRegistrarCompraActionPerformed

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
    private javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMCompras;
    private javax.swing.JMenuItem jMForProveedores;
    private javax.swing.JMenuItem jMIngresoProducto;
    private javax.swing.JMenu jMProductos;
    private javax.swing.JMenu jMProveedores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmRegistrarCompra;
    // End of variables declaration//GEN-END:variables
}
