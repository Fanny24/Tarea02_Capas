package pages;

import driver.driver;
import javafx.scene.shape.MoveTo;
import org.jsoup.select.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class checkout04_Shipping {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='cgv']")
    WebElement checkTerminos;

    @FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    WebElement btnContinueShipping;

    public checkout04_Shipping(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void Terminos(){
        Driver.customWait_clickable(checkTerminos);  //verif
        System.out.println("Estado inicial check:  " + checkTerminos.isSelected());
        checkTerminos.click();
        Driver.implicitwait();
        System.out.println("Estado final check:  " + checkTerminos.isSelected());
    }

    public void SecShipping(){
        //.prop("checked", true);
        Driver.implicitwait();
        Driver.customWait_clickable(btnContinueShipping);
        btnContinueShipping.click();
        System.out.println("Shipping Finalizado");
    }
}
