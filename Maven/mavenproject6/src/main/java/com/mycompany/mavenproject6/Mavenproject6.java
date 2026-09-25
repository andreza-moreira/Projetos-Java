/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author 26174997
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(); // para testar o construtor vazio
        ContaBancaria conta2 = new ContaBancaria(2, "Roberto"); // para testar o construtor com parâmetros
        
        
        System.out.println("Conta 2");
        System.out.println("Numero "+conta2.getNumero());
        System.out.println("Titular: "+conta2.getNome());
        System.out.println("Saldo: "+conta2.getSaldo());
        conta2.getSaldo();
        System.out.println("------------------------------------------------");
        
        // agora vamos testar os métodos
        //depositando um valor
        conta2.depositarValor(18000);
        
        System.out.println("Saldo: "+conta2.getSaldo());
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("");

    }
}
