package com.example.fundamentoskotlin

import android.widget.EditText

// val es para una constante y var para una variable



fun main(){
  newTopic("Bucles")
  showPersons("Andres","Felipe","Laura")
  showPersons("Angel","Mary","Sergio","Alex","Carla")



 /* newTopic("Suma")
  val a = 20
  val b = 30
  println("La suma de $a + $b es igual a: ${suma(a,b)}")*/


  /*newTopic("ZAPATOS")
  zapatos("nike","Adidas","romulo","lauren")

  newTopic("Celulares")
  celulares("asus","Phone","alcatel","nokia")*/
   /* guitarras("Gibson","Yamaha","Fender","Epiphone")*/

}

fun showPersons(p1:String,p2:String,p3:String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String){
    newTopic("FOR")
    for (person in persons) println(person)

    newTopic("WHILE")
    var index = 0
    while(index < persons.size){

        if(persons[index] == "Luis" ) println("Es Luis!")

        println(persons[index])
        index++
    }

    newTopic("SENTENCIA WHEN")
    index = (0..persons.size -1 ).random() // (0..persons.size -1 ) es la sintaxis de Kotlin
    println(index)
    when(persons[index]){
        "Angel" -> println("Es Angel!")
        "Mary" -> {
            println("Ir a otra pantalla")
            println(2+4)
        }
        else -> println(persons[index])
    }

}

/*
fun guitarras (vararg guitar:String){
    for (i in guitar){
        println(i)
    }
}*/
