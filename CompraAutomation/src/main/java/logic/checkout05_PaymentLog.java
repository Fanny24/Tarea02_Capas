package logic;

import driver.driver;
import pages.checkout05_Payment;

import java.util.ArrayList;

public class checkout05_PaymentLog {

    driver Driver = null;
    checkout05_Payment Pay = null;

    public checkout05_PaymentLog(driver driver) {
        this.Driver = driver;
        Pay = new checkout05_Payment(Driver);
    }

    public void ConfirmPayment() {
        Pay.ConfirmaPago();
    }

    public String CodConfirmacion(){ return Pay.CodigoConfirmacion();
    }

   // public ArrayList<String> CodConfirmacion_2() {         return Pay.CodigoConfirmacion_2();    }

}
