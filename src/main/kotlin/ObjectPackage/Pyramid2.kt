package org.example.ObjectPackage

class Pyramid2 {
    // Properti diubah menjadi properti privat
    private var jml2 = 0

    // Metode untuk membuat piramida
    fun makePyramid2(x: Int, y: String) {
        for (i in x downTo 1) { // perulangan untuk mencetak spasi disetiap baris
            for (space in 1..x - i) {
                print("  ")
            }

            while (jml2 != 2 * i - 1) { // perulangan untuk mencetak karakter piramida
                print("$y ")
                ++jml2
            }

            println() // untuk mencetak baris setelahnya
            jml2 = 0 // untuk mereset variabel jml2
        }
    }
}
