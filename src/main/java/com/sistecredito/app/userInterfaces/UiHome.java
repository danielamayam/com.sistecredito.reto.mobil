package com.sistecredito.app.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;

public class UiHome {
    public static final Target BTN_PERMISO_FOTOS = Target.the("")
            .locatedForAndroid(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target TXT_CONTINUAR = Target.the("")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/txt_next_permissions"))
            .locatedForIOS(AppiumBy.id("com.sistecredito.credinet.personas:id/txt_next_permissions"));

    public static final Target BTN_PERMISO_VIDEOS = Target.the("")
            .locatedForAndroid(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_REGISTRATE = Target.the("")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/btn_register"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_CON_TU_CORREO = Target.the("")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/register_by_email"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target LBL_ALERTA= Target.the("")
            .locatedForAndroid(AppiumBy.id("com.sistecredito.credinet.personas:id/txt_alert_title"))
            .locatedForIOS(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));
}
