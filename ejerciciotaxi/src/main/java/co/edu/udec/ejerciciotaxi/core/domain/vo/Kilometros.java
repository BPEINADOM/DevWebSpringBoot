package co.edu.udec.ejerciciotaxi.core.domain.vo;

import lombok.Getter;
import lombok.Value;

/**
 * Value Object que representa la cantidad de kilometros.
 * Inmutable y con validacion simple.
 */


@Value
@Getter
public class Kilometros {
    double value;

    public Kilometros (double value) {

        if (value <= 0)
            throw new IllegalArgumentException("Los kilómetros deben ser mayores a 0");

        this.value = value;

    }
}
