package logic;

import driver.driver;
import pages.checkout01_Summary;

public class checkout01_SummaryLog {
    driver Driver = null;
    checkout01_Summary Confir = null;

    public checkout01_SummaryLog(driver driver) {
        this.Driver = driver;
        Confir = new checkout01_Summary(Driver);
    }

    public void ConfirmSummary() {
        Confir.shoppingCar();
        Confir.checkout();
        Confir.SecSummary();


    }


}
