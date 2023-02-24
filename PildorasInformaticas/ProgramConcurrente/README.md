# Programacion Concurrente - Threads.

En esta seccion se estaran mostrando algunos ejemplos sobre la Programacion Concurrente y los Threads.

Java es un lenguaje que permite formular programas concurrentes. Esto es, existen en Java
sentencias que permiten construir un programa con múltiples líneas de flujo de control ( threads) que
se ejecutan concurrentemente si la plataforma es multiprocesadora o que ejecutan de forma
entralazada sus sentencias dando apariencia de concurrencia si la plataforma es monoprocesadora.

La unidad básica de concurrencia en Java es el Thread, que representa un proceso ligero que
comparte el mismo espacio de variables con los restantes threads del mismo programa. Dado que los
Threads de un programa Java son todos ellos internos al programa, no se necesita la protección de
seguridad de disponer de un único espacio de variables propio de cada threads, y al tener un espacio
de memoria único se aligera y facilita los cambios de contexto entre threads.