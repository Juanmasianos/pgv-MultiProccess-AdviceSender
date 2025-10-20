# Proyecto multi procesos

Hola adri estoy medio malo haciendo esto pero en verdad me lo he pasao bien :D

## COmo se usa

Es un programa en su mayoría sencillo, aqui las instrucciones de uso:

### Antes de arrancar:

Antes de poner en marchar hay que avisar que en los archivos .csv esta puesto como correos de los estudiantes el mio, "juanmacocolo276@gmail.com". En caso de hacer pruebas porfi cambiar los correos. 
Tambien, en el archivo [MailSender](./src/net/salesianos/mailsender/MailSender.java) hay que cambiar los parametros de SENDER_USER y PASSWORD_APPLICATION porque son valores que no funcionan. Igual aunque se ponga la contraseña correcta no valdrá por razones de seguridad de google, que para sortear este obstaculo hay que generar una contraseña que google da para la aplicacion. Es inevitable ver un log de error si no se hace esto ¯\_(ツ)_/¯

### Arrancar el programa: 

Hay dos opciones, se puede abrir la carpeta normal en Visual Studio y dar a "run" o en una terminal en la carpeta del proyecto ejecutar con el comando java el App.java. 
Sencillito.

### Una vez arrancado:

Pedira presionar enter para continuar al menu, el cual pedira un numero entre 0 y 6. Cada una de las opciones(menos el 0) son para analizar los distintos archivos .csv y mandar un correo a los alumnos que tengan las faltas suficientes como para un aviso.

Sensillo
