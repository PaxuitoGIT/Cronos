package org.example;
import java.util.Date;

public class CronometroCosmico {
    static Date fechaPlanetaTierra;
    static Date fechaPlanetaNuevo;

    static {
        fechaPlanetaTierra = new Date();
        long fnp = fechaPlanetaTierra.getTime();
        fechaPlanetaNuevo = new Date((long) (fnp * CronometroCosmico.getFC()));
    }

    static double FC = 0.5;

    public static double getFC() {
        return FC;
    }

    public static void setFC(double FC) {
        try {
            CronometroCosmico.FC = FC;
            long fnp = fechaPlanetaTierra.getTime();
            fechaPlanetaNuevo = new Date((long) (fnp * CronometroCosmico.getFC()));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static Date getFechaPlanetaTierra() {
        return fechaPlanetaTierra;
    }

    public static Date getFechaPlanetaNuevo() {
        return fechaPlanetaNuevo;
    }

}
