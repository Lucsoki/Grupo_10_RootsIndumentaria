package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Entidades.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductoServicio extends BaseServicio<Producto, Long>{

    List<Producto> search (String filtro) throws Exception;

    Page<Producto> search (String filtro, Pageable pageable) throws Exception;
}
