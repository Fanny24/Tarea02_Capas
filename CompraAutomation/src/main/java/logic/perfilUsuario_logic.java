package logic;

import driver.driver;
import pages.perfilUsuario_page;

public class perfilUsuario_logic {
    driver Driver = null;
    perfilUsuario_page pfusu = null;

    public perfilUsuario_logic(driver driver) {
        this.Driver = driver;
        pfusu = new perfilUsuario_page(Driver);
    }

    public void Perfil_user() {

        pfusu.perfilUser();
        pfusu.Historial();
    }
}
