package proveMaxGrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proveMaxGrupo64.Entidades.Producto;


public class productoData {

    private Connection con = null;

    public productoData() {

        con = Conexion.getConexion();
    }
    
    public static final int ERROR_SQL_PRODUCTO_DUPLICADO = 1062;

    
    public void guardarProducto(Producto producto) {
        
        String sql = "INSERT INTO producto(id_producto, nombre, descripcion, precioActual, stock, estado)"
                + "VALUES(?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecioActual());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Guardado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == ERROR_SQL_PRODUCTO_DUPLICADO) {
                JOptionPane.showMessageDialog(null, "El producto que intenta guardar, ya existe.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
        
        }

    }


public Producto buscarProductoPorId(int id) {
    
    String sql = "SELECT id_producto, nombre, descripcion, precioActual, stock, estado FROM producto WHERE id_producto=?";
    Producto producto = null;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            producto = new Producto();
            producto.setIdProducto(id);
            producto.setNombreProducto(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));

            if (!producto.isEstado()) {
                JOptionPane.showMessageDialog(null, "El producto se encuentra en la lista pero está Inactivo.");
            }
        } else {
            System.out.println("El Producto no se encontró en la lista.");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto.");
    }

    return producto;
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
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
    }

    public void dadaDeBajaMateria(int id) {

        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Dada de Baja");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public void eliminarMateriaPorIdYNombre(int id, String nombre) {
        String sql = "DELETE FROM materia WHERE idMateria = ? AND nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public List<Materia> listarMateria() {

        String sql = "SELECT idMateria, nombre, año, estado FROM materia WHERE estado = 1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);

                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return materias;
    }

}
