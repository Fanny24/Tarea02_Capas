package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.TestNGAntTask.Mode.junit;

public class checkout_page {



    //solo debemos considerar los comportamientos basicos de cada elemento de la pagina
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement cmbShopCar;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElement btnCheckOut;

    @FindBy(xpath="//*[@id=\"center_column\"]")
    WebElement VerifContSummary;

    @FindBy(xpath="//*[@id=\"order_step\"]/li[1]/span")
    WebElement SecSummary;

    @FindBy(xpath="//*[@id=\"order_step\"]/li[2]/span")
    WebElement SecSigIn;

    @FindBy(xpath="//*[@id=\"order_step\"]/li[3]/span")
    WebElement SecAddress;

    @FindBy(xpath="//*[@id=\"order_step\"]/li[4]/span")
    WebElement SecShipping;

    @FindBy(xpath="//*[@id=\"step_end\"]/span")
    WebElement SecPayment;

    @FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")          //summary btn continue
    WebElement btnContinueSummary;

    //* Se omite btn2 ya que para este tc se salta la sección 'Sign in'

    @FindBy(xpath = "//*[@id=\'center_column\']/form/p/button/span")
    WebElement btnContinueAddress;
    //address btn continue
            //(css="//button [@name='processAddress']")
            ////button [@name='processAddress']
    //*[@id="center_column"]/form/p/button
            //#center_column > form > p > button

            //"//*[@id=\"center_column\"]/form/p/button")
            //#center_column > form > p > button
            //*[@id="center_column"]/form/p/button/span
            //*[@id="center_column"]/form/p/button
            ///*[@id=\"center_column\"]/form/p/button/span"
            //*[@id=\"center_column\"]/form/p/button"                   //address btn continue


    @FindBy(id="cgv")
    WebElement checkTerminos;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")                       //shipping btn continue
    WebElement btnContinueCheck4;

    @FindBy(id="total_price")
    WebElement VerifTotal;

    @FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement btnBankWire;

    @FindBy(xpath="//*[@id=\"center_column\"]/form/div")
    WebElement VerifContedPay;

    @FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")           //payment
    WebElement btnConfirOrden;

    @FindBy(xpath="//*[@id=\"center_column\"]/div/p/strong")
    WebElement MsjConfirm;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    WebElement btnPerfil;

    @FindBy (xpath = "//*[@id=\"center_column\"]/form/p")
    WebElement auxBtn3;

    public checkout_page(driver driver) {
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
        //Driver.implicitwait();
        //btnContinueCheck1.click();
        Driver.implicitwait();
        //btnContinueCheck1.isEnabled();
        btnContinueSummary.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ("arguments [0] .click ();", btnContinueSummary);
        js.executeScript("alert('Probando...');");

    }

    public void SecAddress(){
        Driver.implicitwait();
        btnContinueAddress.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ("arguments [0] .click ();", btnContinueAddress);
        js.executeScript("alert('Probando...');");
        //VerifContSummary.isDisplayed();
      //  auxBtn3.isDisplayed();
       // Driver.implicitwait();
       //Driver.customWait_clickable(btnContinueCheck3);
       // btnContinueCheck3.isSelected();
     //   btnContinueCheck3.click();
      //  Driver.implicitwait();
    }

    public void SecShipping(){
        Driver.customWait_clickable(VerifContSummary);
        SecShipping.isDisplayed();
        Driver.customWait_clickable(checkTerminos);
        Driver.customWait_clickable(btnContinueCheck4);
        checkTerminos.isSelected();
        btnContinueCheck4.click();
    }

    public void SecPayment(){
        Driver.customWait_clickable(VerifContSummary);
        SecPayment.isDisplayed();
        VerifTotal.isDisplayed();
        Driver.customWait_clickable(btnBankWire);
        btnBankWire.click();
    }

    public void SecPayment_Confirm() {
        VerifContedPay.isDisplayed();
        Driver.customWait_clickable(btnConfirOrden);
        btnConfirOrden.click();
    }

    public String MsjConfirmacion(){
        Driver.customWait_clickable(MsjConfirm);
        String s= MsjConfirm.getText();
        return s;
        //MsjConfirm.isDisplayed();
        //MsjConfirm.getText();
    }

    public void PerfilUsuario(){
        Driver.customWait_clickable(btnPerfil);
        btnPerfil.click();
    }

}
