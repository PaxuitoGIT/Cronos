package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NavegadorEstelarTest {

    @Test
    void testGeneracionOptimizacionRutas() {
        NavegadorEstelar navegadorEstelar = new NavegadorEstelar(10);
        navegadorEstelar.planificarRuta(0, 0, 9, 9);
        navegadorEstelar.optimizarRutasYRecursos();

        // Verificar que la matriz terreno se actualizó correctamente después de planificar la ruta
        Integer[][] terrenoEsperado = new Integer[10][10];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(terrenoEsperado[i], 0);
            terrenoEsperado[i][i] = 2;
        }
        assertArrayEquals(terrenoEsperado, Arrays.stream(navegadorEstelar.getTerreno()).map(ints -> Arrays.stream(ints).boxed().toArray(Integer[]::new)).toArray(Integer[][]::new), "La generación de rutas no es correcta");

        // Verificar que la matriz costos se actualizó correctamente después de optimizar las rutas y los recursos
        Integer[][] costosEsperado = new Integer[10][10];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(costosEsperado[i], 0);
            costosEsperado[i][i] = 0;
        }
        assertArrayEquals(costosEsperado, Arrays.stream(navegadorEstelar.getCostos()).map(ints -> Arrays.stream(ints).boxed().toArray(Integer[]::new)).toArray(Integer[][]::new), "La optimización de rutas y recursos no es correcta");
    }

    @Test
    void testRepresentacionTerrenoPlanificacionConstrucciones() {
        NavegadorEstelar navegadorEstelar = new NavegadorEstelar(10);
        navegadorEstelar.planificarConstruccion(5, 5);

        // Verificar que la matriz terreno se actualizó correctamente después de planificar la construcción
        int[][] terrenoEsperado = new int[10][10];
        terrenoEsperado[5][5] = 1;
        assertArrayEquals(terrenoEsperado, navegadorEstelar.getTerreno(), "La representación del terreno y la planificación de construcciones no es correcta");
    }
}