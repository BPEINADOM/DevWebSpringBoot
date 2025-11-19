package co.edu.udec.ejerciciotaxi.adapter.web.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.udec.ejerciciotaxi.core.domain.taxi.CarreraTaxi;
import co.edu.udec.ejerciciotaxi.core.domain.taxi.Cliente;
import co.edu.udec.ejerciciotaxi.core.domain.taxi.Taxi;
import co.edu.udec.ejerciciotaxi.core.domain.taxi.Taxista;
import co.edu.udec.ejerciciotaxi.core.domain.vo.Barrio;
import co.edu.udec.ejerciciotaxi.core.domain.vo.DuracionMinutos;
import co.edu.udec.ejerciciotaxi.core.domain.vo.Kilometros;
import co.edu.udec.ejerciciotaxi.core.domain.vo.Precio;
import co.edu.udec.ejerciciotaxi.core.port.in.taxi.CrearCarreraUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.taxi.ListarCarrerasUseCase;

@Controller
@RequestMapping("/carreras")
public class CarreraController {

    private final CrearCarreraUseCase crearCarrera;
    private final ListarCarrerasUseCase listarCarreras;

    public CarreraController(CrearCarreraUseCase crearCarrera,
                             ListarCarrerasUseCase listarCarreras) {
        this.crearCarrera = crearCarrera;
        this.listarCarreras = listarCarreras;
    }

    // POST desde crear.html
    @PostMapping(value = "/crear", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String crearCarrera(CarreraForm form) {

        Cliente cliente = new Cliente(UUID.randomUUID().toString(), form.getCliente());
        Taxi taxi = new Taxi(form.getPlacaTaxi(), form.getModeloTaxi());
        Taxista taxista = new Taxista(UUID.randomUUID().toString(), form.getNombreTaxista());

        CarreraTaxi carrera = new CarreraTaxi(
                null,
                cliente,
                taxi,
                taxista,
                new Kilometros(form.getKilometros()),
                new Barrio(form.getBarrioInicio()),
                new Barrio(form.getBarrioLlegada()),
                form.getPasajeros(),
                new Precio(form.getPrecio()),
                new DuracionMinutos(form.getDuracion())
        );

        crearCarrera.crear(carrera);

        return "<h2>Carrera creada correctamente</h2>"
                + "<a href='/carreras/listar.html'>Volver</a>";
    }

    // Consumido por listar.html vía fetch()
    @GetMapping("/list")
    @ResponseBody
    public List<CarreraTaxi> listar() {
        return listarCarreras.listar();
    }
}
