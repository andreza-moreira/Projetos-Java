/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author 26174997
 */
/**public class Mavenproject2 {

    public static void main(String[] args) {
        // Criando o objeto a partir da classe
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("GM Tracker", "Prata");
        Carro carro4 = new Carro("Carro 4");
        
        // definir os atributos
        carro1.modelo = "Honda";
        carro1.cor = "Preto";
        
        carro2.modelo = "HRV";
        carro2.cor = "Vermelho";
        
        System.out.println("Modelo: "+carro1.modelo);
        System.out.println("Cor: "+carro1.cor);
        
        System.out.println("Modelo: "+carro2.modelo);
        System.out.println("Cor: "+carro2.cor);
        
        System.out.println("Modelo: "+carro3.modelo);
        System.out.println("Cor: "+carro3.cor);
        
        
        carro1.acelerar();
        carro2.acelerar();
        carro3.acelerar();
        carro4.acelerar();
        
    }
} **/




public class Mavenproject2 {

    public static void main(String[] args) {
        // Criando o objeto a partir da classe
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("GM Tracker", "Prata");
        Carro carro4 = new Carro("Carro 4");
 
        
        // definir os atributos
        // vamos então encapsular (private) os atributos
        // para isso vamos comentar essas linhas
        
        // carro1.modelo = "Honda";
        //carro1.cor = "Preto";
         
        carro1.setModelo("Porche Carrera");
        carro1.setCor("Azul");
        
        //carro2.modelo = "HRV";
        //carro2.cor = "Vermelho";
        
        carro2.setModelo("Honda");
        carro2.setCor("Amarelo");
        carro2.setAno(1500);
        
        carro3.setCor("Laranja");
        carro3.setAno(2000);
        
        carro4.setCor("Roxo");
        carro4.setAno(2026);
        
        //System.out.println("Modelo: "+carro1.modelo);
        //System.out.println("Cor: "+carro1.cor);
        
        //System.out.println("Modelo: "+carro2.modelo);
        //System.out.println("Cor: "+carro2.cor);
        
        //System.out.println("Modelo: "+carro3.modelo);
        //System.out.println("Cor: "+carro3.cor);
        
        
        carro1.acelerar();
        carro2.acelerar();
        carro3.acelerar();
        carro4.acelerar();
        
        // como já temos o método acelerar, ele já mostra os atributos
        // para usarmos o getter, vamos fazer5 a seguinte linha
        
        Carro carro5 = new Carro ("Fiat");
        carro5.setCor("Bege");
        
        
        //agora vamos usar um getter para mostrar a cor
        System.out.println("A cor do carro 5 é: " +carro5.getCor());
        
    }
}
