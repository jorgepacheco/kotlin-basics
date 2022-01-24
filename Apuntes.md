Scope functions II

Seguimos con el tema del video anterior. Esta vez vemos run, apply y also.
La función run devuelve el resultado de la ejecuón del bloque de código que definimos dentro, pero a diferencia del resto, no tiene context object por lo que no se usa ni it ni this.
Las funciones also y apply son muy interesantes, ambas devuelven el context object del bloque de código. En la primera usaremos it para hacer referencia al context object, mientras que, para la segunda usaremos this.


Podéis ver el código que hemos hecho en el video en el repositorio del curso

## Cuando utilizar if y cuándo when

- If se usa cuando solo hay 2 caminos en la condicion 
- Si no usar mejor when según las Kotlin conventions

## Extension functions

Kotlin nos permite añadir funcionalidad a una clase sin heredar de ella mediante las extension functions vamos a ver qué son y cómo podemos utilizarlas.
Podéis ver el código que hemos hecho en el video en el repositorio del curso kotlin-introduction-course/03-05-extension-functions


## Testing

En este video vamos a ver cómo configurar nuestra aplicación para que incluya test unitarios, veremos dos formas de hacerlo, una usando Mockk y otra con Mockito Kotlin, en el resto del curso los ejemplos de test los haremos solo con Mockk pero es interesante ver cómo configurar el proyecto con ambos frameworks ya que Mockito esta muy extendido en el entorno Java.

Si quereís más información sobre las diferencias entre ambos frameworks lo podeís encontrar aquí

Podéis ver el código que hemos hecho en el video en el repositorio del curso kotlin-introduction-course/04-01-add-testing


- En Kotlin todas las clases son final no se pueden extender.

```kotlin
class AppTest(reader: Reader, writer: Writer) : App(writer, reader) {

    override fun currentDate(): LocalDate = LocalDate.parse("2021-08-31")
}
```

## Data Class

- Tienen por defecto el equals, hascode, copy, toString
- No podemos crar Data clasess sin al menos un argumento
- Uno de los puntos fuertes del lenguaje son las Data Class, se trata de clases que contienen datos y que tienen una serie de restricciones:

  * no pueden ser open
  * no pueden ser abstract
  * no pueder ser inner
  * no puede ser sealed
  * tiene que tener al menos 1 atributo en el constructor

Además, para este tipo de clases, el compilador ya nos proporciona las funciones: copy, toString, equals/hashCode y componentN(funciones para acceder al valor de cada atributo de la clase)

## Companion objects

Se trata de declarar un objeto dentro de una clase con la palabra reservada companion para que se pueda llamar a sus funciones usando solo el nombre de la clase, pero, como dice el título, 
¿son métodos estáticos?, esto es lo que hablaremos en el video aunque si quereís un spoiler echad un vistazo aquí

- LA forma de llamarlos similar a los staticos

- Esta dentro de la clase


## Collections 🧠 Utiliza el mejor tipo de colección: InMemory - List y Map mutable e inmutable

A diferencia de Java, en Kotlin los tipos List y Map son inmutables por defecto (más info aquí), en este video vamos a ver cómo utilizarlos y cómo podemos usar listas y mapas mutables


Podéis ver el código que hemos hecho en el video en el repositorio del curso kotlin-introduction-course/05-03-list-map

- NO puedes anadir ni quietar elementos a la colleccion

