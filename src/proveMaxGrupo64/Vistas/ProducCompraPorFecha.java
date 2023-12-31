package proveMaxGrupo64.Vistas;

import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.Entidades.Producto;

public class ProducCompraPorFecha extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form ProducCompraPorFecha
     */
    public ProducCompraPorFecha() {
        initComponents();
        this.setTitle("Compras por fecha");
        armarCabecera();
        cargarProductos();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEscritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdFechaSolicitada = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(734, 537));

        jpEscritorio.setBackground(new java.awt.Color(0, 0, 102));
        jpEscritorio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder("")));
        jpEscritorio.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono2.png"))); // NOI18N
        jLabel1.setText("*PRODUCTOS COMPRADOS EN FECHA*");

        jdFechaSolicitada.setDateFormatString("dd/MM/yyyy");
        jdFechaSolicitada.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaSolicitadaPropertyChange(evt);
            }
        });

        jtListaProductos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtListaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaProductos);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor seleccione la fecha en la que desea verificar movimientos de compra");

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2))
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jdFechaSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jdFechaSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdFechaSolicitadaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaSolicitadaPropertyChange
        // TODO add your handling code here:
 if ("date".equals(evt.getPropertyName())) {
        Date selectedDate = jdFechaSolicitada.getDate();
        if (selectedDate != null) {
            // Convertir la fecha de util.Date a java.sql.Date si es necesario
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
            
            CompraData compraData = new CompraData(); 
            List<Producto> productos = compraData.obtenerProductosDeCompraEnFecha(sqlDate);
            
            borrarFilas();
            
            DefaultTableModel modelo = (DefaultTableModel) jtListaProductos.getModel();
            for (Producto producto : productos) {
                modelo.addRow(new Object[]{
                    producto.getIdProducto(),
                    producto.getNombreProducto(),
                    producto.getDescripcion(),
                    producto.getPrecioActual(),
                    producto.getStock(),
                    producto.isEstado() ? "Activo" : "Inactivo",
                });
            }
        }
    }//GEN-LAST:event_jdFechaSolicitadaPropertyChange

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaSolicitada;
    private javax.swing.JPanel jpEscritorio;
    private javax.swing.JTable jtListaProductos;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio Actual");
        modelo.addColumn("Stock");
        modelo.addColumn("Estado");
        jtListaProductos.setModel(modelo);
    }
   private void cargarProductos() {
        ProductoData produ = new ProductoData();
        for (Producto producto : produ.listarProductos()) {
            //jcbProducto.addItem(producto);
        }
    }
    private void borrarFilas() {
        int filas = jtListaProductos.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}

