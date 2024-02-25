package org.example;

import java.util.*;

public class PlanificadorTareas {
    private final List<Tarea> tareas;
    private final List<Tripulante> tripulantes;

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
                System.out.println("Tarea: " + tarea.nombre() + ", Duración: " + tarea.duracion());
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

    public record Tarea(String nombre, int duracion) {
    }

    public static class Tripulante {
        private final String nombre;
        private final List<Tarea> tareas;

        public Tripulante(String nombre) {
            this.nombre = nombre;
            this.tareas = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public List<Tarea> getTareas() {
            return tareas;
        }
    }
}