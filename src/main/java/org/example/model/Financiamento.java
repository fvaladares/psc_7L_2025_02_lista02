package org.example.model;

import java.util.Scanner;

public class Financiamento {
    public void executar(Scanner input) {
        double rendaMensal;
        double valorPrestacao;
        double limiteParcela;

        System.out.print("Informe sua renda mensal: ");
        rendaMensal = input.nextDouble();
        System.out.println();

        System.out.print("Informe o valor da parcela: ");
        valorPrestacao = input.nextDouble();
        System.out.println();

        limiteParcela = rendaMensal * 0.3;

        if( valorPrestacao > limiteParcela ) {
            System.out.println("O valor da prestação não pode" +
                    " ultrapassar 30% de sua renda.");
            System.out.println("Financiamento negado por baixa" +
                    " renda.");
        } else if (valorPrestacao > 3000 && rendaMensal < 10000) {
            System.out.println("O valor da parcela exige renda " +
                    "mínima de R$10000,00.");
            System.out.println("Financiamento negado por alta" +
                    " prestação.");
        } else  {
            System.out.println("Financiamento aprovado");
        }
    }
}
