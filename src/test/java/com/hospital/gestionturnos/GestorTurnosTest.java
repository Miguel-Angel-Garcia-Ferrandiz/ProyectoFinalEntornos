package com.hospital.gestionturnos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class GestorTurnosTest {
    private GestorTurnos gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorTurnos();
    }

    @Test
    void testTurnoDisponible() {
        LocalDateTime fechaHora = LocalDateTime.parse("2025-05-05T10:00");
        assertTrue(gestor.estaTurnoDisponible(fechaHora, "Urgencias"));
    }

    @Test
    void testTurnoNoDisponible() {
        LocalDateTime fechaHora = LocalDateTime.parse("2025-05-05T10:00");
        gestor.añadirTurno(fechaHora, "Urgencias");
        assertFalse(gestor.estaTurnoDisponible(fechaHora, "Urgencias"));
    }

    @Test
    void testCancelarTurnoExistente() {
        LocalDateTime fechaHora = LocalDateTime.parse("2025-05-05T10:00");
        gestor.añadirTurno(fechaHora, "Urgencias");
        gestor.cancelarTurno(fechaHora, "Urgencias");
        assertTrue(gestor.getTurnosAsignados().isEmpty());
    }

    @Test
    void testCancelarTurnoInexistente() {
        LocalDateTime fechaHora = LocalDateTime.parse("2025-05-05T10:00");
        gestor.cancelarTurno(fechaHora, "Urgencias");
        assertTrue(gestor.getTurnosAsignados().isEmpty());
    }
}