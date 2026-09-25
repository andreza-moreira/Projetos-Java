/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author 26174997
 */
public class Animal {
    private String nome;
    private String especie;
    private int idade;
    
    // construtor sem parâmetros
    public Animal(){
    }
    
    // construtor com parâmetros
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        
        if(idade >= 0){
            this.idade = idade;
        }
        else{
            System.out.println("Idade inválida");
        }
    }
        
    // aqui vamos começar com os Setters e Getters
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;      
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public void setIdade (int idade){
        this.idade = idade;
    }
    
    public int getIdade (){
        return this.idade;
    }
    
    
   void emitirSom()
   {
       System.out.println("O animal "+this.nome+ "está fazendo barulho");
    }
}
