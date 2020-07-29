package com.example.checkpalindrome

import java.lang.Exception
import java.util.*

fun checkPalindrome(palindrome: Any): Boolean {
    //CHECK IF PASSED ARGUMENT IS STRING
    if(palindrome !is String)
        return throw Exception("Argument not string, pass a string")
    else ""

    //REMOVE ALL SPACE AND PUNCTUATION CHARACTERS
    val regex = "[^A-Za-z0-9]".toRegex()
    var string = regex.replace(palindrome, "")
    string = string.toLowerCase()

    //REVERSE STRING AND CHECK IF IT IS A PALINDROME
    var reverseString: String = ""
    for( i in string.length - 1 downTo 0 ) reverseString += string[i]
    return string == reverseString
}