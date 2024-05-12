package org.example.ObjectPackage

class Pyramid {
    // Properti diubah menjadi properti privat
    private var jml: Int = 0

    fun makePyramid(x: Int, y: String) {
        for (i in 1..x) {
            for (space in 1..x - i) {
                print("  ")
            }

            while (jml != 2 * i - 1) {
                print("$y ")
                ++jml
            }

            println()
            jml = 0
        }
    }
}
