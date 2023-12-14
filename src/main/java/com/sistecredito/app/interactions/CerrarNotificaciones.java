package com.sistecredito.app.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.sistecredito.app.userInterfaces.UiHome.*;

public class CerrarNotificaciones implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PERMISO_FOTOS),
                Click.on(BTN_PERMISO_FOTOS),
                Click.on(TXT_CONTINUAR),
                Click.on(BTN_PERMISO_VIDEOS),
                Click.on(BTN_PERMISO_VIDEOS)
        );
    }

    public static CerrarNotificaciones on() {
        return Instrumented.instanceOf(CerrarNotificaciones.class).withProperties();
    }
}
