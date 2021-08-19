package br.com.taisbsantos.loja.http;

import br.com.taisbsantos.loja.orcamento.Orcamento;
import br.com.taisbsantos.loja.orcamento.RegistroOrcamento;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TestAdapter {

    @Test
    public void deveRegistrarOrcamento (){
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
        //vai falhar porque a url não existe, se quiser passsar basta jogar alguma url existente
    }
}
