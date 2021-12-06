package com.example.fundamentoskotlin.classes

class SmartPhone(number: Int, val isPrivate: Boolean) : Phone(number){

    override fun showNumber() {
       if (isPrivate){
           println("Desconocido")
       }else{
           super.showNumber()
       }
    }




}