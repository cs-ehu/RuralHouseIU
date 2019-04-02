# Análisis del proyecto de IS1

- [Análisis del proyecto de IS1](#an%C3%A1lisis-del-proyecto-de-is1)
  - [Introducción](#introducci%C3%B3n)
  - [Lista de tareas pendientes](#lista-de-tareas-pendientes)
    - [Planificación](#planificaci%C3%B3n)
    - [Diseño](#dise%C3%B1o)
    - [Pruebas](#pruebas)
    - [División de tareas](#divisi%C3%B3n-de-tareas)
    - [Normas de codificación](#normas-de-codificaci%C3%B3n)
  - [Conclusiones](#conclusiones)

## Introducción
<div style="text-align: justify">
<p>
El presente documento es parte de una entrega de la asignatura Calidad de Software de la rama Ingeniería del Software. La entrega tiene como objetivo seleccionar un proyecto Java realizado anteriormente por los alumnos de la asignatura e asignatura e identificar los aspectos relacionados con la Calidad del Software y la Ingeniería del Software que estén pendientes por implementar o que se implementasen de manera poco correcta o informal.
</p>
</div>

<div style="text-align: justify">
<p>
Esta tarea se ha realizado en parejas, entre Iñigo Gómez y Urko Lekuona. La razón para esto es que no se dispone de proyectos en Java lo suficientemente diferentes como para hacerlo por separado, ya que sería duplicar el trabajo y no aportaría nada a la asignatura. Además, realizarlo de manera conjunta nos ha permitido profundizar más en cada apartado y, en general, realizar un mejor trabajo que el que puedieramos haber realizado de forma individual.
</p>
</div>

<div style="text-align: justify">
<p>
Se ha escogido como proyecto para trabajar sobre él el realizado en la asignatura Ingeniería del Software por Iñigo Gómez. Este proyecto consistió en generar una simulación de una aplicación pensada para reservar casas rurales. Para realizarlo, se utilizó Eclipse como IDE y se utilizaron tecnologías como:
</p>
</div>

<div style="text-align: justify">

 * ObjectDB: Base de datos diseñada para Java. No provee una API para tratar con sus datos pero se hará mediante una de las 2 implementaciones de Java: JPA y JDO.
 * Orientación a Objetos: Una de las características más destacadas de Java, la orientación a objetos es el esqueleto del dominio del proyecto. Cada clase del dominio es un objeto que se usa por toda la aplicación, y cada uno tiene su entrada correspondiente en la base de datos en forma de tabla.
</div>

## Lista de tareas pendientes



| Nombre | Estado | Importancia | 
| -------- | -------- | -------- |
| Planificación     | Sin empezar     | Text     |
| Diseño| Realizados en su momento | |
|Pruebas | Algunas hechas pero faltan | |
| División de tareas| No hecha | |
|Normas de codificación |No hecha | |

### Planificación

<div style="text-align: justify">
<p>
No se hizo en su momento aunque ahora es tarde para realizar una planificación ya que el proyecto está acabado.
Una planificación que se podría haber realizado deberia haber seguido el siguiente esquema.
</p>
</div>

1. Alcance
    1. Descripción de los objetivos concretos del proyecto
       1. Realización de los diagramas del proyecto
       2. Implementación del producto respecto a los diagramas diseñados
       3. Generación de pruebas para detectar y corregir errores en la implementación
    2. Descripción de las exclusiones
    3. Entregables
       1. Relacionados con el objeto de proyecto en sí
       2. Relacionados con la Planificación y Gestión del Proyecto
   1. WBS/EDT
2. Periodos de realización de las tareas y fechas de terminación de los entregables
2.1 Descripción tareas a realizar
2.2 Dependencias entre tareas
2.3 Periodo de desarrollo de las tareas
2.4 Hitos en el desarrollo del proyecto
3. Estimación de dedicación a cada una de las tareas
4. Asignación de responsabilidades y encargos a los miembros del grupo
5. Caracterización del sistema de información y del sistema de comunicaciones en el proyecto
5.1 Sistema de Información
5.2 Comunicaciones
### Diseño
<div style="text-align: justify">
<p>
El diseño es el apartado del proyecto donde se construyen los planos del producto. Dentro de la Ingeniería del Software, es un proceso fundamental que marcará la estructura del producto final.

Normalmente, para diseñar software se utiliza una tecnología llamada UML. UML es un lenguaje para especificar, visualizar, construir y documentar los artefactos del proyecto. Dentro de UML existen diferentes diagramas, cada uno con su propósito.

En nuestro proyecto, parte del trabajo consistía en diseñar algunos de estos diagramas. En concreto se realizaron:
</p>
</div>

* Diagrama de Clases
* Diagrama de Casos de Uso
* Diagramas de Secuencia (uno por cada caso de uso)

<div style="text-align: justify">
<p>
Sin embargo, estos diagramas han sido extraviados. Esto es debido al tiempo que ha transcurrido desde la finalización del proyecto. Aún así, los diagramas que se realìzaron no eran del todo correctos, por ser los primeros diagramas que habíamos realizado en nuestra vida. Sería conveniente volver a realizarlos, esta vez unos que representen correctamente la estructura del proyecto.
</p>
</div>

### Pruebas

<div style="text-align: justify">
<p>
Las pruebas de software (en inglés software testing) son las investigaciones empíricas y técnicas cuyo objetivo es proporcionar información objetiva e independiente sobre la calidad del producto a la parte interesada o stakeholder. Es una actividad más en el proceso de control de calidad.

Dichas pruebas se han realizado a traves de la herramienta JUnit.JUnit es un framework java que permite la realización de la ejecución de clases de manera controlada, para poder comprobar que los métodos realizan su cometido de forma correcta.

También sirve como herramienta para realizar las pruebas de regresión, que realizaremos cuando una parte del código ha sido modificada y sea necesario comprobar que se sigue cumpliendo con todos los requisitos.

Las pruebas son básicamente un conjunto de actividades dentro del desarrollo de software. Dependiendo del tipo de pruebas, estas actividades podrán ser implementadas en cualquier momento de dicho proceso de desarrollo. Existen distintos modelos de desarrollo de software, así como modelos de pruebas. A cada uno corresponde un nivel distinto de involucramiento en las actividades de desarrollo.

En este proyecto se han realizado pruebas tan solo en las clases createBook, getOffers y Facade, faltando por realizar pruebas en el resto del proyecto para comprobar el correcto funcionamiento de todas las clases.
</p>
</div>

### División de tareas

<div style="text-align: justify">
<p>
A la hora de planificar un proyecto, es importante identificar las diferentes tareas y hacer una clara división entre ellas. Esta división se puede hacer con una granularidad más fina o más gruesa, dependiendo del tamaño de tareas que se quiera utilizar o de las dependencias entre tareas que existan en el proyecto.

Esta división es útil a la hora de asignar trabajo a los diferentes miembros del grupo o a la hora de elegir el orden de realización de las tareas. Por ejemplo, si la tarea T2 depende de la tarea T1, será conveniente dejar la implementación de T2 para cuando se termine T1. Las tareas que no tengan dependencias entre sí se podrán hacer de forma concurrente por diferentes miembro del equipo de desarrollo, sin tener miedo a que haya incoherencias entre las tareas, ya que todas se realizarán según lo establecido en la fase de diseño.

En nuestro proyecto, está división fue casi inexistente. Se dividió el trabajo en diferentes iteraciones, pero no se identificaron las dependencias entre tareas de la misma iteración ni las dependencias entre iteraciones, haciendo el trabajo concurrente imposible. Además, a la hora de implementar el código, se hizo siempre estando todos los miembros del grupo presentes y centrados en el mismo caso de uso.
</p>
</div>

### Normas de codificación
La norma de codificación de java según Google consta de los siguientes puntos. Un ✔ al lado del nombre de una norma indica que nuestro proyecto cumple dicha norma, mientras que un ❌ indicará que no.

1. Source file basics
    1. File name    ✔
    2. File encoding: UTF-8 ✔
    3. Special characters
       1. Whitespace character ❌
       2. Special escape sequences ✔
       3. Non-ASCII characters ✔
2. Source file structure
    1. License or copyright information, if present ✔(not present)
    2. Package statement ✔
    3. Import statements 
       1. No wildcard imports ❌
       2. No line-wrapping ✔
       3. Ordering and spacing ❌
       4. No static import for classes ✔
    4. Class declaration
       1. Exactly one top-level class declaration ✔
       2. Ordering of class contents ❌
3. Formatting
    1. Braces 
       1. Braces are used where optional ✔
       2. Nonempty blocks: K & R style ❌
       3. Empty blocks: may be concise ✔
    2. Block indentation: +2 spaces ❌
    3. One statement per line ✔
    4. Column limit: 100 ✔
    5. Line-wrapping
       1. Where to break ✔
       2. Indent continuation lines at least +4 spaces ✔
    6. Whitespace
       1. Vertical Whitespace ✔
       2. Horizontal whitespace ✔
       3. Horizontal alignment: never required ✔
    7. Grouping parentheses: recommended ❌
    8. Specific constructs
       1. Enum classes ✔
       2. Variable declarations
          1. One variable per declaration ✔
          2. Declared when needed ✔
       3. Arrays
          1. Array initializers: can be "block-like" ✔
          2. No C-style array declarations ✔
       4. Switch statements
          1. Indentation ✔
          2. Fall-through: commented ✔
          3. The default case is present ✔
       5. Annotations ✔
       6. Comments
          1. Block comment style ✔
       7. Modifiers ❌
       8. Numeric Literals ✔
4. Naming
    1. Rules common to all identifiers ✔
    2. Rules by identifier type 
       1. Package names ✔
       2. Class names ✔
       3. Method names ✔
       4. Constant names ✔
       5. Non-constant field names ✔
       6. Parameter names ✔
       7. Local variable names ✔
       8. Type variable names ❌
    3. Camel case: defined ❌
5. Programming Practices
    1. @Override: always used ✔
    2. Caught exceptions: not ignored ✔
    3. Static members: qualified using class ❌
    4. Finalizers: not used ✔
6. Javadoc
    1. Formatting
       1. General form ✔
       2. Paragraphs ✔
       3. Block tags ✔
    2. The summary fragment ❌
    3. Where Javadoc is used
       1. Exception: self-explanatory methods ❌
       2. Exception: overrides ❌
       3. Non-required Javadoc ✔


## Conclusiones

<div style="text-align: justify">
<p>
Aunque el proyecto estuviese terminado y el producto satisfaciese las necesidades del cliente, desde el punto de vista de la Calidad de Software, faltaban muchos aspectos por incluir para considerarse un proyecto completo.
</p>
</div>
