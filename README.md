# Sistema de Ventas "Dulcerías CineDEV 🍬"

Este proyecto es una aplicación simple en Java que simula un sistema de ventas para una dulcería. Utiliza los principios de Programación Orientada a Objetos (OOP), clases abstractas, interfaces y manejo de excepciones con bloques try-catch-finally.

## Funcionalidades

- Agregar combos a un carrito de compras.
- Mostrar detalles de los productos en el carrito.
- Calcular el total de la compra.
- Procesar una venta, vaciando el carrito después de completar la transacción.
- Manejo de errores de entrada con bloques try-catch, y asegurando el cierre de recursos con `finally`.

## Estructura del Proyecto

- **Product**: Clase abstracta que representa un producto genérico en la dulcería.
- **Soda**: Clase concreta que hereda de Producto y selecciona el sabor de la bebida.
- **Popcorn**: Clase concreta que hereda de Producto y selecciona el sabor de la palomitas.
- **Snack**: Clase concreta que hereda de Producto y permite agregar snack.
- **Cart**: Clase que permite agregar productos y calcular el total de la compra.
- **Main**: Clase principal que ejecuta el programa y gestiona la interacción con el usuario.

## Requisitos

- Java 8 o superior.
- Un IDE como IntelliJ IDEA, Eclipse o NetBeans para ejecutar el proyecto, o usar la línea de comandos de Java.



## Autor
Luis Pablo Chávez

Si tienes preguntas o sugerencias, no dudes en contactarme a través de mi email o abrir un issue en el repositorio.
