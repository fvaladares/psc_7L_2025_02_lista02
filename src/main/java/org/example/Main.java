package org.example;


import org.example.model.ContaDeLuz;
import org.example.model.Financiamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ContaDeLuz contaDeLuz = new ContaDeLuz();
//        contaDeLuz.executar(new Scanner(System.in));
        Financiamento financiamento = new Financiamento();
        financiamento.executar(new Scanner(System.in));
    }
}