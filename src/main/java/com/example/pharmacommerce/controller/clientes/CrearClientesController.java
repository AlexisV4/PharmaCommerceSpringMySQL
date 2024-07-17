
package com.example.pharmacommerce.controller.clientes;

import com.example.pharmacommerce.modelo.Cliente;
import com.example.pharmacommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearClientesController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @PostMapping(value = "/crearClientes", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        public ResponseEntity<String> crearCliente(@ModelAttribute Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.ok("Cliente creado exitosamente");
    }
    
}
