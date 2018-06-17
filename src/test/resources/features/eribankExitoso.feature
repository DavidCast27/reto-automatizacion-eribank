@RETO_ERIBANK
Feature: APP eribank
  Una persona ingresa a la app de eribank y hace un pago.

  #Background:
  #Given Cargar entorno APP PERSONAS
  @TestCase1
  Scenario Outline: Hace el pago Exitosamente
    Given Cargo los Datos de la transaccion
      | <ID> | <usuario> | <clave> | <telefono> | <nombre> | <pais> | <orientacion> | <monto> |
    When Me autentico en la App
    Then Verifico el resultado obtenido de la autenticacion
    When Seleccion hacer un pago
    And Ingreso informacion del pago
    When Confirmo el pago
    Then Verifico el que el pago se realizara

    Examples: 
      | ID | usuario | clave   | telefono   | nombre | pais | orientacion | monto |
      ##@externaldata@./src/test/resources/DataDriven/dataDrivenEriBank.xlsx@Datos
      |1|company|company|1234567890 |NENE|USA|acierto|1000|
