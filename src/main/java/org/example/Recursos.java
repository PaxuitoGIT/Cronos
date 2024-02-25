package org.example;

public class Recursos {

    public double calcularMedia(double[] consumos) {
        double sum = 0.0;
        for (double consumo : consumos) {
            sum += consumo;
        }
        return sum / consumos.length;
    }

    public double calcularMinimo(double[] consumos) {
        double min = Double.MAX_VALUE;
        for (double consumo : consumos) {
            if (consumo < min) {
                min = consumo;
            }
        }
        return min;
    }

    public double calcularMaximo(double[] consumos) {
        double max = Double.MIN_VALUE;
        for (double consumo : consumos) {
            if (consumo > max) {
                max = consumo;
            }
        }
        return max;
    }

    public double[] predecirNecesidadesFuturas(double consumoDiario, int dias) {
        try {
            double[] necesidadesFuturas = new double[dias];
            for (int i = 0; i < dias; i++) {
                necesidadesFuturas[i] = consumoDiario * (i + 1);
            }
            return necesidadesFuturas;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public boolean alertaUmbralSeguro(double umbral, double[] consumos) {
        try {
            for (double consumo : consumos) {
                if (consumo < umbral) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
