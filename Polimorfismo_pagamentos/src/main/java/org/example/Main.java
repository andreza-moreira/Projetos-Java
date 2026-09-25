package org.example;

public class Main {

    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoPix();
        Pagamento pagamento2 = new PagamentoCartao();
        Pagamento pagamento3 = new PagamentoBoleto();

        processarPagamento(pagamento1);
        processarPagamento(pagamento2);
        processarPagamento(pagamento3);
    }

    public static void processarPagamento(Pagamento pagamento) {
        pagamento.realizarPagamento();
    }
}