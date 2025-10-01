package org.example.model;

import java.util.Scanner;

public class ExemplosWhile {
    public void executarWhileSimples(Scanner input) {
        int opt = 0; // variáve de controle do loop.

        while (opt != -1) {
            System.out.println("Olá!!");
            System.out.println("Informe um número " +
                    "inteiro (-1 para sair)");
            opt = input.nextInt();
        }

        System.out.println("FIM DO PROGRAMA");
    }


    public void executarWhileVAriavelBooleana(Scanner input) {
        boolean loginValido = false;
//        while(variavelControle == true)
        while (!loginValido) {
            String login;
            System.out.println("Informe o login");
            login = input.nextLine();
            if (!login.equalsIgnoreCase("FABRICIO")) {
                loginValido = true;
            }
        }
    }

    public void executarImpressaoDeUmAte10(Scanner input) {
        int contador = 1;

        while (contador <= 10) {
            System.out.println(contador);
//            contador = contador + 1;
            contador++; // equivalente a contador = contador + 1;
        }
    }
}
