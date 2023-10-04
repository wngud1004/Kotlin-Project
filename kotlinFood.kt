package com.example.kotlinapp

fun main() {
    // 베열 선언 - 데이터 저장
    var next = "y"
    var total = 0
    val menu = arrayOf("Salad", "Steak", "Pasta", "Pizza")
    val price = arrayOf(16000, 33000, 18000, 19800)
    val menus = mapOf<String, Int>("Salad" to 16000, "Steak" to 33000, "Pasta" to 18000, "Pizza" to 19800)

    do {
        //입력받기
        println("Salad:16000 Steak:33000 Pasta:18000 Pizza:19800")
        print("메뉴 선택 :")
        var m = readln()
        print("개수 :")
        var q = readln().toInt()

        val p = menus[m]
        total += p?.times(q) ?: 0

        //베열에서 메뉴 찾기
        /*
        val idx = menu.indexOf(m)
        if (idx == -1) {
            println("Wrong menu!!")
            continue
        }
        val p = if(idx != -1) price[idx] else 0
        total += q * p
         */

        //반복할지 입력받기
        print("next(y/n) :")
        next = readln()
        if (next.equals("n")) break

    } while (next.equals("y"))
    println("Total = $total")
}