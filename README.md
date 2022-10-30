# java_capitulo_6

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en <https://leanpub.com/aprendejava>

### Ejercicio 1

Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?

| Índice |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 10  | 11  |
| :----: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Valor  | 39  | -2  |     |     |  0  |     | 14  |     |  5  | 120 |     |     |

```
39,-2,0,0,0,0,14,0,5,120,0,0,
```

### Ejercicio 2

Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?

| Índice |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |
| :----: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Valor  | 'a' | 'x' |     |     | '@' |     | ' ' | '+' | 'Q' |     |

```
a,x, , ,@, , ,+,Q, ,
```

### Ejercicio 3

Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.

```
Introduce el número 1: 42
Introduce el número 2: 2
Introduce el número 3: 3
Introduce el número 4: 5
Introduce el número 5: 7
Introduce el número 6: 11
Introduce el número 7: 13
Introduce el número 8: 17
Introduce el número 9: 19
Introduce el número 10: 23
En la posición 9 está el número 23
En la posición 8 está el número 19
En la posición 7 está el número 17
En la posición 6 está el número 13
En la posición 5 está el número 11
En la posición 4 está el número 7
En la posición 3 está el número 5
En la posición 2 está el número 3
En la posición 1 está el número 2
En la posición 0 está el número 42
```

### Ejercicio 4

Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.

### Ejercicio 5

Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.

### Ejercicio 6

Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.

### Ejercicio 7

Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.

### Ejercicio 8

Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.

### Ejercicio 9

Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.

### Ejercicio 10

Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.

### Ejercicio 11

Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el array resultante.

Ejemplos:
**Array inicial**
| Índice | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| :----: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Valor | 20 | 5 | 7 | 4 | 32 | 9 | 2 | 14 | 11 | 6 |

**Array final**
| Índice | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| :----: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| Valor | 5 | 7 | 2 | 11 | 20 | 4 | 32 | 9 | 14 | 6 |

### Ejercicio 12

Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el número de la posición inicial en la posición final, rotando el resto de números para que no se pierda ninguno. Al final se debe mostrar el array resultante.

Por ejemplo, para inicial = 3 y final = 7:
**Array inicial**
| Índice | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|:------: |:--: |:-: |:-: |:-: |:--: |:-: |:-: |:--: |:--: |:-: |
| Valor | 20 | 5 | 7 | 4 | 32 | 9 | 2 | 14 | 11 | 6 |

**Array final**
| Índice | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|:------: |:-: |:--: |:-: |:-: |:--: |:-: |:-: |:-: |:--: |:--: |
| Valor | 6 | 20 | 5 | 7 | 32 | 9 | 2 | 4 | 14 | 11 |

### Ejercicio 13

Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.

```
Ejemploa:
459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225
426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466
262 422 275 384 399 397 87 218 84 312 480 207 68 108

¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
466 262 422 275 384 399 397 87 218 84 312 480 207 68 108
```

### Ejercicio 14

Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.

```
Ejemplo:
Array original:
┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
│   0    │   1    │   2    │   3    │   4    │   5    │   6    │   7    │
├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
│casa    │azul    │verde   │orden   │morado  │bombilla│bici    │rosa    │
└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
Array resultado:
┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
│   0    │   1    │   2    │   3    │   4    │   5    │   6    │   7    │
├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
│azul    │verde   │morado  │rosa    │casa    │orden   │bombilla│bici    │
└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
```

### Ejercicio 15

Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:

```
Ejemplo:
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3  │ 2  │ 0  │ 2  │ 4  │ 1  │ 0  │ 2  │ 1  │ 1  │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 2
Por favor, siéntense en la mesa número 3.

┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3  │ 2  │ 2  │ 2  │ 4  │ 1  │ 0  │ 2  │ 1  │ 1  │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Por favor, siéntense en la mesa número 7.

┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3  │ 2  │ 2  │ 2  │ 4  │ 1  │ 4  │ 2  │ 1  │ 1  │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 3
Tendrán que compartir mesa. Por favor, siéntense en la mesa número 6.

┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3  │ 2  │ 2  │ 2  │ 4  │ 4  │ 4  │ 2  │ 1  │ 1  │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Lo siento, en estos momentos no queda sitio.

┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3  │ 2  │ 2  │ 2  │ 4  │ 4  │ 4  │ 2  │ 1  │ 1  │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): -1
Gracias. Hasta pronto.
```

### Ejercicio 16

Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.

```
Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
```

### Ejercicio 17

Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.

### Ejercicio 18

Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.

```
Ejemplos:
Array original:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 127 │ 178 │ 11  │ 39  │ 121 │ 82  │ 130 │ 47  │ 128 │ 129 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
Array resultado:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 11  │ 127 │ 39  │ 178 │ 82  │ 121 │ 47  │ 130 │ 128 │ 129 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘

Array original:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 170 │ 189 │ 87  │ 149 │ 176 │ 110 │ 119 │ 9   │ 33  │ 157 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
Array resultado:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 87  │ 170 │ 9   │ 189 │ 33  │ 149 │ 176 │ 110 │ 119 │ 157 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘


Array original:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 119 │ 88  │ 139 │ 146 │ 34  │ 4   │ 195 │ 160 │ 27  │ 115 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
Array resultado:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 88  │ 119 │ 34  │ 139 │ 4   │ 146 │ 27  │ 195 │ 160 │ 115 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
```

