package is.demo.serenity.task;

import is.demo.serenity.utils.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static is.demo.serenity.ui.PaginaTableroUI.BTN_MAS_INFO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaTableroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    

    }

    public static Performable PaginaTableroTask(){
        return instrumented(PaginaTableroTask.class);
    }
}
