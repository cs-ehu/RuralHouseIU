##  PMD

- [PMD](#pmd)
  - [Descripción](#descripci%C3%B3n)
    - [PMD y CPD (Copy and Paste Detection)](#pmd-y-cpd-copy-and-paste-detection)
  - [Tareas](#tareas)
    - [Obligatorias](#obligatorias)
    - [Opcionales](#opcionales)
  - [Horas de aprendizaje](#horas-de-aprendizaje)
  - [Ventajas](#ventajas)
  - [Desventajas](#desventajas)
  - [Conclusiones](#conclusiones)

### Descripción

PMD es un analizador de código fuente estático. Encuentra fallas de programación comunes como variables no utilizadas, bloques de captura vacíos, creación innecesaria de objetos, etc. Se ocupa principalmente de Java y Apex , pero admite otros seis idiomas .

PMD presenta muchos controles integrados (en la jerga de PMD, reglas ), que están documentados para cada idioma en nuestras referencias de Reglas . También admitimos una API extensa para escribir sus propias reglas , lo que puede hacer en Java o como una consulta de XPath independiente.

PMD es más útil cuando se integra en su proceso de construcción . Luego puede usarse como una puerta de calidad, para imponer un estándar de codificación para su base de código. Entre otras cosas, PMD se puede ejecutar:

* Como un objetivo de Maven
* Como una tarea de hormigas
* Como una tarea de Gradle
* Desde linea de comandos
* CPD , el detector de copiar y pegar , también se distribuye con PMD. También puede usarlo de varias maneras, que se documentan aquí .
  
#### PMD y CPD (Copy and Paste Detection)
Una de las pruebas que se pueden automatizar con esta herramienta es la detección de trozos de código que hayan sido copiados de un método a otro o en distintas clases. El "copy and paste", es decir, el programar copiando y modificando código existente en lugar de crear soluciones genéricas, es lo que se llama un antipatrón, y su práctica es fuente de numerosos errores.

Para realizar estas pruebas tenemos el plugin de PMD, existente en Maven2 y eclipse, en el que se incluye la utilidad de CPD (Copy and Paste Detection). Para conocer detalles sobre el reporting de PMD consultar el siguiente enlace, donde también se puede encontrar los detalles de como invocar al plugin PMD desde cualquier proyecto.
### Tareas

#### Obligatorias

| ID      | Descripción | Referencia | Tiempo  |
| ------- | ----------- | ---------- | ------- |
| 1  |Instalación de Pandoc| [Vídeo ejemplo](https://www.youtube.com/watch?v=XZDgWf94f5I) | 00:10:00|
| 2  |Primeros pasos con Pandoc| [Documentación](https://pandoc.org/getting-started.html) | 00:35:00|
| 3  |Especificaciones de Pandoc| [Manual de Pandoc](https://pandoc.org/MANUAL.html) | 02:40:00|

#### Opcionales

| ID      | Descripción | Referencia | Tiempo  |
| ------- | ----------- | ---------- | ------- |
| 1  |Introducción a Pandoc| [Explicación de instalación](https://www.youtube.com/watch?v=N31E_NZYQQY) | 00:20:00|
| 2  |Makefile| [Hacer Makefile](https://ondahostil.wordpress.com/2015/12/01/lo-que-he-aprendido-makefile-para-pandoc/) | 00:15:00|
| 3  |Márgenes y fuentes| [Márgenes y fuentes](https://ondahostil.wordpress.com/2017/03/11/lo-que-he-aprendido-margenes-y-fuentes-en-pandoc/) | 00:15:00|

### Horas de aprendizaje

### Ventajas

* Buenas prácticas:
  * 
* Estilo de código:
* Diseño:
* Documentación:
* Errores propensos:
* Multihilo:
* Rendimiento:
* Seguridad:

### Desventajas

### Conclusiones
