package org.example.ObjectPackage

class Diamond {
    // Properties
    private var size: Int = 0
    private var symbol: String = "*"

    // Constructor
    constructor(size: Int, symbol: String) {
        this.size = size
        this.symbol = symbol
    }

    // Method to print diamond
    fun makeDiamond() {
        var jml = 0
        var tinggi = size - (size / 2)
        for (i in 1..size) {
            for (space in 1..size - i) {
                print("  ")
            }

            while (jml != 2 * i - 1) {
                print("$symbol ")
                ++jml
            }

            println()
            jml = 0
        }

        for (i in size - 1 downTo 1) {
            for (space in 1..size - i) {
                print("  ")
            }

            var jml = 0

            while (jml != 2 * i - 1) {
                print("$symbol ")
                ++jml
            }

            println()
            jml = 0
        }
    }
}
