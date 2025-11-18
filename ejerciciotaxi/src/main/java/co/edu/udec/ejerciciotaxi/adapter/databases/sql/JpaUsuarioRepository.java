package co.edu.udec.ejerciciotaxi.adapter.databases.sql;

import org.springframework.stereotype.Repository;

import co.edu.udec.ejerciciotaxi.core.domain.usuario.Usuario;
import co.edu.udec.ejerciciotaxi.core.port.out.usuario.UsuarioRepository;

/**
 * Adaptador de salida que implementa el puerto Carrera de Taxi.
 */

@Repository
public class JpaUsuarioRepository implements UsuarioRepository {

    @Override
    public Usuario guardar(Usuario usuario) {
        System.out.println("Guardando usuario");
        return usuario;
    }

    @Override
    public Usuario buscarPorId(String id) {
        System.out.println("Buscando usuario por ID");
        return null;
    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        System.out.println("Buscando usuario por nombre");
        return null;
    }
}
