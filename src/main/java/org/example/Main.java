package org.example;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CronometroCosmico cronometroCosmico = new CronometroCosmico(); // Es necesaria para la inicialización de las fechas, si se elimina, muestra error

        Recursos recursos = new Recursos();

        AlertaYMonitoreo alertaYMonitoreo = new AlertaYMonitoreo();

        int opcion;
        double fc;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver fecha actual en la Tierra");
            System.out.println("2. Ver fecha actual en el nuevo planeta");
            System.out.println("3. Cambiar factor de conversión");
            System.out.println("4. Ver valores máximos para cada tipo de dato");
            System.out.println("5. Calcular consumo de recursos");
            System.out.println("6. Monitorear variables ambientales críticas");
            System.out.println("7. Planificador de Tareas");
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
                case 5:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mIntroduce el consumo de agua: \033[0m");
                    double agua = scanner.nextDouble();
                    System.out.println("\033[1;36mIntroduce el consumo de comida: \033[0m");
                    double comida = scanner.nextDouble();
                    System.out.println("\033[1;36mIntroduce el consumo de oxígeno: \033[0m");
                    double oxigeno = scanner.nextDouble();
                    double[] consumos = {agua, comida, oxigeno};
                    System.out.println("\033[1;36mMedia de los consumos: " + recursos.calcularMedia(consumos) + "\033[0m");
                    System.out.println("\033[1;36mMínimo de los consumos: " + recursos.calcularMinimo(consumos) + "\033[0m");
                    System.out.println("\033[1;36mMáximo de los consumos: " + recursos.calcularMaximo(consumos) + "\033[0m");
                    System.out.println("\033[1;36mIntroduce el consumo diario: \033[0m");
                    double consumoDiario = scanner.nextDouble();
                    System.out.println("\033[1;36mIntroduce el número de días: \033[0m");
                    int dias = scanner.nextInt();
                    double[] necesidadesFuturas = recursos.predecirNecesidadesFuturas(consumoDiario, dias);
                    System.out.println("\033[1;36mNecesidades futuras: \033[0m");
                    for (double necesidad : necesidadesFuturas) {
                        System.out.println(necesidad);
                    }
                    System.out.println("\033[1;36mIntroduce el umbral: \033[0m");
                    double umbral = scanner.nextDouble();
                    if (recursos.alertaUmbralSeguro(umbral, consumos)) {
                        System.out.println("\033[1;36mAlerta: se ha superado el umbral\033[0m");
                    } else {
                        System.out.println("\033[1;36mNo se ha superado el umbral\033[0m");
                    }
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 6:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    alertaYMonitoreo.monitorVariables();
                    if (!alertaYMonitoreo.identificarEventos(5).isEmpty()) {
                        System.out.println("\033[1;36mEventos identificados\033[0m");
                    } else {
                        System.out.println("\033[1;36mNo se han identificado eventos\033[0m");
                    }
                    System.out.println("\033[1;36mDescomposición del problema: " + alertaYMonitoreo.descomponerProblema(100) + "\033[0m");
                    alertaYMonitoreo.alertaTripulacion();
                    alertaYMonitoreo.sugerenciaAjuste();
                    System.out.println("\033[1;36m------------------------\033[0m\n");
                    break;
                case 7:
                    System.out.println("\n\033[1;36m------------------------\033[0m");
                    System.out.println("\033[1;36mPlanificador de Tareas\033[0m");

                    PlanificadorTareas.Tarea tarea1 = new PlanificadorTareas.Tarea("Tarea 1", 2);
                    PlanificadorTareas.Tarea tarea2 = new PlanificadorTareas.Tarea("Tarea 2", 3);
                    PlanificadorTareas.Tarea tarea3 = new PlanificadorTareas.Tarea("Tarea 3", 1);

                    PlanificadorTareas.Tripulante tripulante1 = new PlanificadorTareas.Tripulante("Tripulante 1");
                    PlanificadorTareas.Tripulante tripulante2 = new PlanificadorTareas.Tripulante("Tripulante 2");

                    PlanificadorTareas planificador = new PlanificadorTareas(Arrays.asList(tarea1, tarea2, tarea3), Arrays.asList(tripulante1, tripulante2));

                    planificador.distribuirTareas();
                    planificador.visualizarHorarios();

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