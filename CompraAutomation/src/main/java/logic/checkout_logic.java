package logic;

import driver.driver;
import pages.checkout_page;

public class checkout_logic {
    driver Driver = null;
    checkout_page Confir = null;

    public checkout_logic(driver driver) {
        this.Driver = driver;
        Confir = new checkout_page(Driver);
    }

    public void ConfirmOrden() {
        Confir.shoppingCar();
        Confir.checkout();
        //Confir.check_out();
        Confir.SecSummary();

        Confir.SecAddress();
        Confir.SecShipping();
        Confir.SecPayment();
        Confir.SecPayment_Confirm();
        Confir.MsjConfirmacion();
        Confir.PerfilUsuario();
    }

    public String MsjConfirm() {
        return Confir.MsjConfirmacion();
    }
}
