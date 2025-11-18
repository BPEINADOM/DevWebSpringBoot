package co.edu.udec.ejerciciotaxi.core.port.in.usuario;

/**
 * Puerto de entrada para el recordatorio de Clave de usuario.
 */

public interface RecordarClaveUseCase {
    void enviarRecordatorio(String usuarioId);
}
