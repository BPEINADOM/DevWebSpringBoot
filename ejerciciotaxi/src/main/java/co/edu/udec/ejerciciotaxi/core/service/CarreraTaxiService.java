package co.edu.udec.ejerciciotaxi.core.service;

import java.util.List;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;
import co.edu.udec.ejerciciotaxi.core.port.in.taxi.BuscarCarreraUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.taxi.CrearCarreraUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.taxi.ListarCarrerasUseCase;
import co.edu.udec.ejerciciotaxi.core.port.out.taxi.CarreraTaxiRepository;

/**
 * Implementacion de los casos de uso del modulo taxi.
 * Se implementan los puertos de entrada y salida.
 */

public class CarreraTaxiService implements
        CrearCarreraUseCase,
        BuscarCarreraUseCase,
        ListarCarrerasUseCase {

    private final CarreraTaxiRepository carreraRepository;

    public CarreraTaxiService(CarreraTaxiRepository carreraRepository) {
        this.carreraRepository = carreraRepository;
    }

    @Override
    public CarreraTaxi crear(CarreraTaxi carrera) {
        return carreraRepository.guardar(carrera);
    }

    @Override
    public CarreraTaxi buscarPorId(String id) {
        return carreraRepository.buscarPorId(id);
    }

    @Override
    public List<CarreraTaxi> listar() {
        return carreraRepository.listar();
    }
}
