
package com.example.pharmacommerce.controller.compras;

import com.example.pharmacommerce.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eliminar-compra")
public class EliminarCompraController {
    
    private final CompraRepository compraRepository;
    
    @Autowired
    public EliminarCompraController(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }
    
    // Endpoint para eliminar una compra por su ID
    @DeleteMapping("/{id}")
    public void eliminarCompra(@PathVariable Integer id) {
        compraRepository.deleteById(id);
    }
    
}
