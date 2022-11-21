package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Repositorios.AdminRepositorio;
import com.example.Grupo_10_Indumentaria.Repositorios.BaseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServicioImpl extends BaseServicioImpl<Admin, Long> {
    @Autowired
    private AdminRepositorio adminRepositorio;

    public AdminServicioImpl(BaseRepositorio<Admin, Long> baseRepositorio) {
        super(baseRepositorio);
    }

    /*public List<Admin> search(String filtro) throws Exception {
        try {
            //List<Admin> admins = adminRepositorio.findByNombreContainingOrMailContaining(filtro, filtro);
            //List<Admin> admins= adminRepositorio.search(filtro);
            List<Admin> admins= adminRepositorio.searchNativo(filtro);
            return admins;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Admin> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Admin> admins = adminRepositorio.findByNombreContainingOrMailContaining(filtro, filtro, pageable);
            //Page<Admin> admins= adminRepositorio.search(filtro, pageable);
            Page<Admin> admins= adminRepositorio.searchNativo(filtro, pageable);
            return admins;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }*/
}
