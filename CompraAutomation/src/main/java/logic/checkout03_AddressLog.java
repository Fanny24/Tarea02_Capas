package logic;

import driver.driver;
import pages.checkout03_Address;

public class checkout03_AddressLog {
    driver Driver = null;
    checkout03_Address Confir = null;

    public checkout03_AddressLog(driver driver) {
        this.Driver = driver;
        Confir = new checkout03_Address(Driver);
    }

    public void ConfirmAddress() {

        Confir.SecAddress();
    }
}
