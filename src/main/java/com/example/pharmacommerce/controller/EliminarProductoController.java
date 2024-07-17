
package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eliminar-producto")
public class EliminarProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public EliminarProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Endpoint para eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Integer id) {
        productoRepository.deleteById(id);
    }
}