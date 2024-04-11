
package com.example.pharmacommerce.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Indicamos que Producto es una entidad
@Table(name = "productos") // Indicamos a JPA que la clase Producto está mapeada a la tabla llamada "productos" en la base de datos.
public class Producto {
    @Id
    private String id_producto;
    private String nombre;
    private String descripcion;
    private int precio_venta;
    private String id_proveedor;
    private int stock;
    private String fecha_vencimiento;
    private String id_categoria;

    public Producto() {
    }

    public Producto(String id_producto, String nombre, String descripcion, int precio_venta, String id_proveedor, int stock, String fecha_vencimiento, String id_categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.id_proveedor = id_proveedor;
        this.stock = stock;
        this.fecha_vencimiento = fecha_vencimiento;
        this.id_categoria = id_categoria;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
}
