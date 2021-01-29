package logic;

import driver.driver;
import pages.register_page;

public class register_logic {
    driver Driver = null;
    register_page lp = null;

    public register_logic(driver driver) {
        this.Driver = driver;
        lp = new register_page(Driver);
    }

    public void Logueo(String user, String pass){
        lp.setUsername(user);
        lp.setPassword(pass);
        lp.login();
    }
}
