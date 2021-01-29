package pages;

import driver.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout01_Summary {

    //solo debemos considerar los comportamientos basicos de cada elemento de la pagina
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a")
    WebElement cmbShopCar;

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]")
    WebElement btnCheckOut;

    @FindBy(xpath="//*[@id='center_column']")
    WebElement VerifContSummary;

    @FindBy(xpath="//*[@id='center_column']/form/p/button")
    WebElement btnContinueSummary;

    public checkout01_Summary(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void shoppingCar()
    {
    Driver.customWait_clickable(cmbShopCar); //comboBx
    cmbShopCar.click();
    }

    public void checkout(){
        Driver.customWait_clickable(btnCheckOut);
        btnCheckOut.click();
    }

    public void SecSummary(){
        Driver.implicitwait();
        Driver.scroll(100);
        btnContinueSummary.isEnabled();
        btnContinueSummary.click();
        System.out.println("Summary Finalizado");
    }
}
