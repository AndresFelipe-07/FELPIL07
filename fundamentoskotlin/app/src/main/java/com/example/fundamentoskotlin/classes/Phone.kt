package com.example.fundamentoskotlin.classes

open class Phone (protected val number: Int){ // protected es decir que solo este clase y sus hijas que hereden de esta pueden acceder a esta

    fun call(){
        println("llamando...")
    }

    open fun showNumber(){
        println("Mi número es: $number")
    }



}