package br.com.taisbsantos.loja.orcamento.situacao;

import br.com.taisbsantos.loja.DomainException;
import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }

}
