/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author 26174997
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.idade = 12;
        cachorro1.raca= "Golden";
        
        
        System.out.println("Cachorro: "+cachorro1.nome+" tem "+cachorro1.idade+" anos!");
        cachorro1.emitirSom();
        
        Gato gato1 = new Gato(5);
        gato1.nome = "Felix";
        gato1.idade = 5;
        System.out.println(gato1.nome+" - "+gato1.idade+" anos");
        gato1.emitirSom();
        
        Animal animal1 = new Animal();
        animal1.nome= "Edmundo";
        animal1.idade = 5;
        System.out.println("Animal: "+animal1.nome);
        animal1.comer();
        
        Coelho coelho1 = new Coelho();
        coelho1.nome = "Nick";
        //System.out.println("O Coelho "+coelho1.nome);
        System.out.print("O Coelho " + coelho1.nome + " está emitindo o som: ");
        coelho1.emitirSom(); // Esta linha vai imprimir o som na mesma linha por causa do print acima
        
    }
}
