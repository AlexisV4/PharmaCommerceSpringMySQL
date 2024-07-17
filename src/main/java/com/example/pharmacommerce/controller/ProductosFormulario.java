package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.modelo.Producto;
import com.example.pharmacommerce.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ProductosFormulario {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductosFormulario(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }
}
