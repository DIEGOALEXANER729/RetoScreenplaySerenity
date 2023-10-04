package is.demo.serenity.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import is.demo.serenity.interactions.ClicNuevoProducto;
import is.demo.serenity.interactions.ClicTipoProducto;
import is.demo.serenity.questions.ValidarProductoQuestions;
import is.demo.serenity.task.*;
import is.demo.serenity.utils.EsperaImplicita;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CrearProductoStepDefinitions {

    @Before
    public void setUser(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Cuando("el usuario abra el navegador en la url")
    public void elUsuarioAbraElNavegadorEnLaUrl() throws IOException {

        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/")
        );

    }
    @Cuando("el usuario ingresa el  usuario y contraseña y da click en iniciar sesion")
    public void elUsuarioIngresaElUsuarioYContraseñaYDaClickEnIniciarSesion() {

        theActorCalled("usuario").attemptsTo(PaginaInicioTask.PaginaInicioTask());
    }


    @Cuando("el usuario de click en More Info de productos")
    public void elUsuarioDeClickEnMoreInfoDeProductos() {
        theActorCalled("usuario").attemptsTo(ClicTipoProducto.ClicTipoProducto());
    }
    @Cuando("el usuario de click en nuevo Producto")
    public void elUsuarioDeClickEnNuevoProducto() {
       theActorCalled("usuario").attemptsTo(ClicNuevoProducto.ClicNuevoProducto());
    }


    @Cuando("el usuario ingrese Nombre del producto, unidades en stock, unidades en pedido, nivel de reorden y de clicl en guardar")
    public void elUsuarioIngreseNombreDelProductoUnidadesEnStockUnidadesEnPedidoNivelDeReordenYDeCliclEnGuardar() {
        theActorCalled("usuario").attemptsTo(PaginaNuevoProductoTask.PaginaNuevoProductoTask());
    }

    @Cuando("^el usuario de  en buscar ingrese producto$")
    public void elUsuarioDeEnBuscarIngreseProducto() {
        theActorCalled("usuario").attemptsTo(BuscarProductoTask.BuscarProductoTask());
    }


    @Entonces("el usuario visualizara el producto creado en la lista")
    public void elUsuarioVisualizaraElProductoCreadoEnLaLista() {
        theActorCalled("usuario").should(
                seeThat(
                        "Se visualiza producto",
                        ValidarProductoQuestions.ValidarProductoQuestions(),
                        Matchers.equalTo(true)
                )

        );
        EsperaImplicita.esperaImplicita(5);

    }

}
