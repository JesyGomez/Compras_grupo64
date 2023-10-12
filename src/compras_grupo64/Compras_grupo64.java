package compras_grupo64;

import java.sql.Connection;
import java.time.LocalDate;
import proveMaxGrupo64.AccesoADatos.CompraData;
import proveMaxGrupo64.AccesoADatos.Conexion;
import proveMaxGrupo64.AccesoADatos.DetalleCompraData;
import proveMaxGrupo64.AccesoADatos.ProductoData;
import proveMaxGrupo64.AccesoADatos.ProveedorData;
import proveMaxGrupo64.Entidades.Compra;
import proveMaxGrupo64.Entidades.DetalleCompra;
import proveMaxGrupo64.Entidades.Producto;
import proveMaxGrupo64.Entidades.Proveedor;

public class Compras_grupo64 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        //Compra comp = new Compra (0, proveedor, LocalDate.MIN);
        CompraData compra = new CompraData();
        //compra.registrarCompra(comp);
        //Producto tv = new Producto("DELL", "NoteBook", 600000, 2, true);
        ProductoData produ = new ProductoData();
        //produ.guardarProducto(tv);

        //Producto productoEncontrado = produ.buscarProductoPorId(1);
        // if (productoEncontrado != null) {
        //    System.out.println("IdProducto: " + productoEncontrado.getIdProducto());
        //   System.out.println("Nombre: " + productoEncontrado.getNombreProducto());
        //}
        /*
           Producto productoEncontrado = produ.buscarProductoPorNombre("Sony");
        if (productoEncontrado != null) {
            System.out.println("IdProducto: " + productoEncontrado.getIdProducto());
            System.out.println("Nombre: " + productoEncontrado.getNombreProducto());
            
        }
         */
        // produ.eliminarProductoPorIdYNombre(1, "Sony");
        //produ.dadaDeBajaProducto(2);

        /*
        for (Producto producto : produ.listarProductos()) {
            System.out.println("nombre" + producto.getNombreProducto());
        }
         */
        //Proveedor prieto = new Proveedor("3455", "Avenida Savio 1234", "3345987877");
        //ProveedorData prove = new ProveedorData();
        //prove.guardarProveedor(prieto);
        //prove.modificarProveedor(prieto);
        //prove.eliminarProveedor(10);
//        Proveedor prove = new Proveedor(1, "Bazar S.A.", "Calle Pepita 123, Ciudad Marcos Paz", "123456789");
//        Producto prod = produ.buscarProductoPorId(3);
//        Compra cpr = new Compra(1, prove, LocalDate.MIN);
        DetalleCompra dc = new DetalleCompra();
        DetalleCompraData dcd = new DetalleCompraData();

        dc = dcd.buscarDetalleCompraPorId(6);
        System.out.println("ID " + dc.getIdDetalle() + " ID COMPRA " + dc.getCompra().getIdCompra() + " ID PRODUCTO "
                + dc.getProducto().getIdProducto()
                + " CANTIDAD " + dc.getCantidad() + " PRECIO COSTO " + dc.getPrecioCosto());

    }

}
