package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.repository.ProductoRepository;
import com.example.pharmacommerce.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActualizarProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/actualizar-producto") //Se usa POST ya que HTML no admite PUT de forma nativa
    public ResponseEntity<String> actualizarProducto(
            @RequestParam Integer idProducto, //Estos parametros se obtienes del NAME configurado en los campos del HTML. Deben ser iguales
            @RequestParam String campo,
            @RequestParam String nuevoValor) {

        if (!productoRepository.existsById(idProducto)) {
            return ResponseEntity.status(404).body("Producto no encontrado");
        }

        Producto producto = productoRepository.findById(idProducto).orElse(null);

        if (producto == null) {
            return ResponseEntity.status(404).body("Producto no encontrado");
        }
        
        //El orden de los casos del SWITCH debe coincidir en el orden que los campos del HTML, sino saca error.
        switch (campo.toLowerCase()) { 
            case "id_producto":
                producto.setId_producto((int) Double.parseDouble(nuevoValor));
                break;
            case "nombre":
                producto.setNombre(nuevoValor);
                break;
            case "descripcion":
                producto.setDescripcion(nuevoValor);
                break;
            case "precio_venta":
                producto.setPrecio_venta((int) Double.parseDouble(nuevoValor));
                break;
            case "stock":
                producto.setStock(Integer.parseInt(nuevoValor));
                break;
            case "fecha_vencimiento":
                producto.setFecha_vencimiento(nuevoValor);
                break;
            case "id_categoria":
                producto.setId_categoria((int) Double.parseDouble(nuevoValor));
                break;
            case "id_proveedor":
                producto.setId_categoria((int) Double.parseDouble(nuevoValor));
                break;
            default:
                return ResponseEntity.badRequest().body("Campo no válido");
        }

        productoRepository.save(producto);
        return ResponseEntity.ok("Producto actualizado exitosamente");
    }
}