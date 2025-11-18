# Implementación del Algoritmo de la Constante de Kaprekar (6174)

Este proyecto implementa el cálculo de la **Constante de Kaprekar (6174)** para números de 4 dígitos. Utiliza el algoritmo de ordenamiento **Insertion Sort** para manipular los dígitos y un Test Runner para automatizar la verificación con diferentes semillas.

---

### Algoritmo Básico:

1.  Elige un número de cuatro dígitos (con al menos dos dígitos distintos).
2.  Ordena los dígitos para formar el **número más grande** y el **número más pequeño** posibles.
3.  Resta el número menor del número mayor.
4.  Repite el proceso con el resultado.

> **¡El resultado siempre convergerá a 6174 en un máximo de 7 iteraciones!**

---

##  Estructura del Proyecto

El proyecto se compone de dos clases principales diseñadas para trabajar en conjunto:

### 1. Clase `KaprekarCalculator`

Esta clase contiene la lógica fundamental para el cálculo y la manipulación de dígitos.

#### **Métodos Principales:**

* **`insertionSortDigits(char[] digitos)`:**
    >  Utiliza el algoritmo **Insertion Sort** para ordenar un arreglo de dígitos en orden ascendente.
* **`tieneDigitosDistintos(int n)`:**
    >  Verifica si un número de 4 dígitos tiene al menos dos dígitos diferentes (necesario para el proceso de Kaprekar).
* **`numeroADigitos(int n)`:**
    >  Convierte un número entero en un arreglo de caracteres (`char[]`), asegurando que siempre se manejen **4 dígitos** (por ejemplo, `99` se convierte en `['0', '0', '9', '9']`).
* **`calcularKaprekar(int semilla)`:**
    >  Es el motor principal. Calcula y muestra el proceso paso a paso, iteración por iteración, hasta que se alcanza la constante de Kaprekar (**6174**).

#### **Constantes:**

* `CONSTANTE_KAPREKAR`: El valor **6174**.

---

### 2. Clase `KaprekarTestRunner`

Esta clase gestiona la ejecución de pruebas automatizadas para validar el algoritmo con múltiples semillas aleatorias.

#### **Características Clave:**

* **Generación de Semillas:** Genera números aleatorios de 4 dígitos para usar como semillas de prueba.
* **Validación:** Asegura que cada semilla elegida cumpla con el requisito de tener dígitos distintos antes de ejecutar el cálculo.
* **Control de Pruebas:** Muestra un resumen de las iteraciones requeridas para cada semilla.
* **Medida de Seguridad:**
    >  Incluye un mecanismo de seguridad (la bandera `algunaSupero500`) para detectar si, por error o falla, alguna semilla supera un límite de **500 iteraciones** (lo cual sería indicativo de un fallo, dado que el proceso debe converger en 7 o menos).

#### **Atributos:**

* `Set<Integer> semillasUsadas`: Almacena las semillas ya probadas para evitar repeticiones.
* `boolean algunaSupero500`: Bandera de seguridad para el límite de iteraciones.

#### **Método Principal:**

* `main(String[] args)`: El punto de entrada que ejecuta el conjunto de pruebas y presenta el informe final de resultados.

---

##  Guía de Ejecución

Sigue estos pasos para descargar, configurar y ejecutar el proyecto:

### 1. Clonar el Repositorio

Abre tu terminal (o la consola integrada de tu IDE) y ejecuta el siguiente comando para clonar el proyecto desde GitHub:

```bash
git clone [https://github.com/JuanCalopinoo/Demo_cons_Krapekar.git](https://github.com/JuanCalopinoo/Demo_cons_Krapekar.git)
cd demo_const_kaprekar
```
---

### 8.1 Importar en el IDE

> Abre **IntelliJ IDEA** o **Visual Studio Code**.
>
> Importa el proyecto `demo_const_kaprekar` como un proyecto existente (ya sea como proyecto Maven, Gradle, o simplemente una carpeta de código fuente Java).

---

### 8.2 Ejecutar la Clase Principal

> * **Navega a la clase:** `src/main/java/edu.unl.ec/KaprekarTestRunner.java`.
> * **Ejecuta el método main** directamente desde tu IDE (usualmente haciendo clic derecho o usando el botón de "Run").

