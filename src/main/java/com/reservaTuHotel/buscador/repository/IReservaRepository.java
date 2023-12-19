
package com.reservaTuHotel.buscador.repository;

import com.reservaTuHotel.buscador.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservaRepository extends JpaRepository <Reserva, Long> {
    
}
