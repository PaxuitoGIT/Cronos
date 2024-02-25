package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AlertaYMonitoreoTest {

    @Test
    void testDeteccionEventos() {
        AlertaYMonitoreo alertaYMonitoreo = new AlertaYMonitoreo();
        int eventosEsperados = 5;
        int eventosActuales = alertaYMonitoreo.identificarEventos(5).size();
        assertEquals(eventosEsperados, eventosActuales, "La detección de eventos no es correcta");
    }

    @Test
    void testDescomposicionProblemas() {
        AlertaYMonitoreo alertaYMonitoreo = new AlertaYMonitoreo();
        int problemaComplejo = 100;
        List<Integer> problemaDescompuesto = alertaYMonitoreo.descomponerProblema(problemaComplejo);
        for (Integer subProblema : problemaDescompuesto) {
            assertTrue(subProblema < problemaComplejo, "La descomposición de problemas no es correcta");
        }
    }
}