package br.com.taisbsantos.loja.desconto;

import br.com.taisbsantos.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends  Desconto{

    public  SemDesconto(){
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public  Boolean deveAplicar(Orcamento orcamento){
        return true;
    }
}
