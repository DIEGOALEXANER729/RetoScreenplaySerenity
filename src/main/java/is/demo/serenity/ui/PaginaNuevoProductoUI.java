package is.demo.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaNuevoProductoUI  extends PageObject {

    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("ingresar nombre producto").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));
    public static final Target TXT_UNIDADES_STOCK = Target.the("ingresar unidades stock ").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsInStock"));
    public static final Target TXT_UNIDADES_PEDIDO = Target.the("ingresar unidades pedido ").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder"));
    public static final Target TXT_NIVEL_REORDEM = Target.the("ingresar nivel  reorden ").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ReorderLevel"));

    public static final Target BTN_GUARDAR_PRODUCTO = Target.the("boton ingresar").located(By.xpath("//div[@class=\"button-outer\"]/span/i[@class=\"fa fa-check-circle text-purple\"]"));


}
