package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValor extends Desconto{

    public DescontoOrcamentoValor(Desconto proximo){
        super (proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return  orcamento.getValor().multiply(new BigDecimal(("0.1")));
    }

    @Override
    public  Boolean deveAplicar(Orcamento orcamento){
        System.out.println(orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
