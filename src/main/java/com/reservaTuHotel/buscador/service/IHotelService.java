
package com.reservaTuHotel.buscador.service;

import com.reservaTuHotel.buscador.model.Hotel;
import java.util.List;


public interface IHotelService {
    
    public List<Hotel> traerHoteles();
    public void crearHotel(Hotel hotel);
    public void borrarHotel(Long id);
    public Hotel buscarHotel(Long id);
    public void editarHotel(Long id, String nombreNuevo, String ubicNuevo, String servicioNuevo, int califNuevom, List habitacionNuevo, List reservaNuevo);
    
}
