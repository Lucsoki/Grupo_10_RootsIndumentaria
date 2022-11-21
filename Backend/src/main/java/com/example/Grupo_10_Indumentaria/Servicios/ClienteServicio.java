package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteServicio extends BaseServicio<Cliente, Long>{

    List<Cliente> search (String filtro) throws Exception;

    Page<Cliente> search (String filtro, Pageable pageable) throws Exception;


}
