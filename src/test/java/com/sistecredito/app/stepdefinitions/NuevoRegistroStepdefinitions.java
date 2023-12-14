package com.sistecredito.app.stepdefinitions;

import com.sistecredito.app.models.Registro;
import com.sistecredito.app.tasks.AbreLaApp;
import com.sistecredito.app.tasks.RegistroDeUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static com.sistecredito.app.userInterfaces.UiHome.LBL_ALERTA;

public class NuevoRegistroStepdefinitions {
    @Given("que {string} ingresa en la app")
    public void queDanielIngresaEnLaApp(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(
                AbreLaApp.sistecredito()
        );
    }
    @When("diligencia todos los datos de registro")
    public void diligenciaTodosLosDatosDeRegistro(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroDeUsuario.on(Registro.setData(dataTable).get(0))
        );
    }
    @Then("válida que modal de registro {string}")
    public void válidaQueModalDeRegistro(String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(mensaje).isEqualTo(LBL_ALERTA.resolveFor(OnStage.theActorInTheSpotlight()).getText())
        );
    }
}
