package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.DetalleFactura;
import com.example.Grupo_10_Indumentaria.Repositorios.BaseRepositorio;
import com.example.Grupo_10_Indumentaria.Repositorios.DetalleFacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServicioImpl extends BaseServicioImpl<DetalleFactura, Long>{
    @Autowired
    private DetalleFacturaRepositorio detalleFacturaRepositorio;

    public DetalleFacturaServicioImpl(BaseRepositorio<DetalleFactura, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
