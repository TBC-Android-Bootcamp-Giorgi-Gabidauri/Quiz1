package com.gabo.mathoperations

class MathOperations {
}

fun main() {
    println(largestCommonDivider(24, 36))
    println(leastCommonMultiple(24,36))
    println(containsOrNot("1234"))
    println(containsOrNot("1234$"))
    println(addEvenNumbers(100))
    println(reverseNumber(12345678))
    println(isPalindrome("12343"))
    print(isPalindrome("123454321"))
}

private fun largestCommonDivider(n1: Int, n2: Int): Int {
    var i = if (n1 > n2) {
        n1
    } else {
        n2
    }
    var answer = 1
    while (i > 0) {
        if (n1 % i == 0 && n2 % i == 0) {
            answer = i
            break
        } else {
            i--
        }
    }
    return answer
}

private fun leastCommonMultiple(n1: Int, n2: Int): Int {
    var i = if (n1 > n2) {
        n1
    } else {
        n2
    }
    var answer = 1
    while (i > 1) {
        if (i % n1 == 0 && i % n2 == 0) {
            answer = i
            break
        } else {
            i++
        }
    }
    return answer
}

private fun containsOrNot(input: String): Boolean {
    var contains = false
    if(input.contains('$')){
        contains = true
    }
    return contains
}
private fun addEvenNumbers(num: Int): Int {
    if (num != 0 && num % 2 == 0)
        return num + addEvenNumbers(num - 2)
    else
        return num
}
private fun reverseNumber(input: Int) : String{
    return input.toString().reversed()
}
private fun isPalindrome(input: String): Boolean{
    var answer = false
    if (input == input.reversed()){
        answer = true
    }
    return answer
}


