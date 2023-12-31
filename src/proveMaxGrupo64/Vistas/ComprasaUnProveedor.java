package proveMaxGrupo64.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.Proveedor;

public class ComprasaUnProveedor extends javax.swing.JInternalFrame {

    
    public ComprasaUnProveedor() {
        initComponents();
        this.setTitle("Compras por Proveedor");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Compra");
        modelo.addColumn("Fecha Compra");
        jtComprasPorProveedor.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtIDProveedor = new javax.swing.JTextField();
        jbBuscarProveedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtProveedorBuscado = new javax.swing.JTextField();
        jbBuscarPorNombre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComprasPorProveedor = new javax.swing.JTable();
        jbNuevaConsulta = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 153));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(474, 537));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1.png"))); // NOI18N
        jLabel1.setText("*COMPRAS POR PROVEEDOR*");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione Proveedor por ID:");

        jbBuscarProveedor.setBackground(new java.awt.Color(0, 0, 102));
        jbBuscarProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbBuscarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscarProveedor.setText("Buscar");
        jbBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione Proveedor por Razón Social:");

        jtProveedorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtProveedorBuscadoActionPerformed(evt);
            }
        });
        jtProveedorBuscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProveedorBuscadoKeyReleased(evt);
            }
        });

        jbBuscarPorNombre.setBackground(new java.awt.Color(0, 0, 102));
        jbBuscarPorNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbBuscarPorNombre.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscarPorNombre.setText("Buscar");
        jbBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPorNombreActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jtComprasPorProveedor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtComprasPorProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtComprasPorProveedor);

        jbNuevaConsulta.setBackground(new java.awt.Color(0, 0, 102));
        jbNuevaConsulta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jbNuevaConsulta.setText("Nueva Consulta");
        jbNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jbNuevaConsulta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtProveedorBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscarPorNombre))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscarProveedor)))))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarProveedor))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtProveedorBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarPorNombre))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jbNuevaConsulta)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProveedorBuscadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProveedorBuscadoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jtProveedorBuscadoKeyReleased

    private void jbBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarProveedorActionPerformed
        
        try {
            String idProvee = jtIDProveedor.getText();
            int idProveedor = Integer.parseInt(idProvee);
            
            if (idProveedor <= 0) {
                JOptionPane.showMessageDialog(this, "El ID del proveedor debe ser un numero entero positivo."
                        + " Intentelo nuevamente.");
                jtIDProveedor.setText("");
            }

            // Creo un objeto Proveedor con el ID ingresado
            Proveedor proveedor = new Proveedor();
            proveedor.setIdProveedor(idProveedor);
            
            CompraData compraData = new CompraData();
            List<Compra> comprasProveedor = compraData.contarComprasProveedor(proveedor);
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Compra");
            modelo.addColumn("Fecha Compra");
            for (Compra compra : comprasProveedor) {
                modelo.addRow(new Object[]{
                    compra.getIdCompra(),
                    compra.getFecha(),});
            }
            
            jtComprasPorProveedor.setModel(modelo);
        
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID del proveedor debe ser un numero");
            jtIDProveedor.setText("");
        }
    }//GEN-LAST:event_jbBuscarProveedorActionPerformed

    private void jbBuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPorNombreActionPerformed
        // TODO add your handling code here:
        String proveedorBuscado = jtProveedorBuscado.getText();
        CompraData provee = new CompraData();

        // Llama al método que cuenta las compras por razonSocial
        provee.contarVecesComprasPorRazonSocial(proveedorBuscado);
        CompraData compraData = new CompraData();
        List<Compra> comprasProveedor = compraData.contarComprasPorNombreProveedor(proveedorBuscado);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Compra");
        modelo.addColumn("Fecha Compra");
        
        for (Compra compra : comprasProveedor) {
            modelo.addRow(new Object[]{
                compra.getIdCompra(),
                compra.getFecha()
            });
        }
        
        jtComprasPorProveedor.setModel(modelo);
    }//GEN-LAST:event_jbBuscarPorNombreActionPerformed

    private void jbNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaConsultaActionPerformed
        // TODO add your handling code here:
        jtIDProveedor.setText("");
        jtProveedorBuscado.setText("");

        // Limpiar tabla
        DefaultTableModel modelo = (DefaultTableModel) jtComprasPorProveedor.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_jbNuevaConsultaActionPerformed

    private void jtProveedorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtProveedorBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProveedorBuscadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPorNombre;
    private javax.swing.JButton jbBuscarProveedor;
    private javax.swing.JButton jbNuevaConsulta;
    private javax.swing.JTable jtComprasPorProveedor;
    private javax.swing.JTextField jtIDProveedor;
    private javax.swing.JTextField jtProveedorBuscado;
    // End of variables declaration//GEN-END:variables

}
