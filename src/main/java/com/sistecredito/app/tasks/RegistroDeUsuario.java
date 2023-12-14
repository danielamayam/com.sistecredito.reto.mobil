package com.sistecredito.app.tasks;

import com.sistecredito.app.interactions.CerrarNotificaciones;
import com.sistecredito.app.models.Registro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.logging.Logger;
import static com.sistecredito.app.userInterfaces.UiFormulario.*;
import static com.sistecredito.app.userInterfaces.UiHome.*;

public class RegistroDeUsuario implements Task {

    private Registro registro;

    public RegistroDeUsuario(Registro registro){
        this.registro = registro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CerrarNotificaciones.on(),
                Click.on(BTN_REGISTRATE),
                Click.on(BTN_CON_TU_CORREO),
                Enter.theValue(registro.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(registro.getCorreo()).into(TXT_CORREO),
                Enter.theValue(registro.getCorreo()).into(TXT_CONFIRMAR_CORREO),
                Enter.theValue(registro.getPassword()).into(TXT_CONTRASENA),
                Enter.theValue(registro.getPassword()).into(TXT_CONFIRMAR_CONTRASENA),
                Click.on(BTN_ENVIAR),
                WaitUntil.the(LBL_ALERTA, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()
        );
        Logger.getAnonymousLogger().info("Se finaliza el formulario de registro");
    }

    public static RegistroDeUsuario on(Registro registro){
        return Tasks.instrumented(RegistroDeUsuario.class, registro);
    }
}
