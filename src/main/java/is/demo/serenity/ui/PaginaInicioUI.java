package is.demo.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUI extends PageObject {


    public static final Target TXT_USUARIO = Target.the("enviar usuario").located(By.id("LoginPanel0_Username"));
    public static final Target TXT_CLAVE = Target.the("enviar clave ").located(By.id("LoginPanel0_Password"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").located(By.id("LoginPanel0_LoginButton"));


}
