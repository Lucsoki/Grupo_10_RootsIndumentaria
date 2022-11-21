package com.example.Grupo_10_Indumentaria.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Admin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Admin extends Base {

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Mail")
    private String mail;
    @Column(name = "Contraseña", length = 30)
    private String contrasena;

}
