package logic;

import driver.driver;
import pages.perfilHistorial_page;

import java.util.ArrayList;

public class perfilHistorial_logic {
    driver Driver = null;
    perfilHistorial_page phist = null;

    public perfilHistorial_logic(driver driver) {
        this.Driver = driver;
        phist = new perfilHistorial_page(Driver);
    }

    public ArrayList<String> CodigoObtenido() {
       return phist.listHistorial();
    }

    public ArrayList<String> EstadoObtenido() {
        return phist.listEstado();
    }
}
