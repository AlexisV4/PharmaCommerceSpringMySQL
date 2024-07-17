
package com.example.pharmacommerce.controller.compras;

import com.example.pharmacommerce.modelo.Compras;
import com.example.pharmacommerce.repository.CompraRepository;
import com.example.pharmacommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearComprasController {
    
    @Autowired
    private CompraRepository compraRepository;
  
    @PostMapping(value = "/crearCompras", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        public ResponseEntity<String> crearCompra(@ModelAttribute Compras compra){
        compraRepository.save(compra);
        return ResponseEntity.ok("Compra creada exitosamente");
    }
    
    
}
