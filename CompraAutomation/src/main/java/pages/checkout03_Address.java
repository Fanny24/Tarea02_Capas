package pages;

import driver.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class checkout03_Address {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='form']/p/button")
    WebElement btnContinueAddress;

    //** pertenece shipping pero es capturado con el boton Address
    @FindBy(xpath = "//*[@id='cgv']")
    WebElement checkTerminos;

    public checkout03_Address(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void SecAddress(){
        Driver.implicitwait();
        System.out.println("Estado inicial check:  " + checkTerminos.isSelected());
        checkTerminos.click();
        Driver.implicitwait();
        System.out.println("Estado final check:  " + checkTerminos.isSelected());
        btnContinueAddress.click();
        System.out.println("Address Finalizado");
    }
}

//otra forma con jexecutor dar clic a un botón
//  JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript ("arguments [0] .click ();", btnContinueAddress);