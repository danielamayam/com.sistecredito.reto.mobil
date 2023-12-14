Feature: Registro de usuario

  Como cliente del sistécredito
  Deseo registrarme en la app
  Para interactuar con la app

  @registro
  Scenario Outline: Usuario registra su nuevo usuario
    Given que "Daniel" ingresa en la app
    When diligencia todos los datos de registro
      |nombre|correo|password|
      |<nombre>|<correo>|<password>|
    Then válida que modal de registro "<mensaje>"

    Examples: Tabla Registro
    |nombre|correo|password|mensaje|
    |Reto siste|retosistecredito6@mailsac.com|Asdf1234|¡Revisa tu correo electrónico!|

