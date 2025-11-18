package co.edu.udec.ejerciciotaxi.core.domain.vo;

import lombok.Value;

/**
 * Value Object que representa la duracion de la carrera en minutos.
 */

@Value
public class DuracionMinutos {
    int value;

    public DuracionMinutos(int value) {

        if (value <= 0)
            throw new IllegalArgumentException("La duración debe ser mayor a 0");

        this.value = value;
    }
}
