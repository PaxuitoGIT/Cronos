package org.example;

public class Recursos {
    private double agua;
    private double comida;
    private double oxigeno;

    public Recursos(double agua, double comida, double oxigeno) {
        this.agua = agua;
        this.comida = comida;
        this.oxigeno = oxigeno;
    }

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
}