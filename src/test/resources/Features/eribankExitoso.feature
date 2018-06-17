@RETO_ERIBANK
Feature: APP eribank
  Una persona ingresa a la app de eribank y hace un pago.

  #Background: 
    #Given Cargar entorno APP PERSONAS

  @TestCase1
  Scenario Outline: Hace el pago Exitosamente
    Given Que Cargo los Datos de la transaccion
      | <ID> | <rutaLogCanal> | <nombreLogCanal> | <rutaLogSTI> | <nombreLogSTI> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <pregunta1> | <pregunta2> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoTransaccion> | <codigoOperacion> |
    And Consultas Previas Autenticacion
    When Me autentico en App Personas
    Then Verifico el resultado obtenido de la autenticacion
    And Consultas Posteriores Autenticacion
    When Consulto Trace
    Then Verifico LogCanal-COMFFLGWWW
    And Verifico LogSTI-STIFFLGAPP

    Examples: 
      | ID | rutaLogCanal                                                | nombreLogCanal        | rutaLogSTI                                              | nombreLogSTI        | numeroDocumento | tipoDocumento | usuario       | clave | segundaClave | pregunta1 | pregunta2 | orientacion | codigoError | codigoTransaccion | resultadoEsperado | tipoTransaccion | codigoOperacion |
      ##@externaldata@./src/test/resources/DataDriven/Autenticacion/Trn0369Autenticacion.xlsx@Datos