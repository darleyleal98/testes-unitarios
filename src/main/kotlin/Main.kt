class Main() {
    fun main() {
        println(verificarInformacoesNaPortaria(25, "comum", "Xl"))
    }

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

    fun verificarInformacoesNaPortaria(idade: Int, convite: String, codigo: String): String {
        if (idade < 18) return "Negado"

        if (convite.isNotEmpty()) {
            val tipoDoConvite = convite.lowercase()

            if (tipoDoConvite != "comum" && tipoDoConvite != "premium" && tipoDoConvite != "luxo")
                return "Negado"

            if (codigo.isNotEmpty()) {
                val tipoCodigo = codigo.lowercase()

                return if (tipoDoConvite == "comum" && tipoCodigo.startsWith("xt"))
                    "Welcome"
                else if (tipoDoConvite == "premium" || tipoDoConvite == "luxo" &&
                    tipoCodigo.startsWith("xl")
                ) "Welcome"
                else "Negado"
            }
        }
        return "Negado"
    }
}










