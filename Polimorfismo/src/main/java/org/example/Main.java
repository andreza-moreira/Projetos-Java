package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Animal animal1 = new Cachorro("Toby");
        Animal animal2 = new Gato("Mingau");
        Animal animal3 = new Passaro("Piu Piu");

        /*animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();*/

        /*fazerAnimalEmitirSom(animal1);
        fazerAnimalEmitirSom(animal2);
        fazerAnimalEmitirSom(animal3);*/

        apresentarAnimal(animal1);
        apresentarAnimal(animal2);
        apresentarAnimal(animal3);



    } // fim do método main

    public static void fazerAnimalEmitirSom(Animal animal){ // MAIÚSCULA É CLASSE - minúscula é objeto
        animal.emitirSom();
    }

    public static void apresentarAnimal (Animal animal){ // MAIÚSCULA É CLASSE - minuscula é objeto
        System.out.println("Nome: "+animal.getNome());
        animal.emitirSom();
    }


} // fim da classe main
