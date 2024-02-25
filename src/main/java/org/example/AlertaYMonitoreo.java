package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlertaYMonitoreo {
    private List<Double> radiacionNivel = new ArrayList<>();
    private List<Double> temperatura = new ArrayList<>();
    private List<Double> presion = new ArrayList<>();

    public void monitorVariables() {
        Random random = new Random();

        radiacionNivel.add(random.nextDouble() * 100);
        temperatura.add(random.nextDouble() * 100);
        presion.add(random.nextDouble() * 100);

        System.out.println("Variables monitoreadas");
        System.out.println("Nivel de radiación: " + radiacionNivel.get(radiacionNivel.size() - 1));
        System.out.println("Temperatura: " + temperatura.get(temperatura.size() - 1));
        System.out.println("Presión: " + presion.get(presion.size() - 1));
    }
}
