
package com.reservaTuHotel.buscador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Reserva {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_reserva;
    private String estado;
    private int fechaInicio;
    private int fechaFinal;
    private Cliente unCliente;
}
