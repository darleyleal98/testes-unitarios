fun contagemDeLetrasXO(frase: String): Boolean {
    var x = 0
    var o = 0
    frase.let {
        for (char: Char in frase.lowercase()) {
            if (char == 'x') x++
            if (char == 'o') o++
        }
        if ((x > 0 && o > 0) && x == o) return true
    }
    return false
}

fun main() {
}