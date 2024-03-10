import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter
import kotlin.test.DefaultAsserter.fail
import kotlin.test.fail

/*
Testes Unitários

-> Testam pequenas unidades do código, geralmente funções, garantindo o funcionamento do código.
-> *Obs:* São códigos que irão testar outras partes do código.
    -> Gera um processo automatizado de testes:
    -> O teste escrito pode ser executado diversas vezes garantindo que a função faz o que propõe
        -> Pode ser executado vários testes ao mesmo tempo (*suíte de testes*)
        -> reduz a verificação manual como o *debugger ou println*
        -> Melhor design de funções.
        -> Ferramenta útil para regressão
*/
class MainTest {
    @Test
    @DisplayName("Teste do metodo -> ContagemDeLetrasXO")
    @Disabled // -> É utilizado para desativar o teste
    fun testecontagemDeLetrasXO() {
        /*
        * Caso seja usado apenas o assertTrue ele para os testes assim que
        * algum não passe, para os demais testes aconteceçam independentes
        * do problema, deve-se usar o Assertions.assertAll({})
        */
        Assertions.assertAll(
            { Assertions.assertTrue(contagemDeLetrasXO("xxoo")) },
            { Assertions.assertTrue(contagemDeLetrasXO("xxooox")) }
        )
    }

    @Test
    fun falhar() {
        DefaultAsserter.fail("Não posso terminar essa classe sem finalizar os testes. -> exemplo")
    }
}