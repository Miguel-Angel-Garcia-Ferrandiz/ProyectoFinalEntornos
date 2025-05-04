package com.hospital.gestionturnos.interfaz;

import com.hospital.gestionturnos.GestorTurnos;
import com.hospital.gestionturnos.excepciones.TurnoNoDisponibleException;

import java.time.LocalDateTime;

/**
 * Controla las acciones de la interfaz gráfica.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class ControladorInterfaz {
    private GestorTurnos gestor;
    private VentanaPrincipal ventana;

    /**
     * Constructor de ControladorInterfaz.
     * @param gestor El gestor de turnos.
     * @param ventana La ventana principal.
     */
    public ControladorInterfaz(GestorTurnos gestor, VentanaPrincipal ventana) {
        // Prototipo
    }

    /**
     * Asigna un turno a un departamento.
     * @param fechaHora La fecha y hora del turno.
     * @param departamento El departamento del turno.
     * @throws TurnoNoDisponibleException Si el turno no está disponible.
     */
    public void asignarTurno(LocalDateTime fechaHora, String departamento) throws TurnoNoDisponibleException {
        // Prototipo
    }

    /**
     * Cancela un turno existente.
     * @param fechaHora La fecha y hora del turno.
     * @param departamento El departamento del turno.
     */
    public void cancelarTurno(LocalDateTime fechaHora, String departamento) {
        // Prototipo
    }

    /**
     * Autentica a un usuario.
     * @param usuario El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     * @return true si la autenticación es exitosa, false si no.
     */
    public boolean autenticar(String usuario, String contraseña) {
        return false; // Valor provisional
    }
}