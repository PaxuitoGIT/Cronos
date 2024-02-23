package org.example;
import java.text.DateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CronometroCosmico cronometroCosmico = new CronometroCosmico(); // Necesaria para la inicialización de las fechas

        int opcion;
        double fc;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver fecha actual en la Tierra");
            System.out.println("2. Ver fecha actual en el nuevo planeta");
            System.out.println("3. Cambiar factor de conversión");
            System.out.println("4. Ver valores máximos para cada tipo de dato");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mFecha actual en la Tierra: " + DateFormat.getDateTimeInstance().format(CronometroCosmico.getFechaPlanetaTierra()) + "\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 2:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mFecha actual en el nuevo planeta: " + DateFormat.getDateTimeInstance().format(CronometroCosmico.getFechaPlanetaNuevo()) + "\033[0m");
                    System.out.println("\033[1;36mFactor de conversión actual: " + CronometroCosmico.getFC() + "\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 3:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.print("\033[1;36mIntroduce el nuevo factor de conversión: \033[0m");
                    fc = scanner.nextDouble();
                    CronometroCosmico.setFC(fc);
                    System.out.println("\033[1;36mFactor de conversión actualizado\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 4:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mValores máximos para cada tipo de dato:\033[0m");
                    System.out.println("\033[1;36mByte: " + Byte.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36mShort: " + Short.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36mInt: " + Integer.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36mLong: " + Long.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36mFloat: " + Float.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36mDouble: " + Double.MAX_VALUE + "\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 0:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mSaliendo...\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                default:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mOpción no válida\033[0m");
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
            }
        } while (opcion != 0);
    }
}