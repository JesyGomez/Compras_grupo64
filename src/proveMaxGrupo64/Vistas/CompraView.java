/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveMaxGrupo64.Vistas;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.Producto;
import proveMaxGrupo64.Entidades.Proveedor;

public class CompraView extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompraView
     */
    public CompraView() {
        initComponents();
        ProductoData produ = new ProductoData();
        cargarProductos();
        cargarProveedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEliminar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jtCantidProdSol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbProducto = new javax.swing.JComboBox<>();
        jcbProveedor = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jbEliminar.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE COMPRAS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto a Solicitar:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");

        jlFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedor:");

        jbRegistrar.setBackground(new java.awt.Color(0, 0, 204));
        jbRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbeliminar.setBackground(new java.awt.Color(0, 0, 204));
        jbeliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbeliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 0, 204));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductoActionPerformed(evt);
            }
        });

        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jbEliminarLayout = new javax.swing.GroupLayout(jbEliminar);
        jbEliminar.setLayout(jbEliminarLayout);
        jbEliminarLayout.setHorizontalGroup(
            jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbEliminarLayout.createSequentialGroup()
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbEliminarLayout.createSequentialGroup()
                        .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbEliminarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jlFecha)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))
                            .addGroup(jbEliminarLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jbRegistrar)))
                        .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jbEliminarLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtCantidProdSol)
                                    .addComponent(jcbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                            .addGroup(jbEliminarLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jbeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))))
                    .addGroup(jbEliminarLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jbEliminarLayout.setVerticalGroup(
            jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbEliminarLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbEliminarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbEliminarLayout.createSequentialGroup()
                        .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtCantidProdSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlFecha)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jbEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jbeliminar)
                    .addComponent(jbSalir))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductoActionPerformed
        // TODO add your handling code here:
        Producto produSeleccionado = (Producto) jcbProducto.getSelectedItem();

    }//GEN-LAST:event_jcbProductoActionPerformed

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
        // TODO add your handling code here:
        Proveedor proveSeleccionado = (Proveedor) jcbProveedor.getSelectedItem();
    }//GEN-LAST:event_jcbProveedorActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        CompraData compraData = new CompraData();

        try {
            String prodCompNueva = jcbProducto.getActionCommand();
            String proveeCompraNueva = jcbProveedor.getActionCommand();
            int cantidad = Integer.parseInt(jtCantidProdSol.getText());
            Date fecha = jdFecha.getDate();


            // El año tiene que ser un número positivo
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un número positivo.");
                return;
            }

            Compra nuevaCompra = new Compra(prodCompNueva,proveeCompraNueva,cantidad,fecha);

            compraData.registrarCompra(nuevaCompra);

            jcbProducto.setActionCommand("");
            jcbProveedor.setActionCommand("");
            jtCantidProdSol.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.");
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JComboBox<Producto> jcbProducto;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JTextField jtCantidProdSol;
    // End of variables declaration//GEN-END:variables
    private void cargarProductos() {
        ProductoData produ = new ProductoData();
        for (Producto producto : produ.listarProductos()) {
            jcbProducto.addItem(producto);
        }
    }

    private void cargarProveedor() {
        ProveedorData prove = new ProveedorData();
        for (Proveedor proveedor : prove.listarProveedores()) {
            jcbProveedor.addItem(proveedor);
        }
    }
}
