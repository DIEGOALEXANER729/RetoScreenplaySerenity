package is.demo.serenity.task;

import is.demo.serenity.ui.PaginaProductoUI;
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

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaProductoTask implements Task {


    PaginaProductoUI paginaProductoUI = new PaginaProductoUI();


    private static ArrayList<Map<String, String>> datosExcel= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("datos/data.xlsx", "Producto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        EsperaImplicita.esperaImplicita(3);
        int tamProducto = paginaProductoUI.listProducto.size();



        String nombreProductoExcel = String.valueOf(datosExcel.get(0).get("NombreProducto"));
        actor.attemptsTo(Click.on(BTN_GUARDAR_PRODUCTO));





    }



    public static Performable PaginaProductoTask(){
        return instrumented(PaginaProductoTask.class);
    }
}
