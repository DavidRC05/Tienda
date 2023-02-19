
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController{
    
    @Autowired
    
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora Utilizando MVC");
        
        /*
        String mensaje = "Estamos en semana 4, Saludos!";
        model.addAttribute("MensajeSaludo", mensaje);
        
        Cliente cliente = new Cliente("David","Rodriguez","davidrocas04@outlook.com","88228833");
        Cliente cliente2 = new Cliente("Arturo","Chaves","achaves455@outlook.com","26347263");
        Cliente cliente3 = new Cliente("Matias","Jimenez","mathiasj@outlook.com","66332288");

        //model.addAttribute("cliente", cliente);
        
        List<Cliente> clientes=Arrays.asList(cliente,cliente2, cliente3);
        
        model.addAttribute("clientes", clientes); */
        
        var clientes=clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }

}

