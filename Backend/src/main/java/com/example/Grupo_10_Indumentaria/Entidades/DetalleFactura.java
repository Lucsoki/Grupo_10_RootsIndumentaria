package com.example.Grupo_10_Indumentaria.Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Detalle_Factura")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Audited
public class DetalleFactura extends Base {

    @Column(name = "Cantidad")
    private int cantidad;

    @Column(name = "Subtotal")
    private double subtotal;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_Factura")
    private Factura factura;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_Producto")
    private Producto producto;
}
