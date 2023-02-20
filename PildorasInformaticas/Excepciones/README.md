# Excepciones.

En esta seccion se estaran mostrando algunos ejemplos sobre el manejo de
Excepciones, los cuales se dividen en dos grandes grupos: Los errores en 
tiempo de Compilacion y los errores en tiempo de Ejecucion.

Los Errores en tiempo de Compilacion ocurren por una mala sintaxis de parte
del programador al momento de escribir el codido, son errores que impiden
la compilacion y posterior ejecucion del programa que se escribe.

Los Errores en tiempo de Ejecucion son aquellos que se originan al momento
de que el programa se encuentra compilado y en ejecucion, estos errores son
mas dificiles de detectar que los del grupo anterior (tiempo de Compilacion),
cuando el archivo .class esta en ejecucion ocurre un error que para Java es un
objeto.

Todo objeto o error que se genera en tiempo de ejecucion es de tipo Throwable y
esta a su vez se subdivide en dos tipos Error y Exception.

El manejo de errores en Java se focaliza de los objetos que heredan de la clase
Exception y de todas las subclases que heredan de esta.