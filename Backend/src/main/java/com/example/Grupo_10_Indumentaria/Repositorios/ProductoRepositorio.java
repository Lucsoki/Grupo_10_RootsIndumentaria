package com.example.Grupo_10_Indumentaria.Repositorios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Entidades.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends BaseRepositorio<Producto, Long> {

    /*List<Producto> findByNombreContainingOrColorContaining(String nombre, String color);
    Page<Producto> findByNombreContainingOrColorContaining(String nombre, Pageable pageable);

    //boolean existsByDni(int dni);

    @Query(value = "SELECT p FROM producto p WHERE p.nombre LIKE %:filtro%")
    List<Producto> search(@Param("filtro") String filtro);
    @Query(value = "SELECT p FROM producto p WHERE p.nombre LIKE %:filtro% OR p.color LIKE %:filtro%")
    Page<Producto> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM producto WHERE producto.nombre LIKE %:filtro% OR producto.color LIKE %:filtro%"
            , nativeQuery = true)
    List<Producto> searchNativo(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM producto WHERE producto.nombre LIKE %:filtro% OR producto.color LIKE %:filtro%"
            ,countQuery = "SELECT count(*) FROM producto", nativeQuery = true)
    Page<Producto> searchNativo(@Param("filtro") String filtro, Pageable pageable);*/
}
