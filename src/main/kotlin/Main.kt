package org.example
import org.example.ObjectPackage.Pyramid
import org.example.ObjectPackage.Pyramid2
import org.example.ObjectPackage.Diamond
import org.example.ObjectPackage.XSymbol
import org.example.ObjectPackage.Outliner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var input : Int
    var x : Int
    var y : String
    while (true){
        displaymenu()
        print ("Masukan pilihan : ")
        input = readlnOrNull()?.toIntOrNull() ?: 0
        if (input == 6) {
            println("Program Selesai Dijalankan. Terimakasih")
            break
        } else if (input !in 1..6){
            println("""Input Anda Salah! Silahkan Ulangi Pemilihan""")
            continue
        }
        print("Masukkan jumlah baris untuk pola : ")
        x = readlnOrNull()?.toIntOrNull() ?: 0

        if (x <= 0){
            println("""Input Anda Salah! Silahkan Ulangi Pemilihan""")
            continue
        }

        print("Caracter apa yang akan dipakai : ")
        y = readlnOrNull() ?: ""

        when (input) {
            1 -> {
                val pyramid = Pyramid()
                pyramid.makePyramid(x, y)
            }
            2 -> {
                val pyramid2 = Pyramid2()
                pyramid2.makePyramid2(x, y)
            }
            3 -> {
                val diamond = Diamond(x, y)
                diamond.makeDiamond()
            }

            4 -> {
                val xSymbol = XSymbol()
                xSymbol.makeXSymbol(x, y)
            }
            5 -> {
                val outliner = Outliner()
                outliner.makeOutliner(x, y)
            }
        }
    }

}

fun displaymenu(){
    println("""
        1. Pyramid
        2. Pyramid 2
        3. Diamond
        4. XSymbol
        5. Outliner
        6. Exit 
    """.trimIndent())
}

// code by : Zidna Fatha Nazhifa