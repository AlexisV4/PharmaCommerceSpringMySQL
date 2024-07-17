package com.example.pharmacommerce.controller;

import com.example.pharmacommerce.modelo.Producto;
import com.example.pharmacommerce.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuscarProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @PostMapping("/buscar-producto")
    public String buscarProducto(@RequestParam String termino_busqueda, Model model){
        // Aquí se implementa la lógica para buscar productos en el repositorio
        List<Producto> productosEncontrados = productoRepository.findByNombreContaining(termino_busqueda);
        
        // Agregar los productos encontrados al modelo
        model.addAttribute("productos", productosEncontrados);
        
        // Devolver el nombre de la vista a mostrar
        return "resultados-busqueda-productos";
    }
    
}