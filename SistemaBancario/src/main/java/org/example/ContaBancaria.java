package org.example;

import javax.swing.*;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public ContaBancaria() {
        this.saldo=0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido!");
            System.out.println("Saque não realizado!");
        }
        else{
            if (valor <= this.saldo){
                // this.saldo=this.saldo-valor;
                this.saldo-=valor;
                System.out.println("Saque de R$ "+valor+" efetuado com sucesso");
            }
            else {
                System.out.println("Saque não realizado! Saldo insulficiênte!");
            }
        }

    }

    public void depositar (double valor){
        if (valor <= 0){
            System.out.println("Valor inválido!");
            System.out.println("Depósito não realizado!");
        }
        else{
            this.saldo+=valor;
            System.out.println("Depósito de R$ "+valor+" efetuado com sucesso");
        }

    }

    public void mostrarInformacoes(){
        System.out.println("Conta número: "+this.getNumero());
        System.out.println("Titular da conta: "+this.getTitular());
        System.out.println("Saldo......R$" +this.getSaldo());
        System.out.println("******************************************");
    }

    public void mostrarOpcoes(){
        JOptionPane.showMessageDialog(null, "Menu Conta Bancária\n\n"+
                "1. Consulta Saldo\n" +
                "2. Depositar\n" +
                "3. Sacar\n" +
                "0. Voltar ao manu anterior\n\n" +
                "Digite a opção desejada: ");
    }

} // fim da classe
