package test;

import driver.driver;

import logic.register_logic;
public class TC_Logueo {

        public static void main(String[] args) throws InterruptedException {

            driver Driver = new driver();
            Driver.goto_url("http://automationpractice.com/index.php?controller=my-account");

            register_logic log = new register_logic(Driver);
            System.out.println("Iniciar Login");
            log.Logueo("fannyvch.24@gmail.com","Prueba2021");
            System.out.println("\u001B[43;30m Logueo Exitoso \u001B[0m");

            Driver.teardown();
        }
}
