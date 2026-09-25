package org.example;

public class Cachorro extends Animal{

    public Cachorro (String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo!");
    }

}
