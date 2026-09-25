package org.example;

public class Passaro extends Animal{
    public Passaro (String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Barulho de Pássaro.");
    }

    public void voar (){
        System.out.println("O pássaro está voando...");
    }
}
