Feature: Cancelar turnos asignados

  Scenario: Cancelar un turno existente
    Given Hay un turno asignado para "2025-05-05T10:00" en "Urgencias"
    When Cancelo el turno para "2025-05-05T10:00" en "Urgencias"
    Then El turno debería ser cancelado

  Scenario: Intentar cancelar un turno inexistente
    Given No hay turnos asignados para "2025-05-05T10:00" en "Urgencias"
    When Cancelo el turno para "2025-05-05T10:00" en "Urgencias"
    Then La lista de turnos debería estar vacía