package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.imposto.Imposto;
import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoQuantidadeItens(
                new DescontoOrcamentoValor(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
