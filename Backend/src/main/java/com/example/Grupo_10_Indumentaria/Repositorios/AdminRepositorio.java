package com.example.Grupo_10_Indumentaria.Repositorios;

import com.example.Grupo_10_Indumentaria.Entidades.Admin;
import com.example.Grupo_10_Indumentaria.Entidades.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepositorio extends BaseRepositorio <Admin, Long> {
    List<Admin> findByNombreContainingOrMailContaining(String nombre, String mail);
    Page<Admin> findByNombreContainingOrMailContaining(String nombre, Pageable pageable);

    //boolean existsByDni(int dni);

    @Query(value = "SELECT a FROM admin a WHERE a.nombre LIKE %:filtro%")
    List<Admin> search(@Param("filtro") String filtro);
    @Query(value = "SELECT a FROM admin a WHERE a.nombre LIKE %:filtro% OR a.mail LIKE %:filtro%")
    Page<Admin> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM admin WHERE admin.nombre LIKE %:filtro% OR admin.mail LIKE %:filtro%"
            , nativeQuery = true)
    List<Admin> searchNativo(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM admin WHERE admin.nombre LIKE %:filtro% OR admin.mail LIKE %:filtro%"
            ,countQuery = "SELECT count(*) FROM admin", nativeQuery = true)
    Page<Admin> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
