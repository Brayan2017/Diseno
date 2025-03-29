PROBLEMA BURGER

Una hamburguesería desea crear hamburguesas a tu gusto, facilitando desde la hamburguesa básica hasta la hamburguesa que tu desees.

El patrón Builder se utiliza cuando la creación de un objeto es compleja y tiene múltiples combinaciones de parámetros opcionales. En este caso, el problema que se resuelve es la construcción flexible de hamburguesas con diferentes ingredientes (lechuga, carne de res, cerdo, pollo, tomate, cebolla y queso) sin necesidad de múltiples constructores o parámetros en un único constructor.
Beneficios del diseño:

1.	Evita constructores con demasiados parámetros: Permite crear hamburguesas con diferentes ingredientes sin necesidad de definir múltiples constructores en la clase Burger.
2.	Facilita la legibilidad y mantenimiento: El código es más claro, ya que cada ingrediente se añade mediante métodos específicos (withLettuce(), withBeef(), etc.).
3.	Mejora la extensibilidad: Si se desean agregar más ingredientes en el futuro, solo se necesita modificar la clase BurgerBuilder sin afectar la clase Burger.
4.	Permite la creación paso a paso: Se pueden agregar ingredientes de manera opcional sin depender del orden de los parámetros en un constructor tradicional.
