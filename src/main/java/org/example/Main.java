package org.example;


import org.example.model.ContaDeLuz;
import org.example.model.ExemplosWhile;
import org.example.model.FaturaEnergiaEletrica;
import org.example.model.Financiamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FaturaEnergiaEletrica faturaEnergiaEletrica = new FaturaEnergiaEletrica();

        faturaEnergiaEletrica.executar(new Scanner(System.in));

//        ExemplosWhile exemplosWhile = new ExemplosWhile();
//
////        exemplosWhile.executarWhileSimples(new Scanner(System.in));
//        exemplosWhile.executarWhileVAriavelBooleana(new Scanner(System.in));
//        int opt = 2;
//
//        switch (opt) {
//            case 1 -> {
//                System.out.println("UM");
//                System.out.println("Linha 2");
//            }
//
//            case 2 ->
//                System.out.println("DOIS");
//
//            default ->
//                System.out.println("Invãlido");
//
//        }
////        ContaDeLuz contaDeLuz = new ContaDeLuz();
////        contaDeLuz.executar(new Scanner(System.in));
//        Financiamento financiamento = new Financiamento();
//        financiamento.executar(new Scanner(System.in));
    }
}