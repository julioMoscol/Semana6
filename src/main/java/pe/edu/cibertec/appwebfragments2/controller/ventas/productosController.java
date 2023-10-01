package pe.edu.cibertec.appwebfragments2.controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/productos")
public class productosController {

    @GetMapping("/registrarProductos")
    public String registroProducto(){
        return "ventas/productos";
    }
    @GetMapping("/clientes")
    public String clientes(){
        return "ventas/clientes";
    }
    @GetMapping("/reportes")
    public String reportes(){
        return "ventas/reportes";
    }
}
