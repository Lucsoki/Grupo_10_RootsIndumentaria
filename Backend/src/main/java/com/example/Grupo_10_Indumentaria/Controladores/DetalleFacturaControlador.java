package com.example.Grupo_10_Indumentaria.Controladores;

import com.example.Grupo_10_Indumentaria.Entidades.DetalleFactura;
import com.example.Grupo_10_Indumentaria.Servicios.DetalleFacturaServicioImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/DetalleFacturas")
public class DetalleFacturaControlador extends BaseControladorImpl<DetalleFactura, DetalleFacturaServicioImpl> {

}

