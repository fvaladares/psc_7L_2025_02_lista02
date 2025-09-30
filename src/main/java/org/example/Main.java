package org.example;


import org.example.model.ContaDeLuz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaDeLuz contaDeLuz = new ContaDeLuz();
        contaDeLuz.executar(new Scanner(System.in));
    }
}