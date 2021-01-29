package logic;

import driver.driver;
import org.openqa.selenium.WebElement;
import pages.createAccount_page;

public class createAccount_logic {
    driver Driver = null;
    createAccount_page caDet = null;


    public createAccount_logic(driver driver) {
        this.Driver = driver;
        caDet = new createAccount_page(Driver);


    }

    public void crearDetalle(String email1, String first,String last, String email,String pass1, String days, String months,
                             String years, String firstC, String lastC, String company1, String add1, String add2, String city1,
                             String state1, String cpost, String country1, String mobile, String alias1)
    {
        caDet.Ingresar();
        caDet.setEmail(email1);
        caDet.crear();
        caDet.titulomr();
        caDet.titulomrs();
        caDet.setFirstname(first);
        caDet.setLastname(last);

        caDet.setEmailRepeat(email);
        caDet.setPassword(pass1);
        caDet.setDays(days);
        caDet.setMonths(months);
        caDet.setYears(years);
        caDet.setFirstComp (firstC);
        caDet.setLastComp(lastC);
        caDet.setCompany(company1);
        caDet.setAddress(add1);
        caDet.setAddress2(add2);
        caDet.setCity(city1);
        caDet.setState(state1);
        caDet.setCodPostal(cpost);
        caDet.setCountry(country1);
        //caDet.setInfAdic();
        //caDet.setTelefono();
        caDet.setCelular(mobile);
        caDet.setAlias(alias1);
        caDet.registrar();
    }

}
