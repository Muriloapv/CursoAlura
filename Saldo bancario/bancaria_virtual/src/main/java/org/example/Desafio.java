package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Desafio {
    public static void main(String[] args) {

        String nome= "Clark Kente";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***********************************************");
        System.out.println("-         Nome do cliente:  " + nome);
        System.out.println("-         Tipo de conta: " +tipoConta);
        System.out.println("-         Saldo Atual:  " + saldo);
        //loop do menu (inicio)
        String menu = """
                ***************************************
                -         Digite sua opção
                -         1) Consultar Saldo
                -         2) Transferir valor
                -         3) Receber valor
                -         4) Sair
                ***************************************       
                """;
        //loop do menu
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if(opcao == 2){
                System.out.println("Qual valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficente para realizar transferencia ");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }

            } else if (opcao ==  3){
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção invalida!");
            }

        }
        //fim do loop relacionado as opções do menu
    }
}