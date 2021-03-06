# Parcial tercio dos servicio arcotangente
Implementamos el servicio de arco tangente, la página del servicio https://npqt6iykc7.execute-api.us-east-1.amazonaws.com/parcial?value=3.141592  
Enlace de la prueba  
https://youtu.be/wtKnQ21RBhc  

## Prerequisitos
* Maven
* Git
* Java
* AWS
* CircleCi

## AWS  
https://npqt6iykc7.execute-api.us-east-1.amazonaws.com/parcial?value=3.141592 

## Instalación
Para usar este programa debe abrir la consola (CMD) ir a la ubicación donde desee guardar el programa y ejecutar este comando:
```
git clone https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN.git
```

## Ejecución
Entramos a la carpeta creada por el comando anterior y entramos a "AREP-LAB-4" desde la consola de comandos (CMD), ejecutamos estos comandos:
```
* mvn package
* mvn clean compile
```
<img src="https://github.com/Carlos96999/AREP-LAB-5/blob/master/img/ejecucion.PNG?raw=true">  

## Iniciar programa de forma local
Entramos a la carpeta creada del laboratorio "AREP-LAB-5" y ejecutamos el siguiente comando:  
```  
java -cp target/classes edu.escuelaing.arep.App
```  

## Pruebas
Si desea conocer la ejecución de las pruebas, puede ejecutar en consola el comando mvn test (en la misma ubicación donde ejecuto los comandos de la parte de Ejecución).

<img src="https://github.com/Carlos96999/AREP-LAB-5/blob/master/img/pruebas.PNG?raw=true">

## Paso a paso  
Ingresamos al servicio de Lambda  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture.PNG?raw=true">  
Seleccionamos Lambda  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture2.PNG?raw=true">  
Seleccionamos el rol de "AdministratorAccess"  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture3.PNG?raw=true">  
Creamos el rol  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture4.PNG?raw=true">  
Seleccionamos cargar y subimos el archivo .jar de nuestra aplicación  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture5.PNG?raw=true">    
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture6.PNG?raw=true">  
luego editamos "Configuración del tiempo de ejecución" y ponemos la dirección del archivo de nuestra calculadora  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture7.PNG?raw=true">  
Si queremos probrar el programa, entramos a la pestaña probar y creamos una prueba
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture8.PNG?raw=true">  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture9.PNG?raw=true">  
Procedemos a crear nuestra api rest mendiante el servicio api de aws
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture10.PNG?raw=true">  
Creamos un nuevo método, el método get
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture11.PNG?raw=true">  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture12.PNG?raw=true">  
Llamamos a nuestra función API con el mismo nombre de la función lambda creada anteriormente
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture13.PNG?raw=true">  
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture14.PNG?raw=true">  
Creamos una solicitud método en get dando nombre a la variable de nuestra respuesta "value", por último nos devolvemos y vamos a integración y creamos otro parametro de nombre Value y "method.request.querystring.value" debe tener el valor de la variable creada en solicitud de método y creamos nuestra plantilla "application/json"
<img src="https://github.com/Carlos96999/AREP-PArCIAL-T2ATAN/blob/master/img/Capture15.PNG?raw=true">  
PAra finalizar implementamos nuestra Api


## Desarrollo
Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)
* [AWS](https://aws.amazon.com/es/education/awseducate/)

## Licencia
[Licencia **GNU General Public License v3.0**](https://github.com/Carlos96999/AREP-LAB-5/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[Carlos Andrés Amorocho](https://github.com/Carlos96999)
