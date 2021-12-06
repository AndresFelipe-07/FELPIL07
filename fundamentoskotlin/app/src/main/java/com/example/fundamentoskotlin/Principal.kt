package com.example.fundamentoskotlin
//fun es funcion

const val separetor = "====================" // conts significa que lo ejecutara en tiempo de ejecución, y es como algo predeterminado

// conts solo sirve fuera de una función

fun main (){

    hola("HOLA ANDRES FELIPE")

    //print("Hola kotlin")
    newTopic("Hola Kotlin")


    newTopic("Variables y Constantes")
    //val a = 2
    val a = 4 //val puede ser un valor int, boolean, string

    println(a)

    //var b = 2
    var b: Int
    b = 5
    println("b = $b") //b = 2

    //variables null

    // el signo de interrgante quiere decir que el objecto posiblemente puede ser null

    var objNull:Any? //Any puede adquirir cualquier valor sea String, boolean, etc...
    objNull = null
    objNull = "hi"
    println(objNull)

}

fun newTopic(topic:String){
    /*println(topic)
    print("==================== ")
    print(topic)
    print(" ====================")
    println()*/

    print("\n$separetor $topic $separetor\n")

}

fun hola(palabra:String){
    println(palabra)
    println("HOLA QUE MÁS")
}