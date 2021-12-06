package com.example.fundamentoskotlin

import kotlin.math.abs

fun main(){
/*
    sayHello()

    newTopic("Argumentos")

    //println(sum(2,3))
    println("El resultado es: " + rest(10.0,5.0))

    val a1 = 20.1
    val b2 = 30.2
    println("$a1 - $b2 = ${rest(a1,b2)}")

    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")

    //EXTENSIONES INFIX
    newTopic("Infix")
    val c = -3 //al ser imprimido el valor cambia a positivo, 3 por la función abs
    println(c.enableAbs(false))

    println("$a + $c = ${sum(a,c.enableAbs(false))}")
    println("$a + $c = ${sum(a,c.enableAbs(true))}")
*/

    //SOBRECARGA DE MÉTODOS
    newTopic("Sobrecarga")
    showProduct("soda", "10%")
    showProduct(name = "pan", "10%")
    showProduct(name = "Caramelo", promo = "15%")
    showProduct("Jugo", validity = "13 de diciembre")
    showProduct("Maletín", "50%")
    showProduct("Guitarra", validity = "24 de diciembre", size = "pequeña")
    showProduct("Guison","5%","2 de diciembre")

}

/*private fun sayHello(): Unit {  //Unit = void no retorna ningun tipo de dato


    println("hello kotlin")


}*/

/*fun sum(a:Int,b:Int):Int{
    val c = a + b
    return c // tambien se puede return a + b
}

fun rest(a:Double,b:Double):Double{
    val c = a - b
    return(c)
}*/

/*fun mul(a:Int,b:Int)= a * b //manera más facil de retornar valores


fun div(a:Int,b:Int) = a / b*/

//EXTENSIONES INFIX

// infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this // con el if al estar el número negativo y declarado como false el valor en consola es el mismo

// SOBRECARGA DE MÉTODOS

fun showProduct(name:String, promo:String = "Sin promoción", validity: String = "Agotar existencia", size:String = "Grande"){
    println("$name = $promo hasta $validity, tamaño $size")
}