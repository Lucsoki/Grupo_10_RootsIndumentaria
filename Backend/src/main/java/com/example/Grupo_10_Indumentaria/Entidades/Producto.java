package com.example.Grupo_10_Indumentaria.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Producto extends Base {

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Precio")
    private float precio;

    @Column(name = "Talla")
    private String talla;

    @Column(name = "Color")
    private String color;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
}
