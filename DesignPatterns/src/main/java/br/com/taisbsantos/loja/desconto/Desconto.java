package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract Boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
            if(deveAplicar(orcamento)){
                return efetuarCalculo(orcamento);
            }
            return proximo.calcular(orcamento);
    }

}
