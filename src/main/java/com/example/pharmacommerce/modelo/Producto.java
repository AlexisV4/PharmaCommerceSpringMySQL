
package com.example.pharmacommerce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Indicamos que Producto es una entidad
@Table(name = "productos") // Indicamos a JPA que la clase Producto está mapeada a la tabla llamada "productos" en la base de datos.
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;
    
    private String nombre;
    private String descripcion;
    private int precio_venta;
    private int id_proveedor;
    private int stock;
    private String fecha_vencimiento;
    private int id_categoria;

    public Producto() {
    }

    public Producto(int id_producto, String nombre, String descripcion, int precio_venta, int id_proveedor, int stock, String fecha_vencimiento, int id_categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.id_proveedor = id_proveedor;
        this.stock = stock;
        this.fecha_vencimiento = fecha_vencimiento;
        this.id_categoria = id_categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
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

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
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

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
}
