package co.edu.udec.ejerciciotaxi.adapter.web.controller;

import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.udec.ejerciciotaxi.core.domain.usuario.Usuario;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.GestionUsuarioUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.LoginUsuarioUseCase;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final GestionUsuarioUseCase usuarios;
    private final LoginUsuarioUseCase login;

    public UsuarioController(GestionUsuarioUseCase usuarios,
                             LoginUsuarioUseCase login) {
        this.usuarios = usuarios;
        this.login = login;
    }

    @PostMapping("/crear")
    @ResponseBody
    public String crearUsuario(UsuarioForm form) {

        Usuario u = new Usuario(
                UUID.randomUUID().toString(),
                form.getClave(),
                form.getNombre(),
                form.getRol()
        );

        usuarios.crearUsuario(u);

        return "<h2>Usuario creado correctamente</h2>"
                + "<a href='/usuarios/crear.html'>Volver</a>";
    }

    @PostMapping("/login")
    @ResponseBody
    public String loginUser(String id, String clave) {
        boolean ok = login.login(id, clave);

        if (ok) {
            return "<h2>Login correcto</h2>"
                    + "<a href='/home.html'>Continuar</a>";
        }

        return "<h2>Credenciales inválidas</h2>"
                + "<a href='/usuarios/login.html'>Volver</a>";
    }
}
