package co.edu.udec.ejerciciotaxi.adapter.persistence.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;
import co.edu.udec.ejerciciotaxi.core.port.out.taxi.CarreraTaxiRepository;

@Primary
@Repository
public class CarreraRepositoryInMemory implements CarreraTaxiRepository {

    private final ConcurrentHashMap<String, CarreraTaxi> storage = new ConcurrentHashMap<>();

    @Override
    public CarreraTaxi guardar(CarreraTaxi carrera) {
        storage.put(carrera.getId(), carrera);
        return carrera;
    }

    @Override
    public CarreraTaxi buscarPorId(String id) {
        return storage.get(id);
    }

    @Override
    public List<CarreraTaxi> listar() {
        return new ArrayList<>(storage.values());
    }
}

