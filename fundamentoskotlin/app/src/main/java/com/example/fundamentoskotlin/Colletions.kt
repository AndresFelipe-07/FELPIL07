package com.example.fundamentoskotlin

import com.example.fundamentoskotlin.classes.Group
import com.example.fundamentoskotlin.classes.user

fun main(){
    newTopic("Colecciones")

    newTopic("Solo Lectura")
    val frutaList = listOf("Manzana","banano","Uva","Limon")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("El index de banano es: ${frutaList.indexOf("banano")}")
    if (frutaList.indexOf("banano") == 1)println("TRUE") else println("FALSE")

    newTopic("Mutable List")

    val myUser = user(0,"Felipe","Pizo", Group.FAMILY.ordinal)
    val bro = myUser.copy(1,"Lucas")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)

    val userList = mutableListOf(myUser,bro)
    println(userList)
    userList.add(friend)
    println(userList)
    userList.removeAt(1)//este es por indice // userList.remove(bro) otra manera
    println(userList)

    val userSelectedList  = mutableListOf<user>()
    println(userSelectedList)
    //userSelectedList.addAll(userList)
    userSelectedList.add(myUser)
    println(userSelectedList)
    userSelectedList.set(0,bro)//hace que imprima en el indice 0 bro, o que lo haga mostrar en comandos
    println(userSelectedList)

    //duplicados de datos
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList) // esto causa que duplique los elementos o los agrupe

}
