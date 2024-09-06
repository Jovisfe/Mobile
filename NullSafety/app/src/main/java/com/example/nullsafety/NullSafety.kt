package com.example.nullsafety

class Carro {

    var cor = "Vermelho"

    fun acelerar(){
        //***
    }

}

fun main(){

    var carro: Carro? = null
    carro = Carro()
    //***
    val cor = carro?.cor ?: "cor padrão"
    println(cor)


}