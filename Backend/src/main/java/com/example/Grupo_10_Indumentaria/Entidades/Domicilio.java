package com.example.Grupo_10_Indumentaria.Entidades;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio extends Base {

    @Column(name = "Provincia")
    private String provincia;
    @Column(name = "Localidad")
    private String Localidad;
    @Column(name = "Calle")
    private String calle;
    @Column(name = "N°")
    private int numero;
}
