package proveMaxGrupo64.Vistas;

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
        jbCerrarCompra = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscarDetalleAnterior = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtIdDetalleCompra = new javax.swing.JTextField();

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

        jbBuscarDetalleAnterior.setBackground(new java.awt.Color(0, 0, 102));
        jbBuscarDetalleAnterior.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbBuscarDetalleAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarDetalleAnterior.setText("Buscar");
        jbBuscarDetalleAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarDetalleAnteriorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Detalle Compra");

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCerrarCompra)
                .addGap(70, 70, 70)
                .addComponent(jbSalir)
                .addGap(70, 70, 70))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbBuscarDetalleAnterior)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
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
                .addGap(33, 33, 33)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addComponent(jbBuscarDetalleAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCerrarCompra)
                            .addComponent(jbSalir)))
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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

    private void jbCerrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarCompraActionPerformed

        int idCompra = Integer.parseInt(jtIDCompra.getText());
        int idProveedor = Integer.parseInt(jtIDProveedor.getText());
        DetalleCompraData dcdata = new DetalleCompraData();
        DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            int idProducto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            Object cantidadObj = modelo.getValueAt(i, 6); 

            // Verificamos de vacio o no de la celda cantidad.
            
            if (cantidadObj != null && !cantidadObj.toString().trim().isEmpty()) {
                int cantidad = Integer.parseInt(cantidadObj.toString());

                double precioActual = Double.parseDouble(modelo.getValueAt(i, 3).toString());
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
        jtIDCompra.setText("");
        salida();

        // Limpiar tabla
        modelo.setRowCount(0);
    }//GEN-LAST:event_jbCerrarCompraActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "Desea Salir?", "SALIR", a);
        if (resultado == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarDetalleAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarDetalleAnteriorActionPerformed
        // TODO add your handling code here:
        try {
            String idDetalle = jtIdDetalleCompra.getText();
            int idDetalleCom = Integer.parseInt(idDetalle);

            if (idDetalleCom <= 0) {
                JOptionPane.showMessageDialog(this, "El ID del detalle de compra debe ser un número entero positivo. Intentelo nuevamente.");
                jtIdDetalleCompra.setText("");
            } else {
                DetalleCompraData deta = new DetalleCompraData();
                DetalleCompra detalleCompra = deta.buscarDetalleCompraPorId(idDetalleCom);

                if (detalleCompra != null) {
                    String[] columnas = {"IdDetalle", "IdCompra", "IdProducto", "Cantidad", "PrecioCosto"};

                    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
                    modelo.addRow(new Object[]{
                        detalleCompra.getIdDetalle(),
                        detalleCompra.getCompra().getIdCompra(),
                        detalleCompra.getProducto().getIdProducto(),
                        detalleCompra.getCantidad(),
                        detalleCompra.getPrecioCosto()
                    });

                    jtaListaProductos.setModel(modelo);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un detalle de compra con ese ID.");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID del detalle de compra debe ser un número entero.");
            jtIdDetalleCompra.setText("");
        }
    }//GEN-LAST:event_jbBuscarDetalleAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarDetalleAnterior;
    private javax.swing.JButton jbCerrarCompra;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField jtIDCompra;
    private javax.swing.JTextField jtIDProveedor;
    private javax.swing.JTextField jtIdDetalleCompra;
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
    
    private void salida(){
        
        jtIDCompra.setEnabled(false);
        jtIDProveedor.setEnabled(false);
        jtaListaProductos.setEnabled(false);
        jbCerrarCompra.setEnabled(false);
        
        
    }

}
