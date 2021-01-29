package pages;

import driver.driver;
import javafx.scene.control.ComboBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.swing.*;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class createAccount_page {
    public driver Driver = null;
    public WebDriver driver = null;


   // @FXML private ComboBox CBox;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement emailCreate;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    WebElement CrearCtaBtn;

    //****//
    @FindBy(xpath = "//*[@id=\"id_gender1\"]")
    WebElement radioMr;

    @FindBy(xpath = "//*[@id=\"id_gender2\"]")
    WebElement radioMrs;

    @FindBy(id = "customer_firstname")
    WebElement Firstname;

    @FindBy(id = "customer_lastname")
    WebElement Lastname;

    @FindBy(id = "email")
    WebElement e_mail;

    @FindBy(id = "passwd")
    WebElement Password;

    @FindBy(id = "days")
    WebElement birthD;

    @FindBy(id = "months")
    WebElement birthM;

    @FindBy(id = "years")
    WebElement birthY;

    @FindBy(id = "firstname")
    WebElement  firstComp;

    @FindBy(id = "lastname")
    WebElement lastComp;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement address ;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement codPostal;

    @FindBy(id = "id_country")
    WebElement country;

    @FindBy(id = "other")
    WebElement infAdic;

    @FindBy(id = "phone")
    WebElement telefono;

    @FindBy(id = "phone_mobile")
    WebElement celular;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    WebElement btnRegister;

    public createAccount_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void Ingresar() {
        Driver.customWait_clickable(signIn);
        signIn.click();
    }

    public void setEmail(String email) {
        Driver.implicitwait();
        emailCreate.sendKeys(email);
    }

    public void crear() {
        Driver.customWait_clickable(CrearCtaBtn);
        CrearCtaBtn.click();

    }
    //***DETALLE REGISTRO CREAR CUENTA

    public void titulomr() {
        Driver.customWait_clickable(radioMr);
        radioMr.click();
    }

    public void titulomrs() {
        Driver.customWait_clickable(radioMrs);
        radioMrs.click();
    }

    public void setFirstname (String first) {
        Driver.implicitwait();
        Firstname.sendKeys(first);
    }

    public void setLastname(String last) {
        Driver.implicitwait();
        Lastname.sendKeys(last);
    }

    public void setEmailRepeat(String email) {
        e_mail.clear();
        Driver.implicitwait();
        e_mail.sendKeys(email);
    }

    public void setPassword(String pass1) {
        Driver.implicitwait();
        Password.sendKeys(pass1);
    }

    // por verificar combo boxs ***

    public void setDays(String days) {
        Driver.implicitwait();
        birthD.click();
        Driver.implicitwait();
        birthD.sendKeys(days);
    }

    public void setMonths(String months) {
        Driver.implicitwait();
        birthM.click();
        Driver.implicitwait();
       // birthM
        birthM.sendKeys(months);

      //  CBox.getValue().toString();
    }

    public void setYears(String years) {
        Driver.implicitwait();
        birthY.click();
        Driver.implicitwait();
        birthY.sendKeys(years);
    }

    public void setFirstComp (String firstC) {
        Driver.implicitwait();
        firstComp.sendKeys(firstC);
    }

    public void setLastComp(String lastC) {
        Driver.implicitwait();
        lastComp.sendKeys(lastC);
    }

    public void setCompany(String company1) {
        Driver.implicitwait();
        company.sendKeys(company1);
    }

    public void setAddress(String add1) {
        Driver.implicitwait();
        address.sendKeys(add1);
    }

    public void setAddress2(String add2) {
        Driver.implicitwait();
        address2.sendKeys(add2);
    }

    public void setCity(String city1) {
        Driver.implicitwait();
        city.sendKeys(city1);
    }

    public void setState(String state1) {
        Driver.implicitwait();
        state.click();
        Driver.implicitwait();
        state.sendKeys(state1);
     }

    public void setCodPostal(String cpost) {
        Driver.implicitwait();
        codPostal.sendKeys(cpost);
    }

    public void setCountry(String country1) {
        Driver.implicitwait();
        country.click();
        Driver.implicitwait();
        country.sendKeys(country1);
    }

    // obviamos campos opcionales Otros(infAdic) y teléfono, sólo verificamos existencia

    public void setCelular(String mobile) {
        infAdic.isEnabled();
        telefono.isEnabled();
        celular.sendKeys(mobile);
    }

    public void setAlias(String alias1) {
        Driver.implicitwait();
        alias.sendKeys(alias1);
    }

    public void registrar() {
        Driver.customWait_clickable(btnRegister);
        btnRegister.click();
        // agregué thread solo para visualizar esta parte
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
