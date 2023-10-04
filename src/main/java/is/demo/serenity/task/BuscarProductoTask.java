package is.demo.serenity.task;

import is.demo.serenity.utils.EsperaImplicita;
import is.demo.serenity.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static is.demo.serenity.ui.PaginaNuevoProductoUI.*;
import static is.demo.serenity.ui.PaginaProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProductoTask implements Task {

    private static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("datos/data.xlsx", "Producto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        EsperaImplicita.esperaImplicita(2);
        actor.attemptsTo(Enter.theValue(datosExcel.get(0).get("NombreProducto")).into(TXT_BUSCAR_PRODUCTO));
        EsperaImplicita.esperaImplicita(5);

    }

    public static Performable BuscarProductoTask(){
        return instrumented(BuscarProductoTask.class);
    }
}
