/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author 26174997
 */
public class Gato extends Animal {

    public Gato(int vidas) {
        if (vidas <=0){
            this.vidas = 7;
        }
        else{
        this.vidas = vidas;
        }
    }
    
    int vidas;
    
    @Override
    void emitirSom(){
        System.out.println("miau!");
    }
    
}
