Feature: Verificar disponibilidad de turnos

  Scenario: Verificar turno disponible
    Given No hay turnos asignados para "2025-05-05T10:00" en "Urgencias"
    When Verifico la disponibilidad del turno para "2025-05-05T10:00" en "Urgencias"
    Then El turno debería estar disponible

  Scenario: Verificar turno no disponible
    Given Hay un turno asignado para "2025-05-05T10:00" en "Urgencias"
    When Verifico la disponibilidad del turno para "2025-05-05T10:00" en "Urgencias"
    Then El turno no debería estar disponible