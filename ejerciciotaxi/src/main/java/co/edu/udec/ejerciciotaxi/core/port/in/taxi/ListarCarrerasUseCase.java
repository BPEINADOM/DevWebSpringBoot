package co.edu.udec.ejerciciotaxi.core.port.in.taxi;

import java.util.List;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;

/**
 * Puerto de entrada para el listado de Carreras.
 */

public interface ListarCarrerasUseCase {
    List<CarreraTaxi> listar();
}