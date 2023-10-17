/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveMaxGrupo64.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.DetalleCompra;
import proveMaxGrupo64.Entidades.Producto;
import proveMaxGrupo64.Entidades.Proveedor;

public class CompraView extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompraView
     */
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return c == 5;
        }
    };

    public CompraView() {
        initComponents();
        this.setSize(701, 650);
        this.setTitle("Gestión de Compras");
        deshabilitarCampos();
        ProductoData produ = new ProductoData();
        CompraData compra = new CompraData();
        DetalleCompra detacom = new DetalleCompra();
        armarCabecera();
        cargarProveedor();
        cargarProductos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jtCantidProdSol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbArmarCompra = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbProveedor = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaListaProductos = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jtIDProveedor = new javax.swing.JTextField();
        jlBuscarIdProveedor = new javax.swing.JLabel();
        jbModificarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtIdCompra = new javax.swing.JTextField();
        jlBuscarIdCompra = new javax.swing.JLabel();
        jtProducPorNombre = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);

        jpFondo.setBackground(new java.awt.Color(0, 0, 102));
        jpFondo.setPreferredSize(new java.awt.Dimension(600, 500));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE COMPRAS");
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto a Solicitar:");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jlFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("Fecha:");
        jpFondo.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jpFondo.add(jtCantidProdSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedor:");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 33, -1, -1));

        jbArmarCompra.setBackground(new java.awt.Color(0, 0, 204));
        jbArmarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbArmarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbArmarCompra.setText("Armar Compra");
        jbArmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArmarCompraActionPerformed(evt);
            }
        });
        jpFondo.add(jbArmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jbEliminar.setBackground(new java.awt.Color(0, 0, 204));
        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jpFondo.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        jbSalir.setBackground(new java.awt.Color(0, 0, 204));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpFondo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un proveedor:" }));
        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });
        jpFondo.add(jcbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 32, 399, -1));

        jdFecha.setDateFormatString("yyyy-MM-dd");
        jpFondo.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 210, -1));

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

        jpFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 670, 164));

        jbGuardar.setText("Guardar");
        jpFondo.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));
        jpFondo.add(jtIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 110, -1));

        jlBuscarIdProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlBuscarIdProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jlBuscarIdProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jlBuscarIdProveedor.setText("ID Proveedor");
        jlBuscarIdProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarIdProveedorMouseClicked(evt);
            }
        });
        jpFondo.add(jlBuscarIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 120, -1));

        jbModificarCompra.setBackground(new java.awt.Color(0, 0, 204));
        jbModificarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbModificarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbModificarCompra.setText("Modificar");
        jbModificarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarCompraActionPerformed(evt);
            }
        });
        jpFondo.add(jbModificarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID de Compra:");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jpFondo.add(jtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));

        jlBuscarIdCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32.png"))); // NOI18N
        jlBuscarIdCompra.setText("jLabel6");
        jlBuscarIdCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarIdCompraMouseClicked(evt);
            }
        });
        jpFondo.add(jlBuscarIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 40, 30));

        jtProducPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProducPorNombreKeyReleased(evt);
            }
        });
        jpFondo.add(jtProducPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
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

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
        // TODO add your handling code here:
        jcbProveedor.getSelectedItem();
    }//GEN-LAST:event_jcbProveedorActionPerformed

    private void jbArmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArmarCompraActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
        CompraData compraData = new CompraData();
        llenarTabla();
        try {
            String proveSeleccionado = (String) jcbProveedor.getSelectedItem();
            Date fechaN = jdFecha.getDate();

            LocalDate fecha = fechaN.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La fecha debe ser válida.");
        }
    }//GEN-LAST:event_jbArmarCompraActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCompraActionPerformed
// Obtiene el proveedor seleccionado del JComboBox
        Proveedor proveedor = (Proveedor) jcbProveedor.getSelectedItem();
        String idCompra = jtIdCompra.getText().trim();
        CompraData compraData = new CompraData();
        Compra compraEncontrada = compraData.buscarCompraPorId(WIDTH);

        if (compraEncontrada != null) {
            // Modifica los atributos de compraEncontrada según sea necesario
            compraEncontrada.setProveedor(proveedor);
            // Modifica la fecha de la compra si el usuario ingresó una nueva fecha
            // compraEncontrada.setFecha(fechaSeleccionada); // Usa la fecha seleccionada por el usuario

            // Llama al método modificarCompra() con la compraEncontrada modificada
            compraData.modificarCompra(compraEncontrada);
            JOptionPane.showMessageDialog(null, "Compra modificada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Compra no encontrada.");
        }
