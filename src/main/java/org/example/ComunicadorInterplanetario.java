package org.example;

public class ComunicadorInterplanetario {

    public static int contarVocales(String mensaje) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < mensaje.length(); i++) {
            if (vocales.indexOf(mensaje.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
