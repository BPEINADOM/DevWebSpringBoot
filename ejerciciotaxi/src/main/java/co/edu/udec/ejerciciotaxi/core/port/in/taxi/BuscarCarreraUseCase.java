package co.edu.udec.ejerciciotaxi.core.port.in.taxi;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;

/**
 * Puerto de entrada para buscar una carrera.
 * La busqueda se realiza por medio del ID.
 */

public interface BuscarCarreraUseCase {
    CarreraTaxi buscarPorId(String id);
}
