package com.example.kotlinapp

fun main() {
    // 사칙연산 계산기
    /*
    var c  = 0
    var a:Int = 0
    var b:Int = 0
    print("숫자1 :")
    a = readln().toInt()
    print("숫자2 :")
    b = readln().toInt()
    print("연산자 :")
    val Operator = readln()

    when(Operator) {
        "+" -> { c = a + b
            print("답 : $a $Operator $b =  $c")}
        "-" -> { c = a - b
            print("답 : $a $Operator $b =  $c")}
        "*" -> { c = a * b
            print("답 : $a $Operator $b =  $c")}
        "/" -> { c = a / b
            print("답 : $a $Operator $b =  $c")}
        "%" -> { c = a % b
            print("답 : $a $Operator $b =  $c")}
        else -> print("오류 발생")
    }
    */

    /*
    var answer = if (op == "+") num1 + num2
    else if (op == "-") num1 - num2
    else "Wrong operator!!"
     */

    /*
    var c = when(Operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        "%" -> a % b
        else -> print("오류 발생")
    }
    print("답 : $a $Operator $b =  $c")
    */

    // Random
    /*
    val num1 = (1..100).random()
    println(num1)
    val num2 = Random(System.nanoTime()).nextInt(100) + 1
    println(num2)
     */

    // 주사위를 10번 던져서 나오는 수의 총합을 출력하기
    // java: for(int i =0; i<10; i++){}
    /*
    var sum = 0
    for(i in 1..5){
        for(j in 0 until 3 step 2) {
            val dice = (1..6).random()
            println(dice)
            sum += dice
        }
    }
    print("총합 : $sum")
     */

    // 배열 생성하고 원소 탐색하기
    val arr = intArrayOf(1,2,3,4,5,6)
    val arr2 = arrayOf(1,2,3,4,5,6)
    for (n in 0..arr.size-1) {
        print(arr[n])
    }
    println()
    for (k in 0..< arr2.size) {
        print(arr2[k])
    }
    println()
    for (element in arr) {
        print(element)
    }
    println()
    val arr3 = Array<Int>(5){ data -> data * 2 }
    for ( a in arr3) print("$a ")
}