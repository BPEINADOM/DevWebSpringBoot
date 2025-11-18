package co.edu.udec.ejerciciotaxi.core.port.out.usuario;

import co.edu.udec.ejerciciotaxi.core.domain.usuario.Usuario;

/**
 * Puerto de salida que define como el modulo usuario
 * como manejara la informacion de los usuarios.
 */

public interface UsuarioRepository {

    Usuario guardar(Usuario usuario);

    Usuario buscarPorId(String id);

    Usuario buscarPorNombre(String nombre);
    
}
