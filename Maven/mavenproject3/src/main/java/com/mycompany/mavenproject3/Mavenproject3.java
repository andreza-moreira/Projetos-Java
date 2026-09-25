/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author 26174997
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        animal1.setNome("Rex");
        animal1.setEspecie("Cachorro");
        animal1.setIdade(5);
        
        animal2.setNome("Mimi");
        animal2.setEspecie("Gato");
        animal2.setIdade(-1);
        
        animal1.emitirSom();
        animal2.emitirSom();
        
    }
}
