package com.hospital.gestionturnos;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        GestorTurnos gestor = new GestorTurnos();
        LocalDateTime fecha = LocalDateTime.of(2025, 5, 10, 8, 0);

        // Probar turno disponible
        System.out.println("Turno disponible (Urgencias, 10-05-2025 08:00): " +
                gestor.estaTurnoDisponible(fecha, "Urgencias"));

        // Asignar un turno
        gestor.añadirTurno(fecha, "Urgencias");
        System.out.println("Turno disponible después de asignar: " +
                gestor.estaTurnoDisponible(fecha, "Urgencias"));

        // Cancelar el turno
        gestor.cancelarTurno(fecha, "Urgencias");
        System.out.println("Turno disponible después de cancelar: " +
                gestor.estaTurnoDisponible(fecha, "Urgencias"));
    }
}