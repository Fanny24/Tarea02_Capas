package pages;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class inventory_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='center_column']/ul/li/a")
    WebElement btnHome;

    @FindBy(xpath="//*[@id='search_query_top']")
    WebElement txtBuscar;

    @FindBy(xpath="//*[@id='center_column']/h1/span[1]")
    WebElement VerifEtiqBusq;

    @FindBy(xpath="//*[@id='center_column']/ul/li/div/div[2]/h5/a")
   // @FindBy(className = "product-name")
    WebElement TitleProd;

    @FindBy(xpath="//*[@id='columns']")
    WebElement VerifConteProd;

    @FindBy(xpath="//*[@id='quantity_wanted_p']/a[2]/span")
    WebElement btnIncrement;

    @FindBy(id="quantity_wanted")
    WebElement txtCantProd;

    @FindBy(xpath = "//*[@id='group_1']")
    WebElement txtTamProd;                                      //**combobox

    @FindBy(xpath="//*[@id='add_to_cart']/button")
    WebElement btnAddCart;

    @FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    WebElement btnContShop;

    @FindBy(xpath="//*[@id='columns']/div[1]/a[1]")
    WebElement btnRerturnHom;

    public inventory_page(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void Home1() {
        Driver.customWait_clickable(btnHome);
        btnHome.click();
    }

    public void Busqueda(String busq) {
        Driver.customWait_clickable(txtBuscar);
        txtBuscar.sendKeys(busq);
        txtBuscar.sendKeys(Keys.ENTER);
    }

    public void SelecProd() {
        Driver.implicitwait();
        //Driver.customWait_clickable(TitleProd);
        VerifEtiqBusq.isDisplayed();
        //TitleProd.click();
        System.out.println("\u001B[43;30mIniciando compra . . .\u001B[0m");
        System.out.println("Producto: " + TitleProd.getText());
        TitleProd.click();
    }

    public void SelectCant() {
        VerifConteProd.isDisplayed();
        Driver.customWait_clickable(btnIncrement);
        btnIncrement.click();
        btnIncrement.click();
        Driver.implicitwait();
        //System.out.println("Cantidad: " + txtCantProd.getText());
    }

    public void SelectTam(String tam) {                       //***** comboBx
        txtTamProd.isDisplayed();
       // Driver.customWait_clickable(txtTamProd);
        txtTamProd.click();
        Driver.implicitwait();
        txtTamProd.sendKeys(tam);
       //System.out.println("Talla: " + txtTamProd.getText());
    }

    public void AgregarCar() {
        Driver.customWait_clickable(btnAddCart);
        btnAddCart.click();
        System.out.println("Producto seleccionado -> Ok");
        System.out.println("");
    }

    public void ContinuarShop(){
        Driver.customWait_clickable(btnContShop);
        btnContShop.click();
    }

    public void RetornarInicio(){
        Driver.customWait_clickable(btnRerturnHom);
        btnRerturnHom.click();
    }

}
