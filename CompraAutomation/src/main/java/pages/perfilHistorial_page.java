package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.util.Strings;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Object;
//import java.io.Java Collections Framework

public class perfilHistorial_page {
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='order-list']/tbody/tr[1]/td[1]/a")
    WebElement tableLista;

    @FindBy(xpath = "//*[@id='order-list']/tbody/tr[1]/td[5]/span")
    WebElement statusOrder;

    @FindBy(id = "order-list")
    WebElement tableList;

    public perfilHistorial_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    //***

    public ArrayList<String> listHistorial() {
        List<WebElement> tFilas = tableList.findElements(By.tagName("tr"));
        ArrayList<String> nroOrden = new ArrayList<String>();
        String fila = "";

        for (int i = 1; i < tFilas.size(); ++i) {
            fila = tFilas.get(i).getText().substring(0, 9);
            nroOrden.add(fila);
        }
        //System.out.println("bbbb"+nroOrden);
        return nroOrden;
    }

    //***
    public ArrayList<String> listEstado() {
        List<WebElement> tstate = tableList.findElements(By.tagName("tr"));
        ArrayList<String> obtState = new ArrayList<String>();
        String estado = "";

        for (int j = 1; j < tstate.size(); ++j) {
            estado = tstate.get(j).getText().substring(28, 40);
            obtState.add(estado);
        }
        //System.out.println(obtState);
        return obtState;
    }
}



