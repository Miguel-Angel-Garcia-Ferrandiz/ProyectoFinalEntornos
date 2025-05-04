package com.hospital.gestionturnos;

import com.hospital.gestionturnos.modelo.Turno;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Clase de pasos para las pruebas de disponibilidad de turnos con Cucumber.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class ShiftAvailabilitySteps {
    private GestorTurnos gestor;
    private LocalDateTime fechaHora;
    private String departamento;
    private boolean resultado;

    /**
     * Inicializa el gestor de turnos antes de cada escenario.
     */
    @Given("No hay turnos asignados para {string} en {string}")
    public void noHayTurnosAsignados(String fechaHoraStr, String departamentoStr) {
        gestor = new GestorTurnos();
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
    }

    /**
     * Verifica la disponibilidad del turno.
     */
    @When("Verifico la disponibilidad del turno para {string} en {string}")
    public void verificoDisponibilidadDelTurno(String fechaHoraStr, String departamentoStr) {
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
        resultado = gestor.estaTurnoDisponible(fechaHora, departamento);
    }

    /**
     * Verifica que el turno esté disponible.
     */
    @Then("El turno debería estar disponible")
    public void elTurnoDeberiaEstarDisponible() {
        assertTrue(resultado);
    }

    /**
     * Verifica que el turno no esté disponible.
     */
    @Then("El turno no debería estar disponible")
    public void elTurnoNoDeberiaEstarDisponible() {
        assertFalse(resultado);
    }

    /**
     * Simula un turno asignado para el escenario de turno no disponible.
     */
    @Given("Hay un turno asignado para {string} en {string}")
    public void hayUnTurnoAsignado(String fechaHoraStr, String departamentoStr) {
        gestor = new GestorTurnos();
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
        // Prototipo: Simula que el turno está asignado (sin lógica real)
    }
}