### Ejercicio 19

Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá.

```
Ejemplos:
Array original:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor    5   82    0  131  113  200  134   44   48  134   68  151
Introduzca el número que quiere insertar: 77
Introduzca la posición donde lo quiere insertar (0 – 11): 6
Array resultado:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor    5   82    0  131  113  200   77  134   44   48  134   68

Ejemplo 2:
Array original:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor  148   86   64  126   77  148  182   99    8  126   73   20
Introduzca el número que quiere insertar: 33
Introduzca la posición donde lo quiere insertar (0 – 11): 11
Array resultado:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor  148   86   64  126   77  148  182   99    8  126   73   33

Ejemplo 3:
Array original:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor  186    4   58  150  200  141   34  137   62  170  200   70
Introduzca el número que quiere insertar: 88
Introduzca la posición donde lo quiere insertar (0 – 11): 2
Array resultado:
Índice   0    1    2    3    4    5    6    7    8    9   10   11
Valor  186    4   88   58  150  200  141   34  137   62  170  200
```

### Ejercicio 20

Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe 2º.

```
Ejemplo 1:
Introduzca el número total de nombres de reyes: 7
Vaya introduciendo los nombres de los reyes y pulsando INTRO.
Felipe
Carlos
Carlos
Fernando
Carlos
Carlos
Felipe

Los reyes introducidos son:
Felipe 1º
Carlos 1º
Carlos 2º
Fernando 1º
Carlos 3º
Carlos 4º
Felipe 2º

Ejemplo 2:
Introduzca el número total de nombres de reyes: 9
Vaya introduciendo los nombres de los reyes y pulsando INTRO.
Luis
Fernando
Fernando
Carlos
Amadeo
Alfonso
Carlos
Alfonso
Alfonso

Los reyes introducidos son:
Luis 1º
Fernando 1º
Fernando 2º
Carlos 1º
Amadeo 1º
Alfonso 1º
Carlos 2º
Alfonso 2º
Alfonso 3º
```

### Ejercicio 21

Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el siguiente múltiplo de 5 que exista a partir de él.

```
Ejemplo:
Array original:
459 204 20 250 178 90 353 35 229 357 224 454 260 310 140

Array cincuerizado:
460 205 20 250 180 90 355 35 230 360 225 455 260 310 140
```

## Arrays bidimensionales

### Ejercicio 1

Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.

| Array num | Columna 0 | Columna 1 | Columna 2 | Columna 3 | Columna 4 | Columna 5 |
| :-------: | :-------: | :-------: | :-------: | :-------: | :-------: | :-------: |
|  Fila 0   |     0     |    30     |     2     |           |           |     5     |
|  Fila 1   |    75     |           |           |           |     0     |           |
|  Fila 2   |           |           |    -2     |     9     |           |    11     |

### Ejercicio 2

Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.

|             |             |             |             |             |           |
| :---------: | :---------: | :---------: | :---------: | :---------: | :-------: |
|             |             |             |             |             | Σ fila 0  |
|             |             |             |             |             | Σ fila 1  |
|             |             |             |             |             | Σ fila 2  |
|             |             |             |             |             | Σ fila 3  |
| Σ columna 0 | Σ columna 1 | Σ columna 2 | Σ columna 3 | Σ columna 4 | **TOTAL** |

### Ejercicio 3

Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria (valores entre 100 y 999).

### Ejercicio 4

Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.

### Ejercicio 5

Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.

### Ejercicio 6

Modifica el programa anterior de tal forma que no se repita ningún número en el array.

### Ejercicio 7

Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!

### Ejercicio 8

Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

```
Ejemplo:
Introduzca la posición del alfil: d5
El álfil puede moverse a las siguientes posiciones:
h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
```

### Ejercicio 9

Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas con los números convenientemente alineados.

### Ejercicio 10

Realiza el juego de las tres en raya.

### Ejercicio 11

Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

### Ejercicio 12

Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números aleatorios entre 500 y 900. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

### Ejercicio 13

Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir directamente).

Ejemplo:
| | | | | | | | | | | | MED | MIN | MAX |
|-----------: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |:---: |
| España: | 178 | 165 | 148 | 185 | 155 | 141 | 165 | 149 | 155 | 201 | 164 | 141 | 201 |
| Rusia: | 179 | 189 | 208 | 167 | 186 | 174 | 152 | 192 | 173 | 179 | 179 | 152 | 179 |
| Japón: | 173 | 182 | 168 | 170 | 181 | 197 | 146 | 168 | 166 | 177 | 172 | 146 | 177 |
| Australia: | 172 | 170 | 187 | 186 | 197 | 143 | 190 | 199 | 187 | 191 | 182 | 143 | 191 |
