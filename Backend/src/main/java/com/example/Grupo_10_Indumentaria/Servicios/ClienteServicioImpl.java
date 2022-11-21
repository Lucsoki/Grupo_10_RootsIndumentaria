package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Cliente;
import com.example.Grupo_10_Indumentaria.Repositorios.BaseRepositorio;
import com.example.Grupo_10_Indumentaria.Repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImpl extends BaseServicioImpl<Cliente, Long> {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public ClienteServicioImpl(BaseRepositorio<Cliente, Long> baseRepositorio) {
        super(baseRepositorio);
    }


    public List<Cliente> search(String filtro) throws Exception {
        try {
            //List<Cliente> clientes = clienteRepositorio.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Cliente> clientes= clienteRepositorio.search(filtro);
            List<Cliente> clientes= clienteRepositorio.searchNativo(filtro);
            return clientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Cliente> clientes = clienteRepositorio.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Cliente> clientes= clienteRepositorio.search(filtro, pageable);
            Page<Cliente> clientes= clienteRepositorio.searchNativo(filtro, pageable);
            return clientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
