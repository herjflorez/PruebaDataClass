package com.example.pruebadataclass.Objects

data class Direccion (
    val calle:String,
    val cp:String,
    val ciudad:String,
    val portal:Int,
    val piso:Int,
    val puerta:Int
){

override fun toString() : String = calle + ", " + portal + ", " + piso  + "º " + puerta  + "ª, " + ciudad + cp;
}
