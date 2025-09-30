package org.example.model;

import java.util.Scanner;

public class ContaDeLuz {
    public void executar(Scanner input) {
        double valorFatura;
        double consumoKWh;
        double valorFaturaComDesconto;

        System.out.print("Informe o consumo energético em KWh: ");
        consumoKWh = input.nextDouble();
        System.out.println();

        if (consumoKWh <= 100) {
            valorFatura = consumoKWh * 0.5;
        } else if (consumoKWh <= 200) {
            valorFatura = consumoKWh * 0.7;
        } else {
            valorFatura = consumoKWh * 0.9;
        }

        if (valorFatura < 30) {
            System.out.println("Sua fatura tem valor inferior a R$30,00," +
                    " e será cobrado no próximo mês");
        } else if (valorFatura > 200) {
            valorFaturaComDesconto = valorFatura * 0.9;
            System.out.println("Valor da fatura: R$" + valorFatura +
                    " valor a ser pago, com desconto de 10%" +
                    " R$" + valorFaturaComDesconto);
            if (consumoKWh > 500) {
                System.out.println("CONSUMO ELEVADO: CONSIDERE ECONOMIZAR ENERGIA.");
            }
        } else {
            System.out.println("O valor de sua fatura ẽ de R$" + valorFatura);
        }
    }
}
