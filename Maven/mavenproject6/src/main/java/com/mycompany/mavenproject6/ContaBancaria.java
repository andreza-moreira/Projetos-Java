/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author 26174997
 */
public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo=0;
    }


    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return titular;
    }

    public void setNome(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositarValor(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
            // pode ser escrito assim: this.saldo+=valor;
            System.out.println("Depósito realizado com sucesso");
        }
    }
  
    public void sacarValor(double valor){
        if (valor > 0){ // para saber se o usuário digitou um valor válido
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor; // this.saldo-=valor
                System.out.println("Saque realizado com sucesso");
            }
        } 
    }
}
