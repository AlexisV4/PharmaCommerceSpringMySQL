package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.modelo.Producto;
import com.example.pharmacommerce.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuscarProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @PostMapping("/buscar-producto")
    public List<Producto> buscarProducto(@RequestParam String termino_busqueda){
        // Aquí deberías implementar la lógica para buscar productos en el repositorio
        List<Producto> productosEncontrados = productoRepository.findByNombreContaining(termino_busqueda);
        return productosEncontrados;
    }
    
}