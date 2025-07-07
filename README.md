# Práctica 02.03 – Lógica con Árboles Binarios

**Carrera:** Computación  
**Asignatura:** Estructura de Datos – Segundo Interciclo  
**Estudiante:** Keyra 
**Docente:** Ing. Pablo Torres  
**Título:** Estructuras No Lineales – Ejercicios con Árboles Binarios  
**Commit obligatorio:** `"Estructuras No Lineales – Ejercicios Arboles"`
# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.


 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---
## Informe

### Explicación del Ejercicio 01 – Insertar en un Árbol Binario de Búsqueda (BST)
📌 Objetivo del ejercicio:
Implementar un algoritmo que permita insertar valores en un Árbol Binario de Búsqueda (BST), manteniendo las propiedades propias de esta estructura.

⚙️ Descripción de la solución implementada
El ejercicio está contenido en la carpeta Ejercicio_01_insert, e incluye dos clases:

Node.java: Define la estructura del nodo del árbol con tres atributos: int value, Node left y Node right.

InsertarBST.java: Contiene la lógica para insertar elementos en el árbol y recorrerlo en orden.

🧪 Lógica del método insertar(int valor)
Se usa un método recursivo llamado insertarRecursivo(Node actual, int valor) que funciona así:

Si el nodo actual es null, se crea un nuevo nodo con el valor dado.

Si el valor es menor que el del nodo actual, se recorre el subárbol izquierdo.

Si el valor es mayor, se recorre el subárbol derecho.

Se retorna el nodo actualizado.

### Explicación del Ejercicio 02 – Invertir un Árbol Binario
📌 Objetivo del ejercicio:
Implementar un algoritmo que invierta un árbol binario, transformándolo en su imagen especular. Es decir, para cada nodo se deben intercambiar sus hijos izquierdo y derecho de forma recursiva.
⚙️ Descripción de la solución implementada
Este ejercicio está en la carpeta Ejercicio_02_invert e incluye dos clases:

Node.java: Define los nodos del árbol (atributos: value, left, right).

InvertBinaryTree.java: Contiene la lógica para insertar nodos, invertir el árbol y recorrerlo.

🔁 Lógica del método invertTree(Node root)
El método funciona de manera recursiva:

Si el nodo actual es null, retorna null.

Guarda el hijo izquierdo en una variable temporal.

Invierte recursivamente el subárbol derecho y lo asigna al hijo izquierdo.

Invierte recursivamente el subárbol izquierdo original (guardado en temp) y lo asigna al hijo derecho.

Retorna el nodo actual con sus hijos ya invertidos.

### Explicación del Ejercicio 03 – Listar niveles en listas enlazadas

📌 Objetivo del ejercicio:
Implementar un algoritmo que recorra un árbol binario nivel por nivel (recorrido en anchura o BFS) y almacene los nodos de cada nivel en una lista enlazada o colección separada. Si el árbol tiene N niveles, el resultado debe ser una lista con N sublistas.

⚙️ Descripción de la solución implementada
El ejercicio está contenido en la carpeta Ejercicio_03_listLeves y contiene:

Node.java: Define la estructura básica de los nodos (value, left, right).

ListarNiveles.java: Implementa el método para listar niveles y funciones de inserción e impresión.

🔁 Lógica del método listLevels(Node root)
Se verifica si el árbol está vacío. Si lo está, se retorna una lista vacía.

Se inicializa una cola (Queue<Node>) y se añade la raíz.

Mientras la cola no esté vacía:

Se obtiene el número de nodos en el nivel actual (nivelSize).

Se recorre ese nivel, sacando los nodos de la cola y agregándolos a una lista temporal.

Se agregan los hijos izquierdo y derecho de cada nodo a la cola.

🎯 Conclusión del ejercicio:
Se aplicó un recorrido BFS usando una cola para listar niveles del árbol binario.

Se implementó una estructura de salida compuesta (List<List<Node>>) que refleja la organización por niveles.

Este ejercicio refuerza el uso de estructuras auxiliares, lógica iterativa y modelado de estructuras complejas.

Es especialmente útil para algoritmos relacionados con árboles de decisión, redes y árboles de sintaxis.

### Explicación del Ejercicio 04 – Calcular la Profundidad Máxima
📌 Objetivo del ejercicio:
Desarrollar un algoritmo que calcule la profundidad máxima (también llamada altura) de un árbol binario, es decir, la cantidad de niveles desde la raíz hasta la hoja más lejana.

🧠 ¿Qué es la profundidad máxima?
La profundidad máxima de un árbol binario es el camino más largo desde la raíz hasta cualquier hoja. Se mide por la cantidad de nodos que se atraviesan en el camino más profundo.

⚙️ Descripción de la solución implementada
El ejercicio se encuentra en la carpeta Ejercicio_04_depth y contiene:

Node.java: Define la estructura básica del nodo del árbol (value, left, right).

CalcularProfundidad.java: Implementa el método maxDepth(Node root) y la lógica para construir y probar el árbol.

🔁 Lógica del método maxDepth(Node root)
Este método se implementa de forma recursiva, comparando la profundidad de cada subárbol:

Si el nodo actual es null, se retorna 0.

Se calcula la profundidad máxima del subárbol izquierdo.

Se calcula la profundidad máxima del subárbol derecho.

Se retorna el mayor de los dos valores anteriores + 1 (por el nodo actual).

🎯 Conclusión del ejercicio:
Se implementó un algoritmo recursivo eficiente para calcular la profundidad de un árbol binario.

Se construyó un árbol de prueba y se verificó correctamente el valor de la profundidad.

Este tipo de cálculo es fundamental en muchos algoritmos que trabajan con árboles (balanceo, evaluación, análisis de rendimiento).

Se reforzaron conceptos clave como recursión, subproblemas y comparación entre ramas de una estructura.


## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

