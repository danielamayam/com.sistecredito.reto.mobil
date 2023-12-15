package com.sistecredito.app.userInterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class UiFormulario {

    public static final Target TXT_NOMBRE = Target.the("Input nombre")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/text_input_edit_name_register_user"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target TXT_CORREO = Target.the("Input correo")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/text_input_edit_email_register_user"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target TXT_CONFIRMAR_CORREO = Target.the("Input confirmar correo")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/text_input_edit_confirm_email"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target TXT_CONTRASENA = Target.the("Input contraseña")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/text_input_edit_password"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target TXT_CONFIRMAR_CONTRASENA= Target.the("Input confirmar contraseña")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/txt_password_register_user"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_ENVIAR= Target.the("Boton enviar")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/btn_send_register_user"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));


}
