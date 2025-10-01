package org.example.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FaturaEnergiaEletrica {
    public void executar(Scanner input) {
        // Pode ser feito dentro do main!!!!
        Scanner input2 = new Scanner(System.in);
        double consumoKWh;
        double valorAPagar;

        System.out.println("Informe o consumo Kwh");
        consumoKWh = input.nextDouble();

        // Cálculo do consumo em R$
        if (consumoKWh <= 100) {
            valorAPagar = consumoKWh * 0.50;
        } else if (consumoKWh <= 200) {
            valorAPagar = consumoKWh * 0.70;
        } else {
            valorAPagar = consumoKWh * 0.90;
        }

        // Regras adicionais
        if (valorAPagar < 30) {
            System.out.println("VALOR NÃO SERÁ COBRADO ESTE MÊS, " +
                    "VIRÃ ADICIONADO À FATURA DO MÊS SEGUINTE");

        } else if (valorAPagar > 200) {
            double valorComDesconto = valorAPagar * 0.9;
            System.out.println("Valor da fatura R$" +
                    valorAPagar + " VALOR A SER PAGO COM DESCONTO R$" +
                    valorComDesconto);
            if (consumoKWh > 500)
                System.out.println("CONSUMO ELEVADO: CONSIDERE ECOMIZAR ENERGIA");
        }

    }
}
