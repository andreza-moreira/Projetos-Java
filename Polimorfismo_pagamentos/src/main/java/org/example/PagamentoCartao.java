package org.example;

public class PagamentoCartao extends Pagamento{
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado via Cartão.");
    }
}
