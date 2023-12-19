
package com.reservaTuHotel.buscador.repository;

import com.reservaTuHotel.buscador.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHotelRepository extends JpaRepository <Hotel, Long> {
    
}
