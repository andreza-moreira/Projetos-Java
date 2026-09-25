/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author 26174997
 */


/** public class Carro {
    String modelo;
    String cor;
    
    // construtor 1
    public Carro(){
    
    }
    
    public Carro(String modelo){
        this.modelo = modelo;
    }   
    
    // construtor 2
    public Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
   
    void acelerar()
    {
        System.out.println("O carro "+this.modelo+" está acelerando.");
    }
    
    
}**/


public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    
    // construtor 1
    public Carro(){
    
    }
    // construtor 3
    public Carro(String modelo){
        this.modelo = modelo;
    }   
    
    // construtor 2
    public Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
    
    
    // aqui vamos começar com os Setters e Getters
    
    // **************************
    public String getModelo(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    // **********************************
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setAno(int ano) {
        if (ano >= 1960) {
            this.ano = ano;
        } else {
            System.out.println("Erro: O ano do carro deve ser a partir de 1960.");
            // Opcional: atribuir um valor padrão ou lançar uma exceção
        }
    }
   
    void acelerar()
    {
        System.out.println("O carro "+this.modelo+ " da cor "+this.cor+" está acelerando. Ele é do ano "+this.ano);
    }
    
    
}
