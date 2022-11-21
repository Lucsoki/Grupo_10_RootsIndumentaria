package com.example.Grupo_10_Indumentaria.Servicios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Entidades.Producto;
import com.example.Grupo_10_Indumentaria.Repositorios.BaseRepositorio;
import com.example.Grupo_10_Indumentaria.Repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends BaseServicioImpl<Producto,Long>{
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public ProductoServicioImpl(BaseRepositorio<Producto, Long> baseRepositorio) {
        super(baseRepositorio);
    }

    /*public List<Producto> search(String filtro) throws Exception {
        try {
            //List<Producto> prductos = productoRepositorio.findByNombreContainingOrColorContaining(filtro, filtro);
            //List<Producto> prductos= productoRepositorio.search(filtro);
            List<Producto> prductos= productoRepositorio.searchNativo(filtro);
            return prductos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Producto> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Producto> prductos = productoRepositorio.findByNombreContainingOrColorContaining(filtro, filtro, pageable);
            //Page<Producto> prductos= productoRepositorio.search(filtro, pageable);
            Page<Producto> prductos= productoRepositorio.searchNativo(filtro, pageable);
            return prductos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }*/
}
