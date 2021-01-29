package logic;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import pages.inventory_page;


public class inventory_logic {
    driver Driver = null;
    inventory_page invP = null;

    public inventory_logic(driver driver) {
        this.Driver = driver;
        invP = new inventory_page(Driver);
    }
    public void AgregarProd(String busq, String tam1) {
        invP.Home1();
        invP.Busqueda(busq);
        invP.SelecProd();
        invP.SelectCant();
        invP.SelectTam(tam1);
        invP.AgregarCar();
        invP.ContinuarShop();
        invP.RetornarInicio();
      }
}
