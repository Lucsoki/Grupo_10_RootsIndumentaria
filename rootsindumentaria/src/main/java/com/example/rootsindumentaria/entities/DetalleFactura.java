package com.example.rootsindumentaria.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_factura")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DetalleFactura extends Base {


    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private int subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_factura")
    private Factura factura;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_producto")
    private Producto producto;


}