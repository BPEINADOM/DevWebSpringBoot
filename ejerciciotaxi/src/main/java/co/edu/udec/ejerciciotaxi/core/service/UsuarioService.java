package co.edu.udec.ejerciciotaxi.core.service;

import org.springframework.stereotype.Service;

import co.edu.udec.ejerciciotaxi.core.domain.usuario.Usuario;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.GestionUsuarioUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.LoginUsuarioUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.LogoutUsuarioUseCase;
import co.edu.udec.ejerciciotaxi.core.port.in.usuario.RecordarClaveUseCase;
import co.edu.udec.ejerciciotaxi.core.port.out.usuario.UsuarioRepository;

/**
 * Implementacion de los casos de uso del modulo Usuario.
 * Contiene las reglas de negocio de login, logout, etc.
 */

@Service
public class UsuarioService implements
        GestionUsuarioUseCase,
        LoginUsuarioUseCase,
        LogoutUsuarioUseCase,
        RecordarClaveUseCase {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.guardar(usuario);
    }

    @Override
    public Usuario buscarUsuario(String id) {
        return usuarioRepository.buscarPorId(id);
    }

    @Override
    public boolean login(String usuarioId, String clave) {
        Usuario usuario = usuarioRepository.buscarPorId(usuarioId);

        if (usuario == null)
            return false;

        return usuario.getClave().equals(clave);
    }

    @Override
    public void logout(String usuarioId) {

    }

    @Override
    public void enviarRecordatorio(String usuarioId) {
        Usuario usuario = usuarioRepository.buscarPorId(usuarioId);

        if (usuario == null)
            throw new RuntimeException("Usuario no encontrado");

        System.out.println("Recordatorio enviado al usuario: " + usuario.getNombre());
    }
}