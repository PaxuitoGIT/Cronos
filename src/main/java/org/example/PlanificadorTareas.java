package org.example;

import java.util.*;

public class PlanificadorTareas {
    private List<Tarea> tareas;
    private List<Tripulante> tripulantes;

    public PlanificadorTareas(List<Tarea> tareas, List<Tripulante> tripulantes) {
        this.tareas = tareas;
        this.tripulantes = tripulantes;
    }
}