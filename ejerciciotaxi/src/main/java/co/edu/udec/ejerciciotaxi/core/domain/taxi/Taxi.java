package co.edu.udec.ejerciciotaxi.core.domain.taxi;

import lombok.Data;

/**
 * Entidad Taxi.
 * Representa el vehiculo que hace las carreras.
 */

@Data
public class Taxi {
    private final String placa;
    private final String modelo;
}
