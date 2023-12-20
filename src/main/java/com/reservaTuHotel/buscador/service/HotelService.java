
package com.reservaTuHotel.buscador.service;

import com.reservaTuHotel.buscador.model.Hotel;
import com.reservaTuHotel.buscador.repository.IHotelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private IHotelRepository hotelRepo;
    
    @Override
    public List<Hotel> traerHoteles() {
        return hotelRepo.findAll();
    }

    @Override
    public void crearHotel(Hotel hotel) {
        hotelRepo.save(hotel);
    }

    @Override
    public void borrarHotel(Long id) {
        hotelRepo.deleteById(id);
    }

    @Override
    public Hotel buscarHotel(Long id) {
        Hotel hotel = hotelRepo.findById(id).orElse(null);
        return hotel;
    }

    @Override
    public void editarHotel(Long id, String nombreNuevo, String ubicNuevo, String servicioNuevo, int califNuevom, List habitacionNuevo, List reservaNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
