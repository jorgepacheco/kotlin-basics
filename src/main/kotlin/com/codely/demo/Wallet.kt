package com.codely.demo

data class Wallet(val balance: Int, val type:String)


fun main(){

    val savingsIng = Wallet(100, "SAVINGS")

    val currentIng = Wallet(200, "CURRENT")

    println(savingsIng)

    println(currentIng)

    println("Balance in savings account is ${savingsIng.balance}")
}
