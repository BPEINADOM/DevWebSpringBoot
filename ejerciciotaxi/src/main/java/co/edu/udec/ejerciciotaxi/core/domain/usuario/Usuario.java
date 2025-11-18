package co.edu.udec.ejerciciotaxi.core.domain.usuario;

import lombok.Data;

/**
 * Entidad que representa al Usuario.
 * Modulo Independiente del dominio Taxi.
 * Se usa para login, roles y seguridad.
 */

@Data
public class Usuario {
    private final String id;
    private final String clave;
    private final String nombre;
    private final String rol;
}
