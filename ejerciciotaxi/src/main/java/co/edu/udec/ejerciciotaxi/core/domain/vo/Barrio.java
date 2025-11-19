package co.edu.udec.ejerciciotaxi.core.domain.vo;

import lombok.Getter;
import lombok.Value;

/**
 * Value Object que encapsula un nombre del barrio.
 */

@Getter
@Value
public class Barrio {
    String nombre;

    public Barrio(String nombre) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El barrio no puede estar vacío");

        this.nombre = nombre;
    }
}
