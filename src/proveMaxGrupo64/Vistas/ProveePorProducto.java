/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveMaxGrupo64.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Proveedor;

public class ProveePorProducto extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form ProveePorProducto
     */
    public ProveePorProducto() {
        initComponents();
        this.setTitle("Proveedor de Productos");
        armarCabecera();
        cargarProductos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtProductoSolicitado = new javax.swing.JTextField();
        jbBuscarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProveedor = new javax.swing.JTable();
        jbNuevaConsulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(474, 537));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono10.png"))); // NOI18N
        jLabel1.setText("*PROVEEDORES DE PRODUCTOS*");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto Solicitado:");

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

        jtProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProveedor);

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*DETERMINADOS*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtProductoSolicitado)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarProveedor)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jbNuevaConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtProductoSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarProveedor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jbNuevaConsulta)
                .addGap(16, 16, 16))
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

    private void jbNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaConsultaActionPerformed
        jtProductoSolicitado.setText("");
        modelo.setRowCount(0);
    }//GEN-LAST:event_jbNuevaConsultaActionPerformed

    private void jbBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarProveedorActionPerformed
        // TODO add your handling code here:
        String ProducSolic = jtProductoSolicitado.getText();
        CompraData produc = new CompraData();
        List<Proveedor> provee = produc.obtenerProveedoresDeProducto(ProducSolic);
        borrarFilas();
        for (Proveedor proveedor : provee) {
            modelo.addRow(new Object[]{
                proveedor.getIdProveedor(),
                proveedor.getRazonSocial(),
            });
        }
    
    }//GEN-LAST:event_jbBuscarProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarProveedor;
    private javax.swing.JButton jbNuevaConsulta;
    private javax.swing.JTextField jtProductoSolicitado;
    private javax.swing.JTable jtProveedor;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("id_Proveedor");
        modelo.addColumn("Razón Social");
        jtProveedor.setModel(modelo);
    }

    private void cargarProductos() {
        ProveedorData provee = new ProveedorData();
        for (Proveedor producto : provee.listarProveedores()) {
      
        }
    }

    private void borrarFilas() {
        int filas = jtProveedor.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
