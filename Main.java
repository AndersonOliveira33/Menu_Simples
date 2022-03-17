package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (true) {
            System.out.println(" |            MENU           |");
            System.out.println(" |           Opções:         |");
            System.out.println(" |        1. Opçõe: 1        |");
            System.out.println(" |        2. Opção: 2        |");
            System.out.println(" |        3. Sair            |");
            Scanner menu = new Scanner(System.in);
            System.out.println(" Selecione uma opcao: ");
            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("selecão inválida");
            }
        }
    }
}