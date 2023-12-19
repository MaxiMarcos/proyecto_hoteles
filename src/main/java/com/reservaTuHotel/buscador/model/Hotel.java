
package com.reservaTuHotel.buscador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Hotel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_hotel;
    private String nombre;
    private String ubicacion;
    private String servicios;
    private int calificacion;
    @OneToMany
    private List<Habitacion> unaHabitacion;
    @OneToMany
    private List<Reserva> unaReserva;
   
}
