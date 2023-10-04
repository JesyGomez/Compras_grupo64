package compras_grupo64;

import java.sql.Connection;
import proveMaxGrupo64.AccesoADatos.Conexion;
import proveMaxGrupo64.AccesoADatos.productoData;
import proveMaxGrupo64.Entidades.Producto;

public class Compras_grupo64 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        Producto tv = new Producto("Sony", "Smart tv", 1028, 10, true);
        productoData produ = new productoData();
        //produ.guardarProducto(tv);
        //produ.modificarProducto(tv);

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
    }

}
