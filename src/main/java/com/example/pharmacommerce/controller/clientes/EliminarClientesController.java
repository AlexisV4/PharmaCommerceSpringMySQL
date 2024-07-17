
package com.example.pharmacommerce.controller.clientes;

import com.example.pharmacommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eliminar-cliente")
public class EliminarClientesController {
    
    private final ClienteRepository clienteRepository;
    
    @Autowired
    public EliminarClientesController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    // Endpoint para eliminar una compra por su ID
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
    }
    
}
