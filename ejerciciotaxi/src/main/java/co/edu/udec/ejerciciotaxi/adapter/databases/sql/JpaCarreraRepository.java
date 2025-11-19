package co.edu.udec.ejerciciotaxi.adapter.databases.sql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;
import co.edu.udec.ejerciciotaxi.core.port.out.taxi.CarreraTaxiRepository;

@Repository
public class JpaCarreraRepository implements CarreraTaxiRepository {

    private final List<CarreraTaxi> bd = new ArrayList<>();

    @Override
    public CarreraTaxi guardar(CarreraTaxi carrera) {
        System.out.println("Guardando carrera en memoria: " + carrera.getId());
        bd.add(carrera);
        return carrera;
    }

    @Override
    public CarreraTaxi buscarPorId(String id) {
        return bd.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<CarreraTaxi> listar() {
        System.out.println("Listando carreras (" + bd.size() + ")");
        return new ArrayList<>(bd); 
    }
}
