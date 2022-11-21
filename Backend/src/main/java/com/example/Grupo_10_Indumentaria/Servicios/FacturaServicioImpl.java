package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Factura;
import com.example.Grupo_10_Indumentaria.Repositorios.BaseRepositorio;
import com.example.Grupo_10_Indumentaria.Repositorios.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServicioImpl extends BaseServicioImpl<Factura, Long>{
    @Autowired
    private FacturaRepositorio facturaRepositorio;

    public FacturaServicioImpl(BaseRepositorio<Factura, Long> baseRepositorio) {
        super(baseRepositorio);
    }

}
