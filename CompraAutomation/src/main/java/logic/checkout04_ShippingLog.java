package logic;

import driver.driver;
import pages.checkout04_Shipping;

public class checkout04_ShippingLog {
    driver Driver = null;
    checkout04_Shipping Ship = null;

    public checkout04_ShippingLog(driver driver) {
        this.Driver = driver;
        Ship = new checkout04_Shipping(Driver);
    }

    public void ConfirmShipping() {
        Ship.SecShipping();
    }
}
