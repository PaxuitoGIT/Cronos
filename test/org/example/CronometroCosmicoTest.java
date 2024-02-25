package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class CronometroCosmicoTest {

    @Test
    void testConversionDeTiempo() {
        // Configurar
        double fc = 0.5;
        CronometroCosmico.setFC(fc);

        // Ejecutar
        Date fechaTierra = CronometroCosmico.getFechaPlanetaTierra();
        Date fechaNuevoPlaneta = CronometroCosmico.getFechaPlanetaNuevo();

        // Verificar
        long tiempoEsperado = (long) (fechaTierra.getTime() * fc);
        assertEquals(tiempoEsperado, fechaNuevoPlaneta.getTime(), "La conversión de tiempo no es correcta");
    }

    @Test
    void testLimitesDeRepresentacion() {
        // Configurar
        double maxfc = (double) Long.MAX_VALUE / new Date().getTime();
        CronometroCosmico.setFC(maxfc);

        // Ejecutar
        Date fechaNuevoPlaneta = CronometroCosmico.getFechaPlanetaNuevo();

        // Verificar
        assertTrue(fechaNuevoPlaneta.getTime() < Long.MAX_VALUE, "Se ha excedido el límite de representación de datos");
    }

}