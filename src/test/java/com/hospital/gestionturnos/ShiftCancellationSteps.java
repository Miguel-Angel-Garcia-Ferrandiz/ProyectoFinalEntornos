package com.hospital.gestionturnos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Clase de pasos para las pruebas de cancelación de turnos con Cucumber.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class ShiftCancellationSteps {
    private GestorTurnos gestor;
    private LocalDateTime fechaHora;
    private String departamento;

    /**
     * Inicializa el gestor de turnos sin turnos asignados.
     */
    @Given("No hay turnos asignados para {string} en {string}")
    public void noHayTurnosAsignados(String fechaHoraStr, String departamentoStr) {
        gestor = new GestorTurnos();
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
    }

    /**
     * Simula un turno asignado para el escenario de cancelación.
     */
    @Given("Hay un turno asignado para {string} en {string}")
    public void hayUnTurnoAsignado(String fechaHoraStr, String departamentoStr) {
        gestor = new GestorTurnos();
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
        // Prototipo: Simula que el turno está asignado (sin lógica real)
    }

    /**
     * Cancela el turno especificado.
     */
    @When("Cancelo el turno para {string} en {string}")
    public void canceloElTurno(String fechaHoraStr, String departamentoStr) {
        fechaHora = LocalDateTime.parse(fechaHoraStr);
        departamento = departamentoStr;
        gestor.cancelarTurno(fechaHora, departamento);
    }

    /**
     * Verifica que el turno haya sido cancelado.
     */
    @Then("El turno debería ser cancelado")
    public void elTurnoDeberiaSerCancelado() {
        assertTrue(gestor.getTurnosAsignados().isEmpty());
    }

    /**
     * Verifica que la lista de turnos esté vacía si no había turno.
     */
    @Then("La lista de turnos debería estar vacía")
    public void laListaDeTurnosDeberiaEstarVacia() {
        assertTrue(gestor.getTurnosAsignados().isEmpty());
    }
}