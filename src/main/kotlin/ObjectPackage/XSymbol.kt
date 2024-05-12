package org.example.ObjectPackage

class XSymbol {
    fun makeXSymbol(x: Int, y: String) {
        for (i in 0 until x) {
            for (j in 0 until x) {
                if (j == i || j == x - 1 - i)
                    print("$y ")
                else
                    print("  ")
            }
            println()
        }
    }
}