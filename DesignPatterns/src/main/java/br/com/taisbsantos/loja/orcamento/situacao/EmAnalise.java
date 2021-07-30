package br.com.taisbsantos.loja.orcamento.situacao;

import br.com.taisbsantos.loja.DomainException;
import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Reprovado());
    }
}
