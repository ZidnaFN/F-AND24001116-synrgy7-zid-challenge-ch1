package org.example.ObjectPackage

class Outliner {
    fun makeOutliner(x: Int, y: String) {
        for (i in 0 until x) {
            for (j in 0 until 2 * x - 1) {
                if (i == x - 1 || j == x - 1 - i || j == x - 1 + i) {
                    print("$y ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}