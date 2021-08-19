package br.com.taisbsantos.loja.imposto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
}
