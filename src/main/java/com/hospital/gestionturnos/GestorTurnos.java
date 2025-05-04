package com.hospital.gestionturnos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona los turnos del personal hospitalario, incluyendo asignaciones y verificaciones de disponibilidad.
 */
public class GestorTurnos {
    private List<Turno> turnosAsignados;

    /**
     * Constructor de GestorTurnos.
     */
    public GestorTurnos() {
        this.turnosAsignados = new ArrayList<>();
    }

    /**
     * Verifica si un turno está disponible para ser asignado.
     *
     * @param fechaHoraTurno La fecha y hora del turno.
     * @param departamento   El departamento del turno (por ejemplo, "Urgencias", "Cirugía").
     * @return true si el turno está disponible, false si ya está asignado.
     */
    public boolean estaTurnoDisponible(LocalDateTime fechaHoraTurno, String departamento) {
        for (Turno turno : turnosAsignados) {
            if (turno.getFechaHora().equals(fechaHoraTurno) &&
                    turno.getDepartamento().equalsIgnoreCase(departamento)) {
                return false; // El turno ya está asignado
            }
        }
        return true; // El turno está disponible
    }

    /**
     * Cancela un turno asignado para la fecha y departamento especificados.
     *
     * @param fechaHoraTurno La fecha y hora del turno a cancelar.
     * @param departamento   El departamento del turno.
     */
    public void cancelarTurno(LocalDateTime fechaHoraTurno, String departamento) {
        turnosAsignados.removeIf(turno ->
                turno.getFechaHora().equals(fechaHoraTurno) &&
                        turno.getDepartamento().equalsIgnoreCase(departamento));
    }

    private static class Turno {
        private LocalDateTime fechaHora;
        private String departamento;

        public Turno(LocalDateTime fechaHora, String departamento) {
            this.fechaHora = fechaHora;
            this.departamento = departamento;
        }

        public LocalDateTime getFechaHora() {
            return fechaHora;
        }

        public String getDepartamento() {
            return departamento;
        }
    }

    public void añadirTurno(LocalDateTime fechaHora, String departamento) {
        turnosAsignados.add(new Turno(fechaHora, departamento));
    }

    /**
     * Obtiene la lista de turnos asignados (para fines de prueba).
     *
     * @return Lista de turnos asignados.
     */
    public List<Turno> getTurnosAsignados() {
        return new ArrayList<>(turnosAsignados);
    }
}