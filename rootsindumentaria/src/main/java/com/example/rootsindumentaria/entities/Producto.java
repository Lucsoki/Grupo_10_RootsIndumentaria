package com.example.rootsindumentaria.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private float precio;

    @Column(name = "talla")
    private String talla;

    @Column(name = "color")
    private String color;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "producto")
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
}
