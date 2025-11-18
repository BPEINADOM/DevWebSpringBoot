package co.edu.udec.ejerciciotaxi.core.domain.taxi;

import lombok.Data;

/**
 * Entidad Cliente.
 * Representa al cliente que solicita un taxi.
 */

@Data
public class Cliente {
    private final String id;
    private final String nombre;
}
