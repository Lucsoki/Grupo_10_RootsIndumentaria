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
@Table(name = "Mercancia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Mercancia extends Base {

    @Column(name = "Stock")
    private int stock;

    @OneToMany
    @JoinColumn(name = "FK_Producto")
    private List<Producto> productos= new ArrayList<Producto>();
}
