
package proveMaxGrupo64.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proveMaxGrupo64.Entidades.Proveedor;

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {

        con = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor proveedor) {

        String sql = "INSERT INTO proveedor (id_proveedor, razonSocial, domicilio, telefono)"
                + "VALUE(? , ? , ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proveedor.getIdProveedor());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getTelefono());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor agregado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor" + ex.getMessage());
        }
    }

    public void modificarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET id_proveedor = ?, razonSocial = ?, domicilio = ?, telefono = ?"
                + "WHERE id_proveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getTelefono());
            ps.setInt(5, proveedor.getIdProveedor());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado exitosamente!");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Proveedor" + ex.getMessage());
        }
    }

    public void eliminarProveedor(int id) {
        String sql = "DELETE FROM proveedor WHERE id_proveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Proveedor Eliminado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor" + ex.getMessage());
        }
    }

    public Proveedor buscarProveedor(int id) {
        String sql = "SELECT id_proveedor, razonSocial, domicilio, telefono FROM proveedor WHERE id_proveedor = ?";
        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getNString("domicilio"));
                proveedor.setTelefono(rs.getNString("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un proveedor con ese Id");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proveedor;
    }

    public Proveedor buscarProveedorPorRazonSocial(int razon) {
        String sql = "SELECT id_proveedor, razonSocial, domicilio, telefono FROM proveedor WHERE razonSocial = ?";
        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, razon);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("id_proveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getNString("domicilio"));
                proveedor.setTelefono(rs.getNString("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un proveedor con esa razon social");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proveedor;
    }

    public List<Proveedor> listarProveedores() {
        String sql = "SELECT id_proveedor, razonSocial, domicilio, telefono FROM proveedor";
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("id_proveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getNString("domicilio"));
                proveedor.setTelefono(rs.getNString("telefono"));
               
                
                proveedores.add(proveedor);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de Proveedores");
        }
        return proveedores;
    }

}
