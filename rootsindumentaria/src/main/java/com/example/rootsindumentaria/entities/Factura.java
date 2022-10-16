package com.example.rootsindumentaria.entities;

import lombok.*;
import lombok.Builder.Default;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Factura extends Base {


    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "numero")
    private int numero;

    @Column(name = "total")
    private int total;

    @ManyToOne/*(cascade = CascadeType.PERSIST)*/
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;


    @OneToMany(mappedBy = "factura",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detalle = new ArrayList<DetalleFactura>();

}