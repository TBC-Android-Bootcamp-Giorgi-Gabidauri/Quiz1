package com.gabo.mathoperations

class MathOperations() {
     fun largestCommonDivider(n1: Int, n2: Int): Int {
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

     fun leastCommonMultiple(n1: Int, n2: Int): Int {
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

     fun containsOrNot(input: String): Boolean {
        var contains = false
        if(input.contains('$')){
            contains = true
        }
        return contains
    }
     fun sumEvenNumbers(num: Int): Int {
        if (num != 0 && num % 2 == 0)
            return num + sumEvenNumbers(num - 2)
        else
            return num
    }
     fun reverseNumber(input: Int) : String{
        var answer = input.toString()
        while(answer[answer.lastIndex] == '0'){
            answer = answer.dropLast(1)
        }
        return answer.reversed()
    }
     fun isPalindrome(input: String): Boolean{
        var answer = false
        if (input == input.reversed()){
            answer = true
        }
        return answer
    }
}



