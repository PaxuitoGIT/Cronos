package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class PlanificadorTareasTest {

    @Test
    void testAsignacionDistribucionTareas() {
        PlanificadorTareas.Tarea tarea1 = new PlanificadorTareas.Tarea("Tarea 1", 2);
        PlanificadorTareas.Tarea tarea2 = new PlanificadorTareas.Tarea("Tarea 2", 3);
        PlanificadorTareas.Tarea tarea3 = new PlanificadorTareas.Tarea("Tarea 3", 1);

        PlanificadorTareas.Tripulante tripulante1 = new PlanificadorTareas.Tripulante("Tripulante 1");
        PlanificadorTareas.Tripulante tripulante2 = new PlanificadorTareas.Tripulante("Tripulante 2");

        PlanificadorTareas planificador = new PlanificadorTareas(Arrays.asList(tarea1, tarea2, tarea3), Arrays.asList(tripulante1, tripulante2));

        planificador.distribuirTareas();

        assertEquals(2, tripulante1.getTareas().size(), "La asignación de tareas no es correcta");
        assertEquals(1, tripulante2.getTareas().size(), "La distribución de tareas no es correcta");
    }

    @Test
    void testCalculoCargaTrabajo() {
        PlanificadorTareas.Tarea tarea1 = new PlanificadorTareas.Tarea("Tarea 1", 2);
        PlanificadorTareas.Tarea tarea2 = new PlanificadorTareas.Tarea("Tarea 2", 3);

        PlanificadorTareas.Tripulante tripulante1 = new PlanificadorTareas.Tripulante("Tripulante 1");

        PlanificadorTareas planificador = new PlanificadorTareas(Arrays.asList(tarea1, tarea2), List.of(tripulante1));

        planificador.distribuirTareas();

        int cargaTrabajo = tripulante1.getTareas().stream().mapToInt(PlanificadorTareas.Tarea::duracion).sum();

        assertEquals(5, cargaTrabajo, "El cálculo de la carga de trabajo no es correcto");
    }
}