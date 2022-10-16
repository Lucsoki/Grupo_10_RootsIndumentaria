package com.example.rootsindumentaria.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mercancia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mercancia extends Base{

    @Column(name = "stock")
    private int stock;

    @OneToMany(mappedBy = "productos")
    private List<Producto> productos = new ArrayList<Producto>();

}