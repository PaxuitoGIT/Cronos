package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComunicadorInterplanetarioTest {

    @Test
    void testContarVocales() {
        assertEquals(3, ComunicadorInterplanetario.contarVocales("hello world"));
        assertEquals(2, ComunicadorInterplanetario.contarVocales("AI"));
    }

    @Test
    void testInvertirMensaje() {
        assertEquals("dlrow olleh", ComunicadorInterplanetario.invertirMensaje("hello world"));
        assertEquals("IA", ComunicadorInterplanetario.invertirMensaje("AI"));
    }

    @Test
    void testVerificarIntegridad() {
        assertTrue(ComunicadorInterplanetario.verificarIntegridad("radar"));
        assertFalse(ComunicadorInterplanetario.verificarIntegridad("hello"));
    }
}