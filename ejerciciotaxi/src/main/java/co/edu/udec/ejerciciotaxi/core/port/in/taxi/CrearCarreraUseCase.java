package co.edu.udec.ejerciciotaxi.core.port.in.taxi;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;

/**
 * Puerto de entrada para crear una carrera.
 * La capa web llama a este metodo.
 */

public interface CrearCarreraUseCase {
    CarreraTaxi crear(CarreraTaxi carrera);
}
