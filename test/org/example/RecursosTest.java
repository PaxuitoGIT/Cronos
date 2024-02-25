package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursosTest {

    @Test
    void testCalcularConsumoRecursos() {
        Recursos recursos = new Recursos();
        double consumoDiario = 10.0;
        int dias = 5;
        double[] expectedNecesidadesFuturas = {10.0, 20.0, 30.0, 40.0, 50.0};
        double[] actualNecesidadesFuturas = recursos.predecirNecesidadesFuturas(consumoDiario, dias);
        assertArrayEquals(expectedNecesidadesFuturas, actualNecesidadesFuturas, "El cálculo de consumo de recursos no es correcto");
    }

    @Test
    void testAlertaUmbralSeguro() {
        Recursos recursos = new Recursos();
        double umbral = 15.0;
        double[] consumos = {10.0, 20.0, 30.0};
        assertTrue(recursos.alertaUmbralSeguro(umbral, consumos), "La alerta de umbral seguro no se activó correctamente");
    }
}