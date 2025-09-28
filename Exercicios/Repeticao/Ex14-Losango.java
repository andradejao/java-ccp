package com.mycompany.losango;

import java.util.Scanner;

public class Losango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para desenhar o losango: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número precisa ser ímpar!");
            return;
        }

        int meio = numero / 2;

        for (int i = 0; i <= meio; i++) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = meio - 1; i >= 0; i--) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
