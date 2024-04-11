
package com.example.pharmacommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PharmaCommerceController {
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/productos")
    public String productos(){
        return "productos";
    }
    
    @RequestMapping("/compras")
    public String compras(){
        return "compras";
    }
    
    @RequestMapping("/clientes")
    public String clientes(){
        return "clientes";
    }
    
    @RequestMapping("/empleados")
    public String empleados(){
        return "empleados";
    }
    
    @RequestMapping("/proveedores")
    public String proveedores(){
        return "proveedores";
    }
    
    @RequestMapping("/categorias")
    public String categorias(){
        return "categorias";
    }
    
}
