package co.edu.udec.ejerciciotaxi.core.port.in.usuario;

import co.edu.udec.ejerciciotaxi.core.domain.usuario.Usuario;

/**
 * Puerto de entrada encargado de la gestion del usuario.
 */

public interface GestionUsuarioUseCase {
    Usuario crearUsuario(Usuario u);
    Usuario buscarUsuario(String id);
}
