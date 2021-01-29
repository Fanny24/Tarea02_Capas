package test;

import driver.driver;
import logic.createAccount_logic;

public class createAccount {
    public static void main(String[] args) throws InterruptedException {

        driver Driver = new driver();
        Driver.goto_url("http://automationpractice.com/");

        createAccount_logic cal = new createAccount_logic(Driver);
        System.out.println("Crear Cuenta . . .");
        cal.crearDetalle("createAcount@gmail.com","Nametest","Apetest","tester13@gmail.com","Prueba2021",
                "12","April","1987","Minedu","Otic","Ucsi","San borja","Guardia 115",
                "Lima","Nevada","88901","United States","999555999","Client01");
        System.out.println("Creación de cuenta exitosa");

        Driver.teardown();
    }
}