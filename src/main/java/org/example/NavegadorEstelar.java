package org.example;

public class NavegadorEstelar {

    private int[][] terreno;

    public NavegadorEstelar(int size) {
        this.terreno = new int[size][size];
    }

    public void visualizarTerreno() {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[i].length; j++) {
                System.out.print(terreno[i][j] + " ");
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

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int filasA = a.length;
        int columnasA = a[0].length;
        int columnasB = b[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }
}
