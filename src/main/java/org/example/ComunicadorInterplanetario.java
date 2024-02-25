package org.example;

public class ComunicadorInterplanetario {

    public static int contarVocales(String mensaje) {
        try {
            int contador = 0;
            String vocales = "aeiouAEIOU";
            for (int i = 0; i < mensaje.length(); i++) {
                if (vocales.indexOf(mensaje.charAt(i)) != -1) {
                    contador++;
                }
            }
            return contador;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    public static boolean verificarIntegridad(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "");
        String mensajeInvertido = invertirMensaje(mensajeSinEspacios);
        return mensajeSinEspacios.equals(mensajeInvertido);
    }
}
