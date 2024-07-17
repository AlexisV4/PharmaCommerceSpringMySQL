
package com.example.pharmacommerce.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity //Indicamos que Producto es una entidad
@Table(name = "compras") // Indicamos a JPA que la clase Producto está mapeada a la tabla llamada "productos" en la base de datos.
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private int id_compra;
    
    @Column(name = "informacion_producto")
    private String informacionProducto;
    
    private int cantidad;
    private int total_pagar;
    private int id_empleado;
    private LocalDate fecha_compra;
    private int id_metodo_pago;
    private int id_proveedor;

    public Compras() {
    }

    public Compras(int id_compra, String informacionProducto, int cantidad, int total_pagar, int id_empleado, LocalDate fecha_compra, int id_metodo_pago, int id_proveedor) {
        this.id_compra = id_compra;
        this.informacionProducto = informacionProducto;
        this.cantidad = cantidad;
        this.total_pagar = total_pagar;
        this.id_empleado = id_empleado;
        this.fecha_compra = fecha_compra;
        this.id_metodo_pago = id_metodo_pago;
        this.id_proveedor = id_proveedor;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getInformacionProducto() {
        return informacionProducto;
    }

    public void setInformacionProducto(String informacionProducto) {
        this.informacionProducto = informacionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(int total_pagar) {
        this.total_pagar = total_pagar;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    
}
