package org.example;
import java.util.Date;

public class CronometroCosmico {
    Date fechaPlanetaTierra;
    Date fechaPlanetaNuevo;

    public CronometroCosmico() {
        fechaPlanetaTierra = new Date();
        fechaPlanetaNuevo = new Date();
    }

    static double FC = 0.5;

    public static double getFC() {
        return FC;
    }

    public static void setFC(double FC) {
        CronometroCosmico.FC = FC;
    }

    public Date getFechaPlanetaTierra() {
        return fechaPlanetaTierra;
    }

    public void setFechaPlanetaTierra(Date fechaPlanetaTierra) {
        this.fechaPlanetaTierra = fechaPlanetaTierra;
    }

    public Date getFechaPlanetaNuevo() {
        return fechaPlanetaNuevo;
    }

    public void setFechaPlanetaNuevo(Date fechaPlanetaNuevo) {
        this.fechaPlanetaNuevo = fechaPlanetaNuevo;
    }
}
