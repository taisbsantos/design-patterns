package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.desconto.CalculadoraDeDescontos;
import br.com.taisbsantos.loja.desconto.DescontoOrcamentoQuantidadeItens;
import br.com.taisbsantos.loja.orcamento.Orcamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeDescontosTeste {

    private final CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

    @Test
    void deveDevolverDescontoPorQuantidadeItens() {
        Orcamento orcamentoTeste = new Orcamento(new BigDecimal("1000.0"), 6);
        assertEquals(new BigDecimal("150.000"), calculadoraDeDescontos.calcular(orcamentoTeste));
    }

    @Test
    void deveDevolverDescontoPorValor (){
        Orcamento orcamentoTeste = new Orcamento(new BigDecimal("1000.0"), 1);
        assertEquals(new BigDecimal("100.00"), calculadoraDeDescontos.calcular(orcamentoTeste));
    }

    @Test
    void deveDevolverDescontoZero (){
        Orcamento orcamentoTeste = new Orcamento(new BigDecimal("500"), 1);
        assertEquals(new BigDecimal("0"), calculadoraDeDescontos.calcular(orcamentoTeste));
    }
}
