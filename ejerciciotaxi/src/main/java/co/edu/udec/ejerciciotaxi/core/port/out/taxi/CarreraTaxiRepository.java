package co.edu.udec.ejerciciotaxi.core.port.out.taxi;

import java.util.List;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;

/**
 * Puerto de salida que define como el dominio
 * espera que se guarden las carreras.
 */

public interface CarreraTaxiRepository {

    CarreraTaxi guardar(CarreraTaxi carrera);

    CarreraTaxi buscarPorId(String id);

    List<CarreraTaxi> listar();

}
