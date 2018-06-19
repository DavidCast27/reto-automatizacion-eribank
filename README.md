# Introduccion 
Esta es la automatizacion de la APP Eribank, para la plataforma Android, desarrollada bajo el patro page object model, utilizando las herramnientas de Appium, Cucumber y Serenity BDD.

Se automatizaron los procesos de autenticacion y de pagos de la APP. Se identica un caso exitoso y uno alterno, el primero cuando se puede autenticar y hacer el pago correctamente, el segundo cuando las credenciales de la autenticacion no son correctas y no permite la autenticacion.
 

# Getting Started

## Pre-requisitos

- [Appium Desktop](http://appium.io/)
- Dispositivo Android, sea virtual o fisico
- Eclipse IDE
	
## Proceso de Instalacion

1. Clone el proyecto: https://github.com/DavidCast27/reto-automatizacion-eribank.git.
2. Importar el proyecto como maven project.
3. Instalar en el dispositivo Android el .apk  que se encuentra en la ruta `src/test/resources/App`.
4. Cambiar en el `serenity.properties`  
	- `appium.app` por la ruta estatica donde este su apk.
	- `appium.hub` por la ip con la que arranque su appium desktop.
	- `appium.deviceName` por el nombre que tenga su dispositivo, esto se consigue ejecutando el siguiente comando por su CLI favorito.

```sh
	$ adb devices
```