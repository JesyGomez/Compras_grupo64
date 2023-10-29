package proveMaxGrupo64.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.DetalleCompra;
import proveMaxGrupo64.Entidades.Proveedor;

public class CompraView extends javax.swing.JInternalFrame {

    public CompraView() {
        initComponents();
        this.setTitle("Gestión de Compras");
        deshabilitarCampos();
        jbNuevaCompra.setEnabled(false);
        ProductoData produ = new ProductoData();
        CompraData compra = new CompraData();
        DetalleCompra detacom = new DetalleCompra();
        cargarProveedor();
        jdFecha.getDateEditor().setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio3 = new javax.swing.JDesktopPane();
        jbSalir = new javax.swing.JButton();
        jbCerrarCompra = new javax.swing.JButton();
        jlFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbRegistrarCompra = new javax.swing.JButton();
        jcbProveedor = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbNuevaCompra = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        Escritorio3.setBackground(new java.awt.Color(0, 0, 102));
        Escritorio3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        Escritorio3.setForeground(new java.awt.Color(0, 0, 102));
        Escritorio3.setPreferredSize(new java.awt.Dimension(734, 570));

        jbSalir.setBackground(new java.awt.Color(0, 0, 102));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbCerrarCompra.setBackground(new java.awt.Color(0, 0, 102));
        jbCerrarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbCerrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        jbCerrarCompra.setText("Cerrar Compra");
        jbCerrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarCompraActionPerformed(evt);
            }
        });

        jlFecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Razón Social:");

        jbRegistrarCompra.setBackground(new java.awt.Color(0, 0, 102));
        jbRegistrarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jbRegistrarCompra.setText("Registrar Compra");
        jbRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarCompraActionPerformed(evt);
            }
        });

        jcbProveedor.setBackground(new java.awt.Color(255, 255, 255));
        jcbProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbProveedor.setForeground(new java.awt.Color(0, 0, 0));
        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        jdFecha.setMaxSelectableDate(new java.util.Date());
        jdFecha.setMinSelectableDate(new java.util.Date(1577851309000L));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        jLabel1.setText("*REGISTRO DE COMPRAS*");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese la Fecha y seleccione la razon social del proveedor al cual realizara");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("la compra.");

        jbNuevaCompra.setBackground(new java.awt.Color(0, 0, 102));
        jbNuevaCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jbNuevaCompra.setText("Nueva Compra");
        jbNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCompraActionPerformed(evt);
            }
        });

        Escritorio3.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jbCerrarCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jlFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jbRegistrarCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jcbProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jdFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio3.setLayer(jbNuevaCompra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Escritorio3Layout = new javax.swing.GroupLayout(Escritorio3);
        Escritorio3.setLayout(Escritorio3Layout);
        Escritorio3Layout.setHorizontalGroup(
            Escritorio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Escritorio3Layout.createSequentialGroup()
                .addGroup(Escritorio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Escritorio3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Escritorio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFecha)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Escritorio3Layout.createSequentialGroup()
                                .addComponent(jbNuevaCompra)
                                .addGap(18, 18, 18)
                                .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCerrarCompra)
                                .addGap(66, 66, 66)
                                .addComponent(jbSalir))))
                    .addGroup(Escritorio3Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        Escritorio3Layout.setVerticalGroup(
            Escritorio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Escritorio3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jlFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(Escritorio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrarCompra)
                    .addComponent(jbRegistrarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio3, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio3, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed

        jcbProveedor.getSelectedItem();
    }//GEN-LAST:event_jcbProveedorActionPerformed

    private void jbRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarCompraActionPerformed

        habilitarCampos();

        Proveedor proveSeleccionado = (Proveedor) jcbProveedor.getSelectedItem();
        Date fechaN = jdFecha.getDate();
        if (proveSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor.");
            return;
        }

        if (fechaN == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha válida.");
            return;
        }

        try {

            LocalDate fecha = fechaN.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Proveedor proveedor = new Proveedor();
            proveedor.setIdProveedor(proveSeleccionado.getIdProveedor());

            Compra compra = new Compra(proveedor, fecha);
            CompraData compraData = new CompraData();
            compraData.registrarCompra(compra);

            jbRegistrarCompra.setEnabled(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La fecha debe ser válida.");
        }


    }//GEN-LAST:event_jbRegistrarCompraActionPerformed

    private void jbCerrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarCompraActionPerformed

        deshabilitarCamposCompra();
        jbCerrarCompra.setEnabled(false);
        jbNuevaCompra.setEnabled(true);
        DetalleCompraView dcv = new DetalleCompraView();
        dcv.setVisible(true);
        Escritorio3.add(dcv);
        Escritorio3.moveToFront(dcv);
    }//GEN-LAST:event_jbCerrarCompraActionPerformed

    private void jbNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCompraActionPerformed

        deshabilitarCampos();
        habilitarCamposCompra();
        jbNuevaCompra.setEnabled(false);
    }//GEN-LAST:event_jbNuevaCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbCerrarCompra;
    private javax.swing.JButton jbNuevaCompra;
    private javax.swing.JButton jbRegistrarCompra;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlFecha;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedor() {
        ProveedorData prove = new ProveedorData();
        for (Proveedor proveedor : prove.listarProveedores()) {
            jcbProveedor.addItem(proveedor);
        }
    }

    private void deshabilitarCampos() {

        jbCerrarCompra.setEnabled(false);

    }

    private void habilitarCampos() {

        jbCerrarCompra.setEnabled(true);

    }

    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void deshabilitarCamposCompra() {

        jdFecha.setEnabled(false);
        jcbProveedor.setEnabled(false);
        jbRegistrarCompra.setEnabled(false);

    }

    private void habilitarCamposCompra() {

        jdFecha.setEnabled(true);
        jcbProveedor.setEnabled(true);
        jbRegistrarCompra.setEnabled(true);

    }
}
