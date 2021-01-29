package logic;

import driver.driver;
import pages.landing_page;

public class landing_logic {
    driver Driver = null;
    landing_page lp = null;

    public landing_logic(driver driver) {
        this.Driver = driver;
        lp = new landing_page(Driver);
    }

    public void IngresarSignIn(){
        lp.Sign_In1();
    }

    public void IrMiPerfil(){
        lp.MiPerfil1();
    }
}
