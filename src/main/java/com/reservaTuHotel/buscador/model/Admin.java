
package com.reservaTuHotel.buscador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Admin {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_admin;
    private String usuario;
    private String contraseña;
    private String correo;
    private Roles rol;
}
