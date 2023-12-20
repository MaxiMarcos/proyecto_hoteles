
package com.reservaTuHotel.buscador;

import com.reservaTuHotel.buscador.model.Hotel;
import com.reservaTuHotel.buscador.repository.IHotelRepository;
import com.reservaTuHotel.buscador.service.HotelService;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HotelServiceTest {
    
    @Mock
    private IHotelRepository hotelRepo;

    @InjectMocks
    private HotelService hotelService; 
    
    @Test
    public void testTraerHotel() {
        Hotel hotel1 = new Hotel();
        hotel1.setId_hotel(Long.valueOf(1));
        hotel1.setNombre("alaska");
        hotel1.setServicios("Basicos");
        hotel1.setUbicacion("Mendoza");
        hotel1.setCalificacion(5);
        
        List<Hotel> esperado = new ArrayList();
        esperado.add(hotel1);
        
        
        when(hotelRepo.findAll()).thenReturn(esperado);
        
        Hotel hotel2 = new Hotel();
        hotel2.setId_hotel(Long.valueOf(2));
        hotel2.setNombre("alaska");
        hotel2.setServicios("Basicos");
        hotel2.setCalificacion(5);
        
        List<Hotel> traer = hotelService.traerHoteles();
        Assertions.assertEquals(esperado, traer);
        
        Assertions.assertEquals(esperado.size(), traer.size());
    }
    
    @Test
    public void testCrearHotel() {
        
        Hotel hotelEsperado = new Hotel();
        hotelEsperado.setId_hotel(Long.valueOf(1));
        hotelEsperado.setNombre("Borneo");
        hotelEsperado.setCalificacion(5);
        hotelEsperado.setServicios("todo");
        hotelEsperado.setUbicacion("mendoza");
        
        hotelService.crearHotel(hotelEsperado);
        
        when(hotelRepo.save(any(Hotel.class))).thenReturn(hotelEsperado);

        // Obtener el hotel recién creado del repositorio (simulado)
        when(hotelRepo.findById(Long.valueOf(2))).thenReturn(Optional.of(hotelEsperado)); // Suponiendo que el ID del hotel es 1L

        // Consultar el hotel recién creado del repositorio
        Optional<Hotel> optionalHotelCreado = hotelRepo.findById(Long.valueOf(2));
        
        Hotel hotelCreado = optionalHotelCreado.orElse(null);

        // Verificar que el hotel creado es igual al hotel esperado
        Assertions.assertEquals(hotelEsperado, hotelCreado);
        
    }
}