//
//        try {
////            String proveSeleccionado = jcbProveedor.getActionCommand();
////            int idProveedor = Integer.parseInt(jtIDProveedor.getText());
////            Date fechaN = jdFecha.getDate();
//            int idCompra = Integer.parseInt(jtIdCompra.getText());
//
//            Compra ModificarCompra = new Compra(prove, LocalDate.MIN);
//            JOptionPane.showMessageDialog(null, "Probando...." + ModificarCompra);
//            // Crear una instancia de Proveedor con los datos modificados
//            // Mostrar un cuadro de diálogo de confirmación
////            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro desea realizar este cambio en la compra?", "Confirmar Modificación", JOptionPane.YES_NO_OPTION);
////
////            if (confirmacion == JOptionPane.YES_OPTION) {
//            // El usuario ha confirmado, entonces realizamos la modificación del proveedor
//            compra.modificarCompra(ModificarCompra);
//            //}
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
//        }

    }//GEN-LAST:event_jbModificarCompraActionPerformed

    private void jlBuscarIdProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarIdProveedorMouseClicked

        ProveedorData proveedorData = new ProveedorData();
        try {
            String idProveedorText = jtIDProveedor.getText().trim();
            Proveedor proveedorEncontrado = null;
            if (!idProveedorText.isEmpty()) {
                int idProvee = Integer.parseInt(idProveedorText);
                if (idProvee <= 0) {
                    JOptionPane.showMessageDialog(this, "El ID debe ser un número mayor a cero (0)");
                    return;
                }
            }
            if (idProveedorText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID para buscar el proveedor.");
            } else {
                int idProveedor = Integer.parseInt(idProveedorText);
                proveedorEncontrado = proveedorData.buscarProveedor(idProveedor);
            }

            if (proveedorEncontrado != null) {
                JOptionPane.showMessageDialog(this, "El proveedor se encontró en la lista.");
                // Muestra el nombre del proveedor en el JComboBox
                jcbProveedor.setSelectedItem(proveedorEncontrado.getRazonSocial());
            } else {
                // Si no se encuentra el proveedor, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Proveedor no encontrado.");
                // Limpia el JComboBox si no se encuentra el proveedor
                jcbProveedor.setSelectedItem(null);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jlBuscarIdProveedorMouseClicked

    private void jlBuscarIdCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarIdCompraMouseClicked
        CompraData compraData = new CompraData();
        try {
            String idCompra = jtIdCompra.getText().trim();
            Compra compraEncontrada = null;
            if (!idCompra.isEmpty()) {
                int idComp = Integer.parseInt(idCompra);
                if (idComp <= 0) {
                    JOptionPane.showMessageDialog(this, "El ID debe ser un número mayor a cero (0)");
                    return;
                }
            }
            if (idCompra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID para buscar la compra.");

            } else {
                int idComp = Integer.parseInt(idCompra);
                compraEncontrada = compraData.buscarCompraPorId(idComp);
            }

            if (compraEncontrada != null) {
                JOptionPane.showMessageDialog(this, "La compra se encontró en la lista." + compraEncontrada);
                // Configura el JComboBox con el proveedor de la compra encontrada
                jtIDProveedor.setText(String.valueOf(compraEncontrada.getProveedor().getIdProveedor()));

                // Configura el JDateChooser con la fecha de la compra encontrada
                Date fechaUtil = Date.from(compraEncontrada.getFecha().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
                jdFecha.setDate(fechaUtil);
            } else {
                // Si no se encuentra la compra, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "La compra no se ha encontrado.");

                // Limpia el JComboBox y el JDateChooser si no se encuentra la compra
                jtIDProveedor.setText(null);
                jdFecha.setDate(null);

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        }
    }//GEN-LAST:event_jlBuscarIdCompraMouseClicked

    private void jtProducPorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProducPorNombreKeyReleased
        // TODO add your handling code here:

        String nombreBuscado = jtProducPorNombre.getText();

        // Llama al método buscarProductoPorNombre en ProductoData para obtener los productos
        ProductoData productoData = new ProductoData();
        List<Producto> productosEncontrados = productoData.buscarProductoPorNombre(nombreBuscado);

        // Llena la tabla con los productos encontrados
        llenarTablaProductos(productosEncontrados);
    }//GEN-LAST:event_jtProducPorNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbArmarCompra;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificarCompra;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbProveedor;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlBuscarIdCompra;
    private javax.swing.JLabel jlBuscarIdProveedor;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField jtCantidProdSol;
    private javax.swing.JTextField jtIDProveedor;
    private javax.swing.JTextField jtIdCompra;
    private javax.swing.JTextField jtProducPorNombre;
    private javax.swing.JTable jtaListaProductos;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {
        ProductoData produ = new ProductoData();
        for (Producto producto : produ.listarProductos()) {
            //jcbProducto.addItem(producto);
        }
    }

    private void cargarProveedor() {
        ProveedorData prove = new ProveedorData();
        for (Proveedor proveedor : prove.listarProveedores()) {
            jcbProveedor.addItem(proveedor.getRazonSocial());
        }
    }

    private void deshabilitarCampos() {

        jtaListaProductos.setEnabled(false);
        jtProducPorNombre.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);

    }

    private void habilitarCampos() {

        jtaListaProductos.setEnabled(true);
        jtProducPorNombre.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbEliminar.setEnabled(true);

    }

    private void armarCabecera() {
        modelo.addColumn("idProducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
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

    private void llenarTabla() {
        // Obtén el proveedor y la fecha seleccionados
        String proveedorSeleccionado = jcbProveedor.getActionCommand();
        Date fechaSeleccionada = jdFecha.getDate();
        String producASelec = jtProducPorNombre.getSelectedText();

        // Verifica si se han seleccionado tanto un proveedor como una fecha
        if (proveedorSeleccionado != null && fechaSeleccionada != null) {
            // Convierte la fecha seleccionada de util.Date a LocalDate
            LocalDate fecha = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Obtén los productos asociados al proveedor y la fecha seleccionados
            ProductoData productoData = new ProductoData();
            List<Producto> productos = productoData.listarProductos();

            // Limpia el modelo de la tabla antes de agregar nuevos datos
            DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();
            modelo.setRowCount(0);

            // Llena la tabla con los productos asociados al proveedor y la fecha
            for (Producto producto : productos) {
                modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getStock(), producto.isEstado()});
            }
        } else {
            // Si no se ha seleccionado un proveedor o una fecha, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un proveedor y una fecha antes de cargar los productos.");
        }
    }

    private void llenarTablaProductos(List<Producto> productos) {
        // Limpia el modelo de la tabla antes de agregar nuevos datos
        DefaultTableModel modelo = (DefaultTableModel) jtaListaProductos.getModel();
        modelo.setRowCount(0);

        // Llena la tabla con los productos obtenidos
        for (Producto producto : productos) {
            modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(), producto.getStock(), producto.isEstado()});
        }
    }

    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
}
