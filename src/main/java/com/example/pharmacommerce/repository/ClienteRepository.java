
package com.example.pharmacommerce.repository;

import com.example.pharmacommerce.modelo.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    List<Cliente> findByNombreCompletoContaining(String terminoBusqueda);
    
}
