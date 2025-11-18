package co.edu.udec.ejerciciotaxi.core.port.in.usuario;

/**
 * Puerto de entrada encargado del cerrado de sesion del usuario.
 */

public interface LogoutUsuarioUseCase {
    void logout(String usuarioId);
}