package com.hospital.gestionturnos;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

/**
 * Clase de pasos comunes para las pruebas con Cucumber.
 * @author Miguel Ángel García Ferrándiz
 * @version 1.0
 */
public class CommonSteps {
    private GestorTurnos gestor;

    /**
     * Inicializa el entorno antes de cada escenario.
     */
    @Before
    public void setUp() {
        gestor = new GestorTurnos();
    }

    /**
     * Obtiene el gestor de turnos para otros pasos.
     * @return El gestor de turnos.
     */
    public GestorTurnos getGestor() {
        return gestor;
    }

    /**
     * Establece un estado inicial donde no hay turnos asignados.
     */
    @Given("El sistema está inicializado sin turnos")
    public void elSistemaEstaInicializadoSinTurnos() {
        // Prototipo: No se implementa lógica real
    }
}