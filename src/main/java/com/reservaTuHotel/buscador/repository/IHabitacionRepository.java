
package com.reservaTuHotel.buscador.repository;

import com.reservaTuHotel.buscador.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabitacionRepository extends JpaRepository <Habitacion, Long> {
    
}
