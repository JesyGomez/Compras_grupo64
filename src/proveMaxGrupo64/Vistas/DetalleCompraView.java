package proveMaxGrupo64.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.DetalleCompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.DetalleCompra;
import proveMaxGrupo64.Entidades.Producto;

/**
 *
 * @author Windows 10 OS
 */
public class DetalleCompraView extends javax.swing.JInternalFrame {

    private DetalleCompraData detaData;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return c == 6;
        }
    };

    public DetalleCompraView() {
        initComponents();
        CompraData compra = new CompraData();
        armarCabecera();
        llenarCamposUltimaCompra();
        compra.obtenerUltimaCompra();
        jtIDCompra.setText(String.valueOf(compra.obtenerUltimaCompra().getIdCompra()));
        jtIDProveedor.setText(String.valueOf(compra.obtenerUltimaCompra().getProveedor().getIdProveedor()));
        cargarProductos();
        llenarTabla();
        jtIDCompra.setEnabled(false);
        jtIDProveedor.setEnabled(false);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaListaProductos = new javax.swing.JTable();
        jtIDCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtIDProveedor = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jbCerrarCompra = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 550));

        jpFondo.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono7.png"))); // NOI18N
        jLabel1.setText("*DETALLE DE COMPRA*");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Compra:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LISTA DE PRODUCTOS");

        jtaListaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtaListaProductos);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Proveedor:");

        jBModificar.setBackground(new java.awt.Color(0, 0, 102));
        jBModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
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

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addComponent(jtIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFondoLayout.createSequentialGroup()
                                .addComponent(jBModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFondoLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jbCerrarCompra)
                                .addGap(107, 107, 107)
                                .addComponent(jbSalir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBModificar)
                        .addComponent(jbCerrarCompra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(1, 1, 1)))
                .addContainerGap(94, Short.MAX_VALUE))
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

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:

        int filaSeleccinada = jtaListaProductos.getSelectedRow();
        if (filaSeleccinada != -1) {
            int idDetalle = (Integer) jtaListaProductos.getValueAt(filaSeleccinada, 0);

            Integer nuevaCantidad = obtenerNuevaCantidad();
            if (nuevaCantidad != null) {

                if (nuevaCantidad >= 0) {
                    jtaListaProductos.setValueAt(nuevaCantidad, filaSeleccinada, 3);
                    detaData.actualizarcantidad(idDetalle, nuevaCantidad);

                } else {
                    // Si la nota no está en rango válido se muestra un mensaje de error 
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jbCerrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarCompraActionPerformed

        int idCompra = Integer.parseInt(jtIDCompra.getText());
        int idProveedor = Integer.parseInt(jtIDProveedor.getText());
        DetalleCompraData dcdata = new DetalleCompraData();

        for (int i = 0; i < jtaListaProductos.getRowCount(); i++) {
            // Verificar si la fila está seleccionada
            if (jtaListaProductos.isRowSelected(i)) {
                int idProducto = Integer.parseInt(jtaListaProductos.getValueAt(i, 0).toString());
                int cantidad = Integer.parseInt(jtaListaProductos.getValueAt(i, 6).toString());
                double precioActual = Double.parseDouble(jtaListaProductos.getValueAt(i, 3).toString());
                double precioCosto = precioActual * cantidad;

                // Crear objeto DetalleCompra
                DetalleCompra dc = new DetalleCompra();
                Compra compra = new Compra();
                compra.setIdCompra(idCompra);
                Producto producto = new Producto();
                producto.setIdProducto(idProducto);
                dc.setCompra(compra);
                dc.setProducto(producto);
                dc.setCantidad(cantidad);
                dc.setPrecioCosto(precioCosto);

                // Llamar al método para guardar el detalle de compra
                dcdata.guardarDetalleCompra(dc);
            }
        }
        jtIDProveedor.setText("");
        jtIDProveedor.setText("");

        // Limpiar tabla
        DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_jbCerrarCompraActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrarCompra;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField jtIDCompra;
    private javax.swing.JTextField jtIDProveedor;
    private javax.swing.JTable jtaListaProductos;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {
        ProductoData produ = new ProductoData();
        for (Producto producto : produ.listarProductos()) {
            //jcbProducto.addItem(producto);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("idProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio Actual");
        modelo.addColumn("Stock");
        modelo.addColumn("Estado");
        modelo.addColumn("Cantidad");
        jtaListaProductos.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = jtaListaProductos.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarDetallesCompras() {
        borrarFilas();
        DetalleCompraData deta = new DetalleCompraData();
        List<DetalleCompra> detallesCompras = deta.listarDetallesCompra();

        for (DetalleCompra detalleCompra : detallesCompras) {
            Object[] fila = {
                detalleCompra.getIdDetalle(),
                detalleCompra.getCompra().getIdCompra(),
                detalleCompra.getProducto().getIdProducto(),
                detalleCompra.getCantidad(),
                detalleCompra.getPrecioCosto()
            };
            modelo.addRow(fila);
        }
    }

    private void llenarCamposUltimaCompra() {
        CompraData compra = new CompraData();
        Compra ultimaCompra = compra.obtenerUltimaCompra();
        if (ultimaCompra != null) {
            jtIDCompra.setText(String.valueOf(ultimaCompra.getIdCompra()));
            jtIDProveedor.setText(String.valueOf(ultimaCompra.getProveedor().getIdProveedor()));
            ProductoData produSele = new ProductoData();
            jtaListaProductos.setModel(modelo);
        }
    }

    private Integer obtenerNuevaCantidad() {
        String input = JOptionPane.showInputDialog("Ingrese la nueva Cantidad:");
        if (input != null) {
            try {
                return Integer.parseInt(input);
                //return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La entrada no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Devolvemos null para indicar que no se ingresó una nueva o se canceló la operación
        return null;
    }

    private void llenarTabla() {
        // Obtén el proveedor y la fecha seleccionados
        String idCompra = jtIDCompra.getText();

        if (idCompra != null) {
            // Convierte la fecha seleccionada de util.Date a LocalDate

            ProductoData productoData = new ProductoData();
            List<Producto> productos = productoData.listarProductos();

            DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();
            modelo.setRowCount(0);

            for (Producto producto : productos) {
                modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), producto.isEstado()});
            }
        } else {
            //JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor y una fecha antes de cargar los productos.");
        }
    }

    private void llenarTablaProductos(List<Producto> productos) {

        DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();
        modelo.setRowCount(0);

        for (Producto producto : productos) {

            modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock(), producto.isEstado()});
        }
    }

}
