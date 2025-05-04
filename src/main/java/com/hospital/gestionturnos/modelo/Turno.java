package com.hospital.gestionturnos.modelo;

import java.time.LocalDateTime;

/**
 * Representa un turno asignado en el hospital.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class Turno {
    private LocalDateTime fechaHora;
    private String departamento;

    /**
     * Constructor de Turno.
     * @param fechaHora La fecha y hora del turno.
     * @param departamento El departamento del turno.
     */
    public Turno(LocalDateTime fechaHora, String departamento) {
        // Prototipo
    }

    /**
     * Obtiene la fecha y hora del turno.
     * @return La fecha y hora.
     */
    public LocalDateTime getFechaHora() {
        return null; // Valor provisional
    }

    /**
     * Obtiene el departamento del turno.
     * @return El departamento.
     */
    public String getDepartamento() {
        return null; // Valor provisional
    }
}