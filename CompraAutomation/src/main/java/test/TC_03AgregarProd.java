package test;

import driver.driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import logic.register_logic;
import logic.landing_logic;
import logic.inventory_logic;
import logic.checkout01_SummaryLog;
import logic.checkout03_AddressLog;
import logic.checkout04_ShippingLog;
import logic.checkout05_PaymentLog;
import logic.perfilUsuario_logic;
import logic.perfilHistorial_logic;

import java.util.ArrayList;

public class TC_03AgregarProd {
    driver Driver = null;
    register_logic rlog = null;
    landing_logic lg = null;
    inventory_logic il = null;
    checkout01_SummaryLog check01 = null;
    checkout03_AddressLog check03 = null;
    checkout04_ShippingLog check04 = null;
    checkout05_PaymentLog check05 = null;
    perfilUsuario_logic puser = null;
    perfilHistorial_logic phist = null;


    @BeforeClass
    public void setupEnv() {
        Driver = new driver();
        rlog = new register_logic(Driver);
        lg = new landing_logic(Driver);
        il = new inventory_logic(Driver);
        check01 = new checkout01_SummaryLog(Driver);
        check03 = new checkout03_AddressLog(Driver);
        check04 = new checkout04_ShippingLog(Driver);
        check05 = new checkout05_PaymentLog(Driver);
        puser = new perfilUsuario_logic(Driver);
        phist = new perfilHistorial_logic(Driver);
    }

    @Test(priority = 1, testName = "Proceso de Compra")

    public void TestCase_01() throws InterruptedException {
         String codigo1 = "";
        ArrayList<String> codHistorial = null;  //codigo a buscar en el historial

        String estBuscado = "";
        ArrayList<String> estObtenido = null;

        Driver.goto_url("http://automationpractice.com/");

        lg.IngresarSignIn();
        rlog.Logueo("tester13@gmail.com", "Prueba2021");
        il.AgregarProd("faded short sleeve t-shirts","M");

        check01.ConfirmSummary();
        check03.ConfirmAddress();
        check04.ConfirmShipping();
        check05.ConfirmPayment();
      //  check05.CodConfirmacion();
        codigo1 = check05.CodConfirmacion(); //codigo obtenido al finalizar wizard(payment st01)
        //codigo1 = "DGTKRDLOY";

        lg.IrMiPerfil();
        puser.Perfil_user();


        estBuscado = "On backorder";

        //phist.CodigoObtenido();
        //phist.EstadoObtenido();

        estObtenido = phist.EstadoObtenido();
        codHistorial = phist.CodigoObtenido();

        if (codHistorial.contains(codigo1) && estObtenido.contains(estBuscado))
            System.out.println("La Orden se encuentra registrada - Estado: PENDIENTE");
        else
            System.out.println("Error en el registro de la Orden");

        System.out.println(" TC #03 Finalizado");
    }
}
