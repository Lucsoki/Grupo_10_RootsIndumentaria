package com.example.Grupo_10_Indumentaria.Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Factura")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Audited
public class Factura extends Base {

    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "Número")
    private int numero;
    @Column(name = "Total")
    private double total;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_Cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

}
