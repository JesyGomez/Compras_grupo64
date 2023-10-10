package proveMaxGrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.DetalleCompra;
import proveMaxGrupo64.Entidades.Producto;

public class DetalleCompraData {

    private Connection con = null;
    private ProductoData pd = new ProductoData();
    private CompraData cd = new CompraData();

    public DetalleCompraData() {

        con = Conexion.getConexion();
    }

    public static final int ERROR_SQL_DETALLE_COMPRA_DUPLICADA = 1062;

    public void guardarDetalleCompra(DetalleCompra dc) {

        String sql = "INSERT INTO detallecompra(id_detalle, id_compra, id_producto, cantidad, precioCosto)"
                + "VALUES(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dc.getIdDetalle());
            ps.setInt(2, dc.getCompra().getIdCompra());
            ps.setInt(3, dc.getProducto().getIdProducto());
            ps.setInt(4, dc.getCantidad());
            ps.setDouble(5, dc.getPrecioCosto());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dc.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Guardado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == ERROR_SQL_DETALLE_COMPRA_DUPLICADA) {
                JOptionPane.showMessageDialog(null, "El detalle de la compra, ya existe.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle de Compra");
            }

        }

    }

    /*public DetalleCompra buscarDetalleCompraPorId(int id) {

        String sql = "SELECT id_detalle, id_compra, id_producto, cantidad, precioCosto"
                + " FROM detallecompra"
                + " WHERE id_detalle=?";

        DetalleCompra detalleCompra = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(id);
                detalleCompra.getCompra().getIdCompra();
                detalleCompra.setDescripcion(rs.getString("descripcion"));
                detalleCompra.setPrecioActual(rs.getDouble("precioActual"));
                detalleCompra.setStock(rs.getInt("stock"));
                detalleCompra.setEstado(rs.getBoolean("estado"));

                if (!detalleCompra.isEstado()) {
                    JOptionPane.showMessageDialog(null, "El producto se encuentra en la lista pero está Inactivo.");
                }
            } else {
                System.out.println("El Producto no se encontró en la lista.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto.");
        }

        return detalleCompra;
    }

    public Producto buscarProductoPorNombre(String nombre) {
        String sql = "SELECT id_producto, nombre, descripcion, precioActual, stock, estado FROM producto WHERE nombre=?";
        Producto producto = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                int id = rs.getInt("id_producto");
                producto.setIdProducto(id);
                producto.setNombreProducto(nombre);
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));

                if (!producto.isEstado()) {
                    JOptionPane.showMessageDialog(null, "El producto se encuentra en la lista pero está inactivo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no se encontró en la lista.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto.");
        }

        return producto;
    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombre = ?, descripcion = ?, precioActual = ?, stock = ?, estado = ?"
                + " WHERE id_producto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }

    public void dadaDeBajaProducto(int id) {

        String sql = "UPDATE producto SET estado = 0 WHERE id_producto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Dado de Baja");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }

    }

    public void eliminarProductoPorIdYNombre(int id, String nombre) {
        String sql = "DELETE FROM producto WHERE id_producto = ? AND nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }

    public List<Producto> listarProductos() {

        String sql = "SELECT id_producto, nombre, descripcion, precioActual, stock, estado FROM producto WHERE estado = 1";
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("id_producto"));
                producto.setNombreProducto(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        return productos;
    }*/

}
