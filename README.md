# 💻 Tercer Laboratorio – Técnicas de Programación y Laboratorio

## Paradigma Funcional en Java

### Integrantes
- **Cristian Alejandro Muñoz Bolaños**
- **Lydia Stella Reyes Celis**


##  Descripción del laboratorio

Este repositorio contiene el desarrollo del tercer laboratorio de la asignatura **Técnicas de Programación y Laboratorio**, enfocado en el estudio y aplicación del **paradigma funcional** mediante el lenguaje de programación Java.

A través de tres ejercicios prácticos se implementan diferentes técnicas de procesamiento de datos, transformación de colecciones y resolución de problemas mediante recursividad.

El laboratorio permite fortalecer los conocimientos sobre programación funcional, expresiones lambda, Streams y funciones recursivas.

## Objetivos

### Objetivo general
Aplicar los fundamentos del paradigma funcional mediante la implementación de soluciones en Java, utilizando herramientas que permitan procesar datos y resolver problemas de manera estructurada.

### Objetivos específicos
- Comprender el funcionamiento de los Streams en Java.
- Aplicar expresiones lambda para definir condiciones y operaciones.
- Utilizar métodos como `filter()`, `map()`, `sorted()` y `forEach()`.
- Implementar funciones recursivas para resolver operaciones matemáticas.
- Analizar los resultados obtenidos en cada ejercicio.


##  Requisitos

Para ejecutar los ejercicios se necesita:

- **Java 17 o superior.**
- Un editor de código o IDE compatible con Java.
- Terminal o consola de comandos.

Para verificar la instalación de Java, ejecutar:

```bash
java -version
```

Para verificar el compilador:

```bash
javac -version
```


##  Estructura del proyecto

```text
3_laboratorio/
│
├── ejercicio_1.java
├── ejercicio_2.java
├── ejercicio_3.java
│
└── README.md
```


## Desarrollo de los ejercicios

### Ejercicio 1. Procesamiento de ciudades con Streams

**Descripción:**

Se crea una lista de ciudades y se utiliza la API Stream de Java para realizar diferentes operaciones sobre sus elementos.

**Operaciones implementadas:**

1. `stream()`: convierte la lista en un flujo de datos.
2. `filter()`: selecciona las ciudades cuyo nombre comienza con la letra M.
3. `map()`: transforma los nombres a letras mayúsculas.
4. `sorted()`: organiza las ciudades alfabéticamente.
5. `toList()`: almacena el resultado en una nueva lista.

**Resultado esperado:**

```text
[MALPELO, MARINILLA, MEDELLIN, MONTERIA]
```

### Ejercicio 2. Procesamiento de notas

**Descripción:**

Se trabaja con una lista de calificaciones decimales. El objetivo es seleccionar las notas mayores o iguales a 3.0 y aumentarles 0.2 puntos, estableciendo un límite máximo de 5.0.

**Operaciones implementadas:**

1. `stream()`: permite procesar la lista de notas.
2. `filter()`: selecciona las notas mayores o iguales a 3.0.
3. `map()`: aumenta 0.2 puntos a cada nota seleccionada.
4. `Math.min()`: evita que una nota supere el valor máximo de 5.0.
5. `forEach()`: muestra los resultados en consola.

**Resultado esperado:**

```text
4.2
3.7
5.0
3.2
```

### Ejercicio 3. Cálculo de potencia mediante recursividad

**Descripción:**

Se implementa un método recursivo llamado `potencia()`, que permite calcular la potencia de un número entero a partir de una base y un exponente no negativo.

**Funcionamiento:**

- **Condición base:** cuando el exponente es igual a cero, el método devuelve 1.
- **Caso recursivo:** multiplica la base por el resultado de llamar nuevamente al método con el exponente disminuido en uno.

**Ejemplo utilizado:**

```text
Base: 2
Exponente: 5

Operación:
2 × 2 × 2 × 2 × 2 = 32
```

**Resultado esperado:**

```text
El resultado de 2 elevado a la 5 es: 32
```


## Compilación y ejecución

Para ejecutar los ejercicios, primero se debe abrir una terminal en la carpeta donde se encuentran los archivos `.java`.

### Ejercicio 1

```bash
javac ejercicio_1.java
java ejercicio_1
```

### Ejercicio 2

```bash
javac ejercicio_2.java
java ejercicio_2
```

### Ejercicio 3

```bash
javac ejercicio_3.java
java ejercicio_3
```

**Nota:** el nombre de cada clase pública debe coincidir exactamente con el nombre de su archivo `.java`.


## Conceptos aplicados

Durante el desarrollo del laboratorio se trabajaron los siguientes conceptos:

| Concepto | Aplicación |
|---|---|
| Paradigma funcional | Procesamiento de datos mediante operaciones funcionales. |
| Streams | Procesamiento de colecciones. |
| Expresiones lambda | Definición de funciones y condiciones. |
| Filter | Filtrado de elementos. |
| Map | Transformación de datos. |
| Sorted | Ordenamiento de elementos. |
| ForEach | Recorrido y visualización de resultados. |
| Recursividad | Resolución de problemas mediante llamadas a la misma función. |


## Video de sustentación

En esta sección se incluirá el video de sustentación del laboratorio, donde se explica el funcionamiento de cada ejercicio, los conceptos utilizados y los resultados obtenidos.

**Enlace del video:** [Agregar aquí el enlace de la sustentación]


**Asignatura:** Técnicas de Programación y Laboratorio  
**Laboratorio:** Número 3 – Paradigma Funcional  
**Lenguaje de programación:** Java 17 o superior
ejercicio_3.java Potencia recursiva
README.md

##Video sustentación.

