
package com.example.pharmacommerce.controller.clientes;

import com.example.pharmacommerce.modelo.Cliente;
import com.example.pharmacommerce.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuscarClientesController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @PostMapping("/buscar-cliente")
    public String buscarCliente(@RequestParam String termino_busqueda, Model model){
        // Aquí se implementa la lógica para buscar productos en el repositorio
    List<Cliente> clientesEncontrados = clienteRepository.findByNombreCompletoContaining(termino_busqueda);
        
        // Agregar los productos encontrados al modelo
    model.addAttribute("clientes", clientesEncontrados);
        
        // Devolver el nombre de la vista a mostrar
    return "resultados-busqueda-clientes";
    }
    
    
}
