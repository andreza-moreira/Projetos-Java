package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        menuPrincipal();
        menuContaBancaria();

        /* conta1.mostrarInformacoes();
        conta1.depositar(12000);
        conta1.mostrarInformacoes();
        conta1.sacar(5000);
        conta1.mostrarInformacoes(); */

        // vamos criar novos métodos dentro do main

    } // fim do metodo main

    public static void menuPrincipal() {

        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "** SISTEMA BANCÁRIO ** \n\n" +
                    "1. Conta Bancária\n" +
                    "2. Conta Corrente\n" +
                    "3. Conta Poupança\n" +
                    "0. Sair\n\n" +
                    "Digite a opção desejada"));

            switch (opcao){

                case 1:
                    JOptionPane.showMessageDialog(null, "Menu Conta Bancária");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Menu Conta Corrente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Menu Conta Poupança");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }
        while(opcao!=0);

    } // fim do método menu prinicipal


    public static void menuContaBancaria() {
        ContaBancaria conta1 = new ContaBancaria("Jubileu Vorcaro", 1);
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "** SISTEMA BANCÁRIO ** \n\n" +
                    "1. Consulta Saldo\n" +
                    "2. Depositar\n" +
                    "3. Sacar\n" +
                    "0. Voltar ao manu anterior\n\n" +
                    "Digite a opção desejada: "));

            switch (opcao){

                case 1:
                    // JOptionPane.showMessageDialog(null, "Consultar Saldo.....");
                    JOptionPane.showMessageDialog(null, "Conta número "+conta1.getNumero()+
                    "titular: "+conta1.getTitular()+
                    "Saldo R$ "+conta1.getSaldo());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Menu Depositar");
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null,""));
                    conta1.depositar(valor);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Menu Sacar");
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null,""));
                    conta1.sacar(valor);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }
        while(opcao!=0);

    }
} // fim da classe main

