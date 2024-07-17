package com.example.pharmacommerce.controller.clientes;

import com.example.pharmacommerce.modelo.Cliente;
import com.example.pharmacommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActualizarClientesController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @PostMapping("/actualizar-cliente")
    public ResponseEntity<String> actualizarCliente(
            @RequestParam Integer id_cliente,
            @RequestParam String campo,
            @RequestParam String nuevoValor) {
        
        if (!clienteRepository.existsById(id_cliente)) {
            return ResponseEntity.status(404).body("Cliente no encontrado");
        }
        
        Cliente cliente = clienteRepository.findById(id_cliente).orElse(null);
        
        if (cliente == null) {
            return ResponseEntity.status(404).body("Cliente no encontrado");
        }
        
        try {
            switch (campo.toLowerCase()) {
                case "id_cliente":
                    cliente.setId_cliente(Integer.parseInt(nuevoValor));
                    break;
                case "nombreCompleto":
                    cliente.setNombreCompleto(nuevoValor);
                    break;
                case "telefono":
                    cliente.setTelefono(nuevoValor);
                    break;
                case "correo":
                    cliente.setCorreo(nuevoValor);
                    break;
                case "direccion":
                    cliente.setDireccion(nuevoValor);
                    break;
                case "id_ciudad":
                    cliente.setId_ciudad(Integer.parseInt(nuevoValor));
                    break;
                case "id_genero":
                    cliente.setId_genero(Integer.parseInt(nuevoValor));
                    break;
                default:
                    return ResponseEntity.badRequest().body("Campo no válido");
            }
            
            clienteRepository.save(cliente);
            return ResponseEntity.ok("Cliente actualizado exitosamente");
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Error al actualizar cliente: " + e.getMessage());
        }
    }
}
