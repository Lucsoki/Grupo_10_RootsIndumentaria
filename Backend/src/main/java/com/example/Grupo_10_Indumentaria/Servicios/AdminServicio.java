package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Entidades.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdminServicio extends BaseServicio<Admin, Long>{

    List<Admin> search (String filtro) throws Exception;

    Page<Admin> search (String filtro, Pageable pageable) throws Exception;
}
