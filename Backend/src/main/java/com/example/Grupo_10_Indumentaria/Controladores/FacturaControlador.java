package com.example.Grupo_10_Indumentaria.Controladores;

import com.example.Grupo_10_Indumentaria.Entidades.Factura;
import com.example.Grupo_10_Indumentaria.Servicios.FacturaServicioImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Facturas")
public class FacturaControlador extends BaseControladorImpl<Factura, FacturaServicioImpl>{

}
