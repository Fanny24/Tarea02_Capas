package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_page {
    public driver Driver = null;
    public WebDriver driver = null;


    @FindBy(xpath = "//*[@id='email']")
    WebElement user1;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement pass1;

    @FindBy(xpath = "//*[@id='SubmitLogin']/span")
    WebElement loginBtn;

    public register_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void setUsername(String user) {
        Driver.implicitwait();
        user1.sendKeys(user);
    }

    public void setPassword(String password) {
        Driver.implicitwait();
        pass1.sendKeys(password);
    }

    public void login() {
        Driver.customWait_clickable(loginBtn);
        loginBtn.click();
    }

}
