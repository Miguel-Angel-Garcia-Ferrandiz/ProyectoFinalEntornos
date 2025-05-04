package com.hospital.gestionturnos.excepciones;

/**
 * Excepción lanzada cuando un turno no está disponible.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class TurnoNoDisponibleException extends Exception {
    /**
     * Constructor de TurnoNoDisponibleException.
     * @param mensaje El mensaje de error.
     */
    public TurnoNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}