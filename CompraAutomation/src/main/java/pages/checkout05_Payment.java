package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class checkout05_Payment {

    public driver Driver = null;
    public WebDriver driver = null;
    private String st01;

    @FindBy(xpath="//*[@id='center_column']/form/div")
    WebElement VerifContedPay;

    @FindBy(xpath="//*[@id='cart_navigation']/button/span")           //payment
    WebElement btnConfirPayment;

    @FindBy(xpath="//*[@id='center_column']/div/p/strong")
    WebElement MsjConfirm;

    //@FindBy(xpath = "//*[@id='center_column']/div") //original
    //@FindBy (className = "box")
    @FindBy (xpath = "//*[@id=\"center_column\"]/div")
            ////*[@id="center_column"]/div
    WebElement NroDeOrden;

    @FindBy(xpath = "//*[@id='center_column']/div/text()")
    WebElement auxiliar;

    public checkout05_Payment(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void ConfirmaPago() {
        VerifContedPay.isDisplayed();
        Driver.customWait_clickable(btnConfirPayment);
        btnConfirPayment.click();
        System.out.println("Payment Finalizado");
    }

    // modificado desde aqui...

    public String CodigoConfirmacion(){   // Original con el cual funcionaba
        Driver.implicitwait();
        Driver.implicitwait();
        //MsjConfirm.isDisplayed();
        //System.out.println(NroDeOrden.getText());
        String st01 = NroDeOrden.getText().substring(216,225);
        System.out.println("\u001B[43;30m Compra finalizada correctamente \u001B[0m");
        System.out.println("Orden N°:" + st01);
        return st01;
    }

    public ArrayList<String> CodigoConfirmacion_2() {
        List<WebElement> tFilas = NroDeOrden.findElements(By.tagName("br"));
        ArrayList<String> code1 = new ArrayList<String>();
        String fila = "";

        for (int i = 6; i < tFilas.size(); ++i) {  //
            fila = tFilas.get(6).getText().substring(0, 5);
            code1.add(fila);
        }
        System.out.println("bbbb"+code1);
        return code1;
    }


}
