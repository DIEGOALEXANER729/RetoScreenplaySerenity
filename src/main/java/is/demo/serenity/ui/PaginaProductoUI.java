package is.demo.serenity.ui;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PaginaProductoUI {

    @FindBy(how =  How.XPATH, using = "//div[@class=\"slick-viewport\"]")
    public List<WebElementFacade> listProducto;

    public static final Target BTN_NUEVO_PRODUCTO = Target.the("Boton de mas infomracion").located(By.xpath("//span[@class=\"button-inner\"]/i[@class=\"fa fa-plus-circle text-green\"]"));

    public static final Target TXT_BUSCAR_PRODUCTO = Target.the("Boton de mas infomracion").located(By.xpath("//input[@class=\"s-Serenity-QuickSearchInput s-QuickSearchInput\"]"));

    public static final Target LBL_VALIDAR_PRODUCTO = Target.the("Boton de mas infomracion").located(By.xpath("//div[@class=\"slick-cell l1 r1\"]/a[contains(text(),'ProductDiegoIpiales')]"));

    public List<WebElementFacade> getListProducto() {
        return listProducto;
    }







}
