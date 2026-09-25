package org.example;

public class PagamentoPix extends Pagamento{
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado via PIX.");
    }
}
