package proveMaxGrupo64.Entidades;

import java.sql.Date;
import java.time.LocalDate;

public class Compra {

    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public Compra(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha.toLocalDate();
    }

    @Override
    public String toString() {
        return "ID Compra: " + idCompra + ", Proveedor: " + proveedor + ", Fecha: " + fecha;
    }

}
