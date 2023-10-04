package is.demo.serenity.interactions;

import is.demo.serenity.utils.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;


import static is.demo.serenity.ui.PaginaTableroUI.BTN_MAS_INFO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicTipoProducto implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_MAS_INFO));
        EsperaImplicita.esperaImplicita(2);
    }

    public static Performable ClicTipoProducto(){
        return  instrumented(ClicTipoProducto.class);
    }
}
