
package com.example.pharmacommerce.controller.compras;

import com.example.pharmacommerce.modelo.Compras;
import com.example.pharmacommerce.repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compras")
public class ComprasFormulario {
    private final CompraRepository compraRepository;

    @Autowired
    public ComprasFormulario(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @GetMapping
    public List<Compras> getAllCompras() {
        return compraRepository.findAll();
    }
    
}
