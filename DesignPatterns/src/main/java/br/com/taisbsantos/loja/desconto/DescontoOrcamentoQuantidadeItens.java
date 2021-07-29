package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoQuantidadeItens extends  Desconto{

    public DescontoOrcamentoQuantidadeItens(Desconto proximo){
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.15"));
        }
        return proximo.calcular(orcamento);
    }
}
