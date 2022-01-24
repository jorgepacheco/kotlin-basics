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

