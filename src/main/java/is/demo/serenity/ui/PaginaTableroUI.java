package is.demo.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaTableroUI extends PageObject {

    public static final Target BTN_MAS_INFO = Target.the("Boton de mas infomracion").located(By.xpath("(//a[@class=\"card-footer\"])[4]"));

}
