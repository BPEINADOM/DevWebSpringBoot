package co.edu.udec.ejerciciotaxi.adapter.databases.sql;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;
import co.edu.udec.ejerciciotaxi.core.port.out.taxi.CarreraTaxiRepository;

/**
 * Adaptador de salida que implementa el puerto Carrera de Taxi.
 */

@Repository
public class JpaCarreraRepository implements CarreraTaxiRepository {

    @Override
    public CarreraTaxi guardar(CarreraTaxi carrera) {
        System.out.println("Guardando carrera en BD");
        return carrera;
    }

    @Override
    public CarreraTaxi buscarPorId(String id) {
        System.out.println("Buscando carrera " + id + " en BD");
        return null;
    }

    @Override
    public List<CarreraTaxi> listar() {
        System.out.println("Listando carreras (simulado)");
        return List.of();
    }
}