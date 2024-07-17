
package com.example.pharmacommerce.controller.compras;

import com.example.pharmacommerce.modelo.Compras;
import com.example.pharmacommerce.repository.CompraRepository;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActualizarCompraController {
    
    @Autowired
    private CompraRepository compraRepository;
        
    @PostMapping("/actualizar-compra")
    public ResponseEntity<String> actualizarCompra(
            @RequestParam Integer id_compra,
            @RequestParam String campo,
            @RequestParam String nuevoValor) {
        
        if (!compraRepository.existsById(id_compra)) {
            return ResponseEntity.status(404).body("Compra no encontrada");
        }
        
        Compras compras = compraRepository.findById(id_compra).orElse(null);
        
        if (compras == null) {
            return ResponseEntity.status(404).body("Compra no encontrada");
        }
        
        try {
            switch (campo.toLowerCase()) { 
                case "id_compra":
                    compras.setId_compra(Integer.parseInt(nuevoValor));
                    break;
                case "cantidad":
                    compras.setCantidad(Integer.parseInt(nuevoValor));
                    break;
                case "total_pagar":
                    compras.setTotal_pagar(Integer.parseInt(nuevoValor));
                    break;
                case "id_empleado":
                    compras.setId_empleado(Integer.parseInt(nuevoValor));
                    break;
                case "fecha_compra":
                    compras.setFecha_compra(LocalDate.parse(nuevoValor));
                    break;
                case "id_metodo_pago":
                    compras.setId_metodo_pago(Integer.parseInt(nuevoValor));
                    break;
                case "id_proveedor":
                    compras.setId_proveedor(Integer.parseInt(nuevoValor));
                    break;
                default:
                    return ResponseEntity.badRequest().body("Campo no válido");
            }
            
            compraRepository.save(compras);
            return ResponseEntity.ok("Compra actualizada exitosamente");
        } catch (NumberFormatException | DateTimeParseException e) {
            return ResponseEntity.badRequest().body("Error al actualizar compra: " + e.getMessage());
        }
    }
}

