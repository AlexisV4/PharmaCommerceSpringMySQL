
package com.example.pharmacommerce.repository;

import com.example.pharmacommerce.modelo.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    List<Producto> findByNombreContaining(String terminoBusqueda);
    
    
}
