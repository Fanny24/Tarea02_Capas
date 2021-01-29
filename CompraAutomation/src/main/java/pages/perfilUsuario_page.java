package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.util.Strings;


public class perfilUsuario_page {
    public driver Driver = null;
    public WebDriver driver = null;


    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement btnPerfil;

    @FindBy(xpath = "//*[@id='center_column']/div/div[1]/ul/li[1]/a")
    WebElement btnOrderHistory;


    public perfilUsuario_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }


    public void perfilUser() {
        Driver.implicitwait();
        btnPerfil.click();
    }

    public void Historial() {
        Driver.customWait_clickable(btnOrderHistory);
        btnOrderHistory.click();
    }


}
