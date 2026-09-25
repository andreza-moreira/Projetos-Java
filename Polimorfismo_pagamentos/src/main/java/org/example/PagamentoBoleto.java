package org.example;

public class PagamentoBoleto extends Pagamento{
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado via boleto.");
    }
}
