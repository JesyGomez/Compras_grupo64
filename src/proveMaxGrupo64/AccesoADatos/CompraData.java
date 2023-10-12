package proveMaxGrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.Producto;
import proveMaxGrupo64.Entidades.Proveedor;

public class CompraData {

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();
    }
    public static final int ERROR_SQL_COMPRA_DUPLICADA = 1062;

//    public void registrarCompra(Compra compra) {
//        String sql = "INSERT INTO compra (id_compra, id_proveedor, fechaCompra) VALUES (?, ?, ?)";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//
//            ps.setInt(1, compra.getIdCompra());
//            ps.setInt(2, compra.getProveedor().getIdProveedor());
//            ps.setDate(3, Date.valueOf(compra.getFecha()));
//            ps.executeUpdate();
//
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                compra.setIdCompra(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "La compra fue Guardada exitosamente!");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            if (ex.getErrorCode() == ERROR_SQL_COMPRA_DUPLICADA) {
//                JOptionPane.showMessageDialog(null, "La Compra que intenta guardar, ya existe.");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
//            }
//
//        }
    // Método para registrar una compra con productos seleccionados
    public void registrarCompra(Compra compra, List<Producto> productosSeleccionados) {
        String sqlCompra = "INSERT INTO compra (id_compra, id_proveedor, fechaCompra) VALUES (?, ?, ?)";
        String sqlDetalleCompra = "INSERT INTO detalle_compra (id_compra, id_producto, cantidad) VALUES (?, ?, ?)";

        try {
            con.setAutoCommit(false);

            // Registrar la compra
            PreparedStatement psCompra = con.prepareStatement(sqlCompra, Statement.RETURN_GENERATED_KEYS);
            psCompra.setInt(1, compra.getIdCompra());
            psCompra.setInt(2, compra.getProveedor().getIdProveedor());
            psCompra.setDate(3, Date.valueOf(compra.getFecha()));
            psCompra.executeUpdate();

            // Obtener el ID de la compra generada
            ResultSet rsCompra = psCompra.getGeneratedKeys();
            int idCompraGenerada = 0;
            if (rsCompra.next()) {
                idCompraGenerada = rsCompra.getInt(1);
            }

            // Registrar los productos seleccionados en la compra
            PreparedStatement psDetalleCompra = con.prepareStatement(sqlDetalleCompra);
            for (Producto producto : productosSeleccionados) {
                psDetalleCompra.setInt(1, idCompraGenerada);
                psDetalleCompra.setInt(2, producto.getIdProducto());
                //               psDetalleCompra.setInt(3, producto.getCantidad.()); // La cantidad de productos seleccionados
                psDetalleCompra.executeUpdate();
            }

            con.commit();
            con.setAutoCommit(true);

            JOptionPane.showMessageDialog(null, "La compra fue Guardada exitosamente!");

        } catch (SQLException ex) {
            try {
                con.rollback();
                con.setAutoCommit(true);
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace(); // Manejar el error al hacer rollback
            }

            if (ex.getErrorCode() == ERROR_SQL_COMPRA_DUPLICADA) {
                JOptionPane.showMessageDialog(null, "La Compra que intenta guardar, ya existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
            }
        }

    }

    public List<Producto> obtenerProductosDeCompraEnFecha(Date fecha) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT d.id_compra, p.nombre AS nombre_producto, d.cantidad, p.precioActual\n"
                + "FROM compra c\n"
                + "INNER JOIN detallecompra d ON c.id_compra = d.id_compra\n"
                + "INNER JOIN producto p ON d.id_producto = p.id_producto\n"
                + "WHERE c.fechaCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, new java.sql.Date(fecha.getTime()));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt("id_Producto"));
                    producto.setNombreProducto(rs.getString("nombre"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setPrecioActual(rs.getDouble("precioActual"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setEstado(rs.getBoolean("estado"));

                    if (!producto.isEstado()) {
                        JOptionPane.showMessageDialog(null, "La compra se encuentra en la lista pero está Inactivo.");
                    }

                    productos.add(producto);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra: " + ex.getMessage());
        }
        return productos;
    }

    public int contarComprasProveedor(Proveedor proveedor) {
        int cantidadCompras = 0;
        String sql = "SELECT COUNT(*) FROM compra WHERE id_Proveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proveedor.getIdProveedor());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    cantidadCompras = rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar compras del proveedor: " + ex.getMessage());
        }
        return cantidadCompras;
    }
//Todos los productos de una compra en particular

    public List<Producto> obtenerProductosEnCompra(int idCompra) {
        List<Producto> productos = new ArrayList<>();

        String sql = "SELECT * FROM producto p JOIN detallecompra dc ON p.id_producto = dc.id_producto WHERE dc.id_Compra = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCompra);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt("id_Producto"));
                    producto.setNombreProducto(rs.getString("nombre"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setPrecioActual(rs.getDouble("precioActual"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setEstado(rs.getBoolean("estado"));
                    productos.add(producto);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener productos de la compra: " + ex.getMessage());
        }
        return productos;
    }
    //Mostrar qué proveedores, proveen el producto X

    public List<Proveedor> obtenerProveedoresDeProducto(String nombreProducto) {
        List<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT p.id_proveedor, p.razonSocial, p.domicilio, p.telefono "
                + "FROM proveedor p JOIN detallecompra dc ON dc.id_producto = p.id_proveedor "
                + "JOIN producto pr ON dc.id_producto = pr.id_producto WHERE pr.nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombreProducto);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(rs.getInt("id_proveedor"));
                    proveedor.setRazonSocial(rs.getString("razonSocial"));
                    proveedor.setDomicilio(rs.getString("domicilio"));
                    proveedor.setTelefono(rs.getString("telefono"));
                    proveedores.add(proveedor);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proveedores" + ex.getMessage());
        }
        return proveedores;
    }
//Aquellos productos que sean los más comprados entre fechas

    public List<Producto> obtenerProductosMasCompradosEntreFechas(Date fechaInicio, Date fechaFin, int numeroDeProductos) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT dc.id_producto, SUM(dc.cantidad) AS total_comprado "
                + "FROM detallecompra dc INNER JOIN compra c ON dc.id_compra = c.id_compra "
                + "WHERE c.fechaCompra BETWEEN ? AND ? GROUP BY dc.id_producto "
                + "ORDER BY total_comprado;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            ps.setInt(3, numeroDeProductos);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt("id_producto"));
                    producto.setNombreProducto("nombre");
                    producto.setDescripcion("descripcion");
                    productos.add(producto);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener productos comprados para esas fechas" + ex.getMessage());
        }
        return productos;
    }

    //Aquellos productos están por debajo del stock mínimo
    public List<Producto> obtenerProductosPorDebajoDelStockMinimo() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM Producto WHERE stock < 5";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt("id_producto"));
                    producto.setNombreProducto(rs.getString("nombreProducto"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setPrecioActual(rs.getDouble("precioActual"));
                    producto.setStock(rs.getInt("stock"));
                    producto.setEstado(rs.getBoolean("estado"));
                    productos.add(producto);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener productos por debajo del stock mínimo" + ex.getMessage());
        }
        return productos;
    }

    public Compra buscarCompraPorId(int id) {

        String sql = "SELECT id_compra, id_proveedor, fechaCompra FROM compra WHERE id_compra=?";
        Compra compra = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                compra = new Compra();
                compra.setIdCompra(id);
                compra.setFecha(rs.getDate("fechaCompra").toLocalDate());

            } else {
                System.out.println("El Producto no se encontró en la lista.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto.");
        }

        return compra;
    }

}
