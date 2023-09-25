package com.example.kotlinapp

fun main() {
    /*
    // 변수 선언
    var a: Int = 6
    val b = 5.9
    var c:Char = 'k'
    // 출력하기
    println("kotlin Hello")
    println("Value = $a")
    println("Value = ${a + 3}")
    // 입력하기
    a = readln().toInt() // 문자열 입력을 정수로 변환
    val name = readln()
    println("$a $name")

    //java: Scanner scn = new Scanner(System.in);
    val scn = Scanner(System.`in`)
    print("Your score : ")
    val score = scn.nextInt()
    println("My score is $score")
     */

    //구의 반지름을 이용한 부피 구하기
    /*
    val scn = Scanner(System.`in`)
    print("반지름: ")
    val r = scn.nextInt()

    val pi = 3.1415
    val v = 4/3.0 * pi * r * r * r
    println("구의 부피는 $v")
    println("구의 부피는 %.2f".format(v))
     */

    // 파운드화로 환전하기
    // 1파운드 = 1667.35

    var won = 0
    val rate = 1667.35
    print("원화 : ")
    won = readln().toInt()
    // java: int pound = (int)(won / rate);
    val pound = (won / rate).toInt()
    println("$pound POUND")
    val remain = (won % rate).toInt()
    println("잔액 = $remain")
}