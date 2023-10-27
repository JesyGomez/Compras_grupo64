package proveMaxGrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        String sql = "INSERT INTO detallecompra(id_compra, id_producto, cantidad, precioCosto) \n"
                + "VALUES (?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dc.getCompra().getIdCompra());
            ps.setInt(2, dc.getProducto().getIdProducto());
            ps.setInt(3, dc.getCantidad());
            ps.setDouble(4, dc.getPrecioCosto());

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
public DetalleCompra obtenerUltimoDetalleCompra() {
    DetalleCompra ultimoDetalleCompra = null;
    String sql = "SELECT * FROM detallecompra ORDER BY id_detalle DESC LIMIT 1";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int idDetalleCompra = rs.getInt("id_detalle");
            int idCompra = rs.getInt("id_compra");
            int idProducto = rs.getInt("id_producto");
            int cantidad = rs.getInt("cantidad");
            double precioCosto = rs.getDouble("precioCosto");

            CompraData compra = new CompraData();
                    compra.buscarCompraPorId(idCompra);

            ProductoData producto = new ProductoData();
                    producto.buscarProductoPorId(idCompra);

            ultimoDetalleCompra = new DetalleCompra(idDetalleCompra, cantidad, precioCosto, compra, producto);
        }

        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener datos de la tabla Detalle de Compra: " + ex.getMessage());
    }

    return ultimoDetalleCompra;
}
    public DetalleCompra buscarDetalleCompraPorId(int id) {

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
                Compra cp = cd.buscarCompraPorId(rs.getInt("id_compra"));
                detalleCompra.setCompra(cp);
                Producto pro = pd.buscarProductoPorId(rs.getInt("id_producto"));
                detalleCompra.setProducto(pro);
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));

            } else {
                System.out.println("El Detalle de Compra no se encontró en la lista.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle de Compra.");
        }

        return detalleCompra;
    }

    public void modificarDetalleCompra(DetalleCompra deta) {

        String sql = "UPDATE detallecompra SET id_compra = ?, id_producto = ?,cantidad = ?, precioCosto = ?"
                + " WHERE  id_detalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, deta.getCompra().getIdCompra());
            ps.setInt(2, deta.getProducto().getIdProducto());
            ps.setInt(3, deta.getCantidad());
            ps.setDouble(4, deta.getPrecioCosto());
            ps.setInt(5, deta.getIdDetalle());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Detalle de Compra Modificada");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle de Compras");
        }

    }

    public void actualizarcantidad(int idDetalle, int cantidad) {
        String sql = "UPDATE  detallecompra SET cantidad = ? WHERE  idDetalle = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, idDetalle);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setDouble(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla");
        }
    }

    public List<DetalleCompra> listarDetallesCompra() {
        String sql = "SELECT id_detalle, id_compra, id_producto, cantidad, precioCosto FROM detallecompra";
        List<DetalleCompra> detallesCompra = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("id_detalle"));
                //detalleCompra.setIdCompra(rs.getInt("id_compra"));
                //detalleCompra.setIdProducto(rs.getInt("id_producto"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));

                detallesCompra.add(detalleCompra);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle de Compra");
        }

        return detallesCompra;
    }

    /*public void modificarDetalleCompra(DetalleCompra dc) {

        String sql = "UPDATE detallecompra SET nombre = ?, descripcion = ?, precioActual = ?, stock = ?, estado = ?"
                + " WHERE id_producto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dc.getNombreProducto());
            ps.setString(2, dc.getDescripcion());
            ps.setDouble(3, dc.getPrecioActual());
            ps.setInt(4, dc.getStock());
            ps.setBoolean(5, dc.isEstado());
            ps.setInt(6, dc.getIdProducto());

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

