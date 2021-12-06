package com.example.fundamentoskotlin.classes

class CellPhone() {

    fun celulares(vararg cel: String){
        for (i in cel){
            println(i)
        }
    }

    fun sum(a: Int,b: Int): Int {
        return a + b
    }

}