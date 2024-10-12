package com.example.myapplication

// Lambda Function
// Lambda functino adalah fungsi yang tidak memiliki nama
// Lambda functions biasanya digunakan untuk membuat funsi yang sederhana
// Lambda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb:
fun main(){
    uppercaseString("Hello")
        println({string: String -> string.uppercase()} ("Hello"))
    //HELLo
}