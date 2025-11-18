package co.edu.udec.ejerciciotaxi.core.domain.taxi;

import lombok.Data;

/**
 * Entidad Taxista.
 * Rerepresenta quien hace las carreras y el conductor del taxi.
 */

@Data
public class Taxista {
    private final String id;
    private final String nombre;
}
