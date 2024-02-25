package org.example;

public class NavegadorEstelar {

    private final int[][] terreno;
    private final int[][] costos;

    public int[][] getTerreno() {
        return terreno;
    }

    public int[][] getCostos() {
        return costos;
    }

    public NavegadorEstelar(int size) {
        this.terreno = new int[size][size];
        this.costos = new int[size][size];
    }

    public void visualizarTerreno() {
        for (int[] ints : terreno) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public void planificarRuta(int startX, int startY, int endX, int endY) {
        if (startX < 0 || startY < 0 || endX >= terreno.length || endY >= terreno[0].length) {
            System.out.println("Los puntos de inicio o final están fuera de los límites del terreno");
            return;
        }

        if (startX == endX && startY == endY) {
            System.out.println("El punto de inicio y final son el mismo");
            return;
        }

        int dirX = endX > startX ? 1 : -1;
        int dirY = endY > startY ? 1 : -1;

        int x = startX;
        int y = startY;
        while (x != endX || y != endY) {
            terreno[x][y] = 2;

            if (x != endX) {
                x += dirX;
            }
            if (y != endY) {
                y += dirY;
            }
        }
        terreno[endX][endY] = 2;
    }

    public void planificarConstruccion(int x, int y) {
        terreno[x][y] = 1;
    }

    public void generarMatrizCostos() {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                costos[i][j] = terreno[i][j] == 1 ? 10 : 1;
            }
        }
    }
    public void optimizarRutasYRecursos() {
        generarMatrizCostos();
        int[][] costosOptimizados = multiplicarMatrices(terreno, costos);

        assert costosOptimizados != null;
        for (int i = 0; i < costosOptimizados.length; i++){
            System.arraycopy(costosOptimizados[i], 0, costos[i], 0, costos[i].length);
        }

        for (int[] fila : costos) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        try {
            int filasA = a.length;
            int columnasA = a[0].length;
            int columnasB = b[0].length;

            int[][] resultado = new int[filasA][columnasB];

            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        if (a[i][k] == b[k][j]) {
                            resultado[i][j] += a[i][k] * b[k][j];
                        } else {
                            resultado[i][j] += 0;
                        }
                    }
                }
            }

            return resultado;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    }
