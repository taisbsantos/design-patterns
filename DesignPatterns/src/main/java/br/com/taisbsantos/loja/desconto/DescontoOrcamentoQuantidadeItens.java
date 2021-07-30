package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoQuantidadeItens extends  Desconto{

    public DescontoOrcamentoQuantidadeItens(Desconto proximo){
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return  orcamento.getValor().multiply(new BigDecimal(("0.15")));
    }

    @Override
    public  Boolean deveAplicar(Orcamento orcamento){
        return orcamento.getQuantidadeItens() > 5;
    }
}
