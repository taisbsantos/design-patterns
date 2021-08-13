package test.java.br.com.taisbsantos.loja.imposto;
import static org.junit.Assert.assertEquals;

import br.com.taisbsantos.loja.imposto.CalculadoraDeImpostos;
import br.com.taisbsantos.loja.imposto.ICMS;
import br.com.taisbsantos.loja.imposto.ISS;
import br.com.taisbsantos.loja.orcamento.Orcamento;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculadoraDeImpostosTeste {

        private final CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        @Test
        void calcularValorICMS() {
            Orcamento orcamentoTeste = new Orcamento(new BigDecimal("10.0"), 1);
            assertEquals(new BigDecimal("1.00"), calculadoraDeImpostos.calcular(orcamentoTeste, new ICMS() ));
        }
    @Test
    void calcularValorISS() {
        Orcamento orcamentoTeste = new Orcamento(new BigDecimal("10.0"), 1);
        assertEquals(new BigDecimal("0.600"), calculadoraDeImpostos.calcular(orcamentoTeste, new ISS()));
    }


}
