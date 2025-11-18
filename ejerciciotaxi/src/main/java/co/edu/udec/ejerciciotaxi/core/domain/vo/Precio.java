package co.edu.udec.ejerciciotaxi.core.domain.vo;

import lombok.Value;

/**
 * Value Object de Precio.
 * No puede ser negativo.
 */

@Value
public class Precio {
    double value;

    public Precio(double value) {

        if (value < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");

        this.value = value;
    }
}

