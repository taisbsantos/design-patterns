package br.com.taisbsantos.loja.imposto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
}
