package org.example;
import java.text.DateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        double fc;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver fecha actual en la Tierra");
            System.out.println("2. Ver fecha actual en el nuevo planeta");
            System.out.println("3. Cambiar factor de conversión");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Fecha actual en la Tierra: " + DateFormat.getDateTimeInstance().format(CronometroCosmico.getFechaPlanetaTierra()));
                    break;
                case 2:
                    System.out.println("Fecha actual en el nuevo planeta: " + DateFormat.getDateTimeInstance().format(CronometroCosmico.getFechaPlanetaNuevo()));
                    System.out.println("Factor de conversión actual: " + CronometroCosmico.getFC());
                    break;
                case 3:
                    System.out.print("Introduce el nuevo factor de conversión: ");
                    fc = scanner.nextDouble();
                    CronometroCosmico.setFC(fc);
                    System.out.println("Factor de conversión actualizado");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }
}