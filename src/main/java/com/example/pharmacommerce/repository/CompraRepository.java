
package com.example.pharmacommerce.repository;

import com.example.pharmacommerce.modelo.Compras;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompraRepository extends JpaRepository<Compras, Integer> {
    
    List<Compras> findByInformacionProductoContaining(String terminoBusqueda);
    
}

