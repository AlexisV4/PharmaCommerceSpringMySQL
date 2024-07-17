
package com.example.pharmacommerce.controller.compras;

import com.example.pharmacommerce.modelo.Compras;
import com.example.pharmacommerce.repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuscarCompraController {
    
    @Autowired
    private CompraRepository compraRepository;
    
    @PostMapping("/buscar-compra")
    public String buscarCompra(@RequestParam String termino_busqueda, Model model){
        // Aquí se implementa la lógica para buscar productos en el repositorio
    List<Compras> comprasEncontradas = compraRepository.findByInformacionProductoContaining(termino_busqueda);
        
        // Agregar los productos encontrados al modelo
    model.addAttribute("compras", comprasEncontradas);
        
        // Devolver el nombre de la vista a mostrar
    return "resultados-busqueda-compras";
    }
    
}
