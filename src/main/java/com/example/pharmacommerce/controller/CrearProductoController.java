package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.repository.ProductoRepository;
import com.example.pharmacommerce.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;

@RestController
public class CrearProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @PostMapping(value = "/productos", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> crearProducto(@ModelAttribute Producto producto){
        productoRepository.save(producto);
        return ResponseEntity.ok("Producto creado exitosamente");
    }
    
}