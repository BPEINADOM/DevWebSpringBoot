package co.edu.udec.ejerciciotaxi.core.domain.taxi;

import java.util.UUID;

import co.edu.udec.ejerciciotaxi.core.domain.vo.Barrio;
import co.edu.udec.ejerciciotaxi.core.domain.vo.DuracionMinutos;
import co.edu.udec.ejerciciotaxi.core.domain.vo.Kilometros;
import co.edu.udec.ejerciciotaxi.core.domain.vo.Precio;
import lombok.Data;

/**
 * Agregado Raiz del dominio Taxi.
 * Representa una carrera.
 */

@Data
public class CarreraTaxi {
    private final String id;

    private final Cliente cliente;
    private final Taxi taxi;
    private final Taxista taxista;

    private final Kilometros kilometros;
    private final Barrio barrioInicio;
    private final Barrio barrioLlegada;

    private final int cantidadPasajeros;

    private final Precio precio;
    private final DuracionMinutos duracion;

    public CarreraTaxi(String id, Cliente cliente, Taxi taxi, Taxista taxista, Kilometros kilometros,
            Barrio barrioInicio, Barrio barrioLlegada, int cantidadPasajeros, Precio precio, DuracionMinutos duracion) {
                
        this.id = UUID.randomUUID().toString();

        if (cantidadPasajeros <= 0)
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a 0");

        this.cliente = cliente;
        this.taxi = taxi;
        this.taxista = taxista;
        this.kilometros = kilometros;
        this.barrioInicio = barrioInicio;
        this.barrioLlegada = barrioLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
        this.precio = precio;
        this.duracion = duracion;
    }
}
