package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_page {
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signIn1;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement btnMiPerfil;

    public landing_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void Sign_In1() {
        Driver.customWait_clickable(signIn1);
        signIn1.click();
   }

    public void MiPerfil1() {
        Driver.customWait_clickable(btnMiPerfil);
        btnMiPerfil.click();
    }
}
