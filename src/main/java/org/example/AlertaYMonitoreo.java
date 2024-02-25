package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlertaYMonitoreo {
    private final List<Double> radiacionNivel = new ArrayList<>();
    private final List<Double> temperatura = new ArrayList<>();
    private final List<Double> presion = new ArrayList<>();

    public void monitorVariables() {
        Random random = new Random();

        radiacionNivel.add(random.nextDouble() * 100);
        temperatura.add(random.nextDouble() * 100);
        presion.add(random.nextDouble() * 100);

        System.out.println("Variables monitoreadas");
        System.out.println("Nivel de radiación: " + radiacionNivel.getLast());
        System.out.println("Temperatura: " + temperatura.getLast());
        System.out.println("Presión: " + presion.getLast());
    }

    public void alertaTripulacion() {
        System.out.println("Alerta a la tripulación: Los niveles de radiación son peligrosos");
    }

    public void sugerenciaAjuste() {
        System.out.println("Sugerencia de ajustes: Reducir la radiación y la presión, y aumentar la temperatura");
    }

    public List<Integer> identificarEventos(int n) {
        try {
        List <Integer> eventos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            eventos.add(i);
        }
        return eventos;
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return null;
    }
    }

    public List<Integer> descomponerProblema(int problema) {
        try {
        List<Integer> descomponerProblema = new ArrayList<>();
        for (int i = 2; i <= problema; i++) {
            while (problema % i == 0) {
                descomponerProblema.add(i);
                problema /= i;
            }
        }
        return descomponerProblema;
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        return null;
    }
    }
}
