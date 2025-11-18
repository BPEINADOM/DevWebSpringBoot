package co.edu.udec.ejerciciotaxi.core.port.in.usuario;

/**
 * Puerto de entrada para el login del usuario.
 * Login por medio del id y una clave.
 */

public interface LoginUsuarioUseCase {
    boolean login(String usuarioId, String clave);
}
