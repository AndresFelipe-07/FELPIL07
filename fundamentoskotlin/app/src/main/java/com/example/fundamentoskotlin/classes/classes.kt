package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main(){

    newTopic("Clases")
    val phone: Phone = Phone(1223456789)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")
    val smartPhone = SmartPhone(123454, true)
    smartPhone.call()

    //herencia
    newTopic("SobreEscritura")
    smartPhone.showNumber()
    println("Privado? ${smartPhone.isPrivate}") //en esta caso se utiliza ${} para poder referenciarlos

/*   newTopic("Marcas de celulares")
   val marcas: CellPhone = CellPhone()
   marcas.celulares("¡Phone","Nokia","Samsung")

   newTopic("Suma")
   val suma: CellPhone = CellPhone()
   val a = 11
   val b = 22
   println("$a + $b = ${suma(a,b)}")

   //sum.suma(a,b)*/



/*fun suma(a: Int, b: Int): Int {
    return a + b
}*/


    newTopic("Data Class")
    val myUser = user(0,"Felipe","Luligo",Group.FAMILY.ordinal)
    val bro = myUser.copy(1,"Lucas")

    val friend = bro.copy(id = 2, group = Group.FRIEND.ordinal)

    println(myUser.component3())
    println(myUser.component2())
    if(myUser.component2() == "Felipe"){
        println("Nombre valido")
    }
    println(myUser)

    println(friend)


    newTopic("Funciones de Alcance")
    with(smartPhone){
        println("privado? $isPrivate")
        call()
    }

    friend.group = Group.WORK.ordinal //Esto es lo mismo que las tres ultimas lineas
    friend.name = "Juan" // solamente que desde apply hasta que se imprime friend es una mejor forma.
    friend.lastName = "Luligo"
    friend.apply {
        group = Group.WORK.ordinal
        name = "Juan"
        lastName = "Luligo"
    }
    println(friend)




}