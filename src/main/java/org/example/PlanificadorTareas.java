package org.example;

import java.util.*;

public class PlanificadorTareas {
    private List<Tarea> tareas;
    private List<Tripulante> tripulantes;

    public PlanificadorTareas(List<Tarea> tareas, List<Tripulante> tripulantes) {
        this.tareas = tareas;
        this.tripulantes = tripulantes;
    }

    public void distribuirTareas() {
        int i = 0;
        for (Tarea tarea : tareas) {
            Tripulante tripulante = tripulantes.get(i % tripulantes.size());
            tripulante.getTareas().add(tarea);
            i++;
        }
    }

    public void visualizarHorarios() {
        for (Tripulante tripulante : tripulantes) {
            System.out.println("Tripulante: " + tripulante.getNombre());
            for (Tarea tarea : tripulante.getTareas()) {
                System.out.println("Tarea: " + tarea.getNombre() + ", Duración: " + tarea.getDuracion());
            }
            System.out.println("--------------------");
        }
    }

    public void ajustarTareas(Tripulante tripulante, Tarea tarea) {
        if (tripulante.getTareas().contains(tarea)) {
            tripulante.getTareas().remove(tarea);
            distribuirTareas();
        }
    }
}