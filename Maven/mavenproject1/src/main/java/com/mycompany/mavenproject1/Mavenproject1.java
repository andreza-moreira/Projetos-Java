/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 26174997
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        // criar um objeto a partir da classe Pessoa
        // Nome_classe nome_objeto = new NomeClasse();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();  
        Pessoa pessoa3 = new Pessoa();  
 
        // agora vou definir o valor das propriedades
        
        pessoa1.nome = "João";
        pessoa1.idade = 20;
        pessoa1.altura = 180;
        pessoa1.cor = "Amarelo";
        
        pessoa2.nome = "Maria";
        pessoa2.idade = 30;
        pessoa2.altura = 150;
        pessoa2.cor = "Branco";
        
        pessoa3.nome = "Julia";
        pessoa3.idade = 50;
        pessoa3.altura = 170;
        pessoa3.cor = "Preto";
        
        // agora vamos exibir o valor das propriedades
        System.out.println("Nome: "+pessoa1.nome);
        System.out.println("Idade: "+pessoa1.idade);
        System.out.println("Altura: "+pessoa1.altura);
        System.out.println("Cor: "+pessoa1.cor);
        pessoa1.falarNome();
        
        System.out.println("===============================");
        
        // Exercício: Crie mais três objetos da classe pessoa
        // atribua valor a eles
        // exiba na tela... separe com um traço

        System.out.println("Nome: "+pessoa2.nome);
        System.out.println("Idade: "+pessoa2.idade);
        System.out.println("Altura: "+pessoa2.altura);
        System.out.println("Cor: "+pessoa2.cor);
        pessoa2.falarNome();
        
        System.out.println("===============================");
        
        System.out.println("Nome: "+pessoa3.nome);
        System.out.println("Idade: "+pessoa3.idade);
        System.out.println("Altura: "+pessoa3.altura);
        System.out.println("Cor: "+pessoa3.cor);
        
        pessoa3.falarNome();
        
    }
}